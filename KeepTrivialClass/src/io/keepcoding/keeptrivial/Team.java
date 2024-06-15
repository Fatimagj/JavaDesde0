package io.keepcoding.keeptrivial;

import java.util.ArrayList;
import java.util.List;

class Team {
	private String nameTeam;
	private List<String> quesitos;
		
	public Team(String nameTeam) {
		this.nameTeam = nameTeam;
		this.quesitos = new ArrayList<>();
	}
	
	public Team(String nameTeam, List<String> quesitos) {
		this.nameTeam = nameTeam;
		this.quesitos = new ArrayList<>();
	}
	//getters and setters
	public String getNameTeam() {
		return nameTeam;
		}

	public List<String> getQuesitos() {
		return quesitos;
	}

	/*
	//métodos para los temas/quesitos, para evitar preguntas duplicadas
	public void addQuesito(String quesito) {
		if (!quesitos.contains(quesito));
			quesitos.add(quesito);
	}
	*/
}

		
