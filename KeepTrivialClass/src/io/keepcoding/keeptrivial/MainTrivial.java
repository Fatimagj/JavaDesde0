package io.keepcoding.keeptrivial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MainTrivial {
	
	public static void main(String [] args) {
	
		// Initialize questions
		ArrayList<Question> questions = getQuestions();
		// initialize teams
		ArrayList<Team> teams = configureTeams();
		boolean exit = false;
		
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			do {
				for (Team equipo : teams) {
					//Cambiar el turno del equipo
					System.out.println("");
                	System.out.println("###############################");
                    System.out.println("Turno del equipo: " + equipo.getNameTeam());
			
			
					//Mostrar preguntas
						//Para esto primero seleccionamos un tema alatorio y luego una pregenta de ese tema
					String topic = selectRandomTopic(teams.get(0), questions);
					Question text = getRandomQuestion(topic, questions);

				
				    //Mostrar la pregunta seleccionada aleatoreamente
					System.out.println("");
					System.out.println("Pregunta: " + text.getText());
					System.out.println("1. " + text.getAnswer1());
					System.out.println("2. " + text.getAnswer2());
					System.out.println("3. " + text.getAnswer3());
					System.out.println("4. " + text.getAnswer4());
					
					int answer = -1;
					while (answer < 1 || answer > 4) {
						System.out.println("");
						System.out.print("Indica la respuesta correcta: ");
						try {
							answer = Integer.parseInt(reader.readLine());
							if (answer < 1 || answer > 4) {
								System.out.println("No ha seleccionado una opción correcta");
							}
						} catch (NumberFormatException e) {
							System.out.println("No ha selecionado una opción correcta");
						}
					}
				
					// Mostrar resultado
	                if (answer == text.getCorrectAnswer()) {
	                   System.out.println("¡Correcto!");
	                   if (!equipo.getQuesitos().contains(topic)) {
	                        equipo.getQuesitos().add(topic);
	                   }
	                } else {
	                    System.out.println("No es correcto. La respuesta correcta es: " + text.getCorrectAnswer());
	                }

	                //Comprobar si hay ganador.
	                if (teams.get(0).getQuesitos().size() == 5) {
	                	String winningTeam = teams.get(0).getNameTeam();
	                    exit = true;
	                    title("El equipo ganador es: " + winningTeam);
	                    break;
	                }
				
	                //Mostrar clasificación.
	                showScores(teams);
			   }
			} while(!exit);
			
		} catch (IOException e) {
				System.out.println("Error");
				e.printStackTrace();
		}
	}



	public static void title(String text) {
		int length = text.length();
		printHashtagLine(length + 4); 

		System.out.println("# " + text + " #");
		
		printHashtagLine(length + 4);
	}
	
	public static void printHashtagLine(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print("#");
		}
		System.out.println();
	}
	
	public static boolean esTransformableAEntero(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	
	private static int getRandomInt(int max) {
		return new Random().nextInt(max);
	}
	
	
	private static ArrayList<Question> getQuestions() {
		ArrayList<Question> list = new ArrayList<>();
		
		File folder = new File("questions");
	    if (!folder.exists()) {
            title("Error al cargar el fichero");
	    } else {
	      	File[] filesList = folder.listFiles();

            for (File file : filesList) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                	String topicName = file.getName().substring(0, file.getName().length() - 4);
	                // TODO create topic
	                String topic = createTopic(topicName);
	                    
	                // Read the question
	                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                        String line;
                        List<String> block = new ArrayList<>();

	                    while ((line = br.readLine()) != null) {
                      		block.add(line);

	                        if (block.size() == 6) { 
	                            var question = block.get(0);
	                            var answer1 = block.get(1);
	                            var answer2 = block.get(2);
	                            var answer3 = block.get(3);
	                            var answer4 = block.get(4);
	                            var rightOption = Integer.parseInt(block.get(5));
	                                
	                            // TODO create question and TODO Add to list
	                            Question q = new Question(
	                            		question, 
	                                	answer1, 
	                                	answer2, 
	                                	answer3, 
	                                	answer4, 
	                                	rightOption,
	                                	topic
	                               		);
	                            list.add(q);
	                            block.clear();
	                        }
	                    }
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	                  
	            }
	        }
	    }
	    return list; 
	}
		
	//Método que sirve para crear los temas con los nombres de los archivos.
	private static String createTopic(String topicName) {
		return topicName;
	}
		
	//Método para configuarar los equipos al inicio del juego.
	private static ArrayList<Team> configureTeams() {
		ArrayList<Team> teams = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		try {
			System.out.println("¿Cuántos equipos sois?: ");
			int numberOfTeams = Integer.parseInt(reader.readLine());
		
			for (int i = 0; i < numberOfTeams; i++) {
				System.out.println("");
				System.out.println("Indique el nombre del equipo " + (i + 1) + ":");
				String nameTeam = reader.readLine();
				teams.add(new Team(nameTeam));
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		return teams;
	}
	
	//1º método para seleccionar primero un tema alatorio y 2º método para luego una pregunta aleatoria de ese tema.
	private static String selectRandomTopic(Team equipo, ArrayList<Question> questions) {
		List<String> topics = new ArrayList<>();
		for (Question question : questions) {
			if (!equipo.getQuesitos().contains(question.getTopic()) && !topics.contains(question.getTopic())) {
				topics.add(question.getTopic());
			}
		}
		return topics.get(getRandomInt(topics.size()));
	}
	private static Question getRandomQuestion(String topic, ArrayList<Question> questions) {
		List<Question> topicQuestions = new ArrayList<>();
		for (Question question : questions) {
			if (question.getTopic().equals(topic)) {
				topicQuestions.add(question);
			}
		}
		return topicQuestions.get(getRandomInt(topicQuestions.size()));
	}
	
	//Método para mostrar la clasificación después de cada pregunta de los equipos.
	private static void showScores(ArrayList<Team> teams) {
		System.out.println("");
		System.out.println("Clasificación actual");
		for (Team team : teams) {
			System.out.println(team.getNameTeam() + ": " + team.getQuesitos().size() + " quesitos");
		}
	}	
}
