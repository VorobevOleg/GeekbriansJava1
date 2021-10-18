package ru.geekbrainsJava1.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumber extends JFrame {
    private int randomNumber;
    private int buttonWinIndex = 1;
    private JTextField textField;
    private int attempts = 0;

    public GuessNumber() {
        randomNumber = (int)(Math.random() * 10) + 1; // [1 ; 10]

        setTitle("Guess the number");
        setBounds(600, 300, 600, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        textField.setText("Программа загадала число от 1 до 10");
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial", Font.PLAIN, 18);
        textField.setFont(font);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        add(buttonsPanel, BorderLayout.CENTER);

        JButton[] button = new JButton[11];

        JButton buttonRestart = new JButton("Перезапуск игры");
        buttonRestart.setFont(font);
        buttonRestart.setBackground(Color.WHITE);
        add(buttonRestart, BorderLayout.SOUTH);

        for (int i = 1; i <= 10; i++) {
            button[i] = new JButton(String.valueOf(i));
            button[i].setFont(font);
            button[i].setBackground(Color.WHITE);
            buttonsPanel.add(button[i]);
            int buttonIndex  = i;
            button[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(buttonIndex, button[buttonIndex]);
                }
            });
        }

        buttonRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { restartTheGame(button[buttonWinIndex]);}
        });

        setVisible(true);
    }

    public void tryToAnswer(int answer, JButton button) {
        attempts += 1;
        if (attempts >= 3) {
            textField.setText(" 3 попытки израсходованы!");
            return;
        }
        if(answer == randomNumber) {
            textField.setText("Вы угадали! Ответ: " + randomNumber);
            button.setBackground(Color.GREEN);
            buttonWinIndex = answer;

        } else if(answer > randomNumber) {
            textField.setText("Не угадали! Загадонное число меньше");
        } else {
            textField.setText("Не угадали! Загадонное число больше");
        }
    }

    public void restartTheGame(JButton button) {
        randomNumber = (int)(Math.random() * 10) + 1; // [1 ; 10]
        button.setBackground(Color.WHITE);
        textField.setText("Новая игра началась!");
        attempts = 0;
    }
}
