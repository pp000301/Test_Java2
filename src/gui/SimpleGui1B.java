package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui1B implements ActionListener{
    JButton button;

    public static void main(String[] args) {
        SimpleGui1B gui1B=new SimpleGui1B();
        gui1B.go();
    }

    public void go(){
        JFrame frame = new JFrame();//создаем фрейм и кнопку
        JButton button = new JButton("Click me");
        button.addActionListener(this::actionPerformed);// Регистрируем нашу заинтересованность в кнопке
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Эта строка завершает работу программы
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked");
    }
}
