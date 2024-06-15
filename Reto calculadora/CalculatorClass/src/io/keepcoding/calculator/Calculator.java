package io.keepcoding.calculator;

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField inputScreen;
    private JButton[] numbers = new JButton[10];
    private JButton[] functions = new JButton[4];
    private JButton addButton, subButton, mulButton, divButton;
    private JButton decButton, equButton, delButton, clrButton;
    private JPanel panel;

    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public Calculator() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 550);
        this.setLayout(null);

        inputScreen = new JTextField();
        inputScreen.setBounds(50, 25, 300, 50);
        inputScreen.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        functions[0] = addButton;
        functions[1] = subButton;
        functions[2] = mulButton;
        functions[3] = divButton;

        for (int i = 0; i < 4; i++) {
            functions[i].addActionListener(this);
            functions[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numbers[i] = new JButton(String.valueOf(i));
            numbers[i].addActionListener(this);
            numbers[i].setFocusable(false);
        }

        delButton.addActionListener(this);
        clrButton.addActionListener(this);
        decButton.addActionListener(this);
        equButton.addActionListener(this);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numbers[1]);
        panel.add(numbers[2]);
        panel.add(numbers[3]);
        panel.add(addButton);
        panel.add(numbers[4]);
        panel.add(numbers[5]);
        panel.add(numbers[6]);
        panel.add(subButton);
        panel.add(numbers[7]);
        panel.add(numbers[8]);
        panel.add(numbers[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numbers[0]);
        panel.add(equButton);
        panel.add(divButton);

        this.add(panel);
        this.add(delButton);
        this.add(clrButton);
        this.add(inputScreen);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numbers[i]) {
                inputScreen.setText(inputScreen.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == decButton) {
            inputScreen.setText(inputScreen.getText().concat("."));
        }

        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(inputScreen.getText());
            operator = '+';
            inputScreen.setText("");
        }

        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(inputScreen.getText());
            operator = '-';
            inputScreen.setText("");
        }

        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(inputScreen.getText());
            operator = '*';
            inputScreen.setText("");
        }

        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(inputScreen.getText());
            operator = '/';
            inputScreen.setText("");
        }

        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(inputScreen.getText());
            
            // TODO make calculations
            
            inputScreen.setText(num1 + " " + operator + " " + num2);
            num1 = result;
        }

        if (e.getSource() == clrButton) {
            inputScreen.setText("");
        }

        if (e.getSource() == delButton) {
            String string = inputScreen.getText();
            if (string != null && string.length() > 0) {
                inputScreen.setText(string.substring(0, string.length() - 1));
            } else {
                inputScreen.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}