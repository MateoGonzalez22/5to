package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Inicio implements ActionListener {

    JFrame frame = new JFrame();
    JButton inicio = new JButton();
    JButton salir = new JButton();
    JButton lista = new JButton();
    JLabel text1 = new JLabel();

    Inicio(){
        frame.add(text1);
        frame.add(inicio);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Inicio");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        text1.setText("Bienvenido al TA-TE-TI");
        text1.setFont(new Font("Jazz LET", Font.PLAIN, 18));
        text1.setForeground(Color.WHITE);
        text1.setBounds(240, 20, 200, 50);

        frame.setVisible(true);
        inicio.setFocusable(false);
        inicio.setText("Jugar");
        inicio.setBounds(250, 200, 100, 50);
        inicio.addActionListener(this);


    }



    public void actionPerformed(ActionEvent e){


        if(e.getSource() == inicio){

            frame.dispose();
            Tateti tateti = new Tateti();

        }


    }


}
