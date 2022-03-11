package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Tateti implements ActionListener {

    JFrame frame = new JFrame();
    JButton cd1 = new JButton("");
    JButton cd2 = new JButton("");
    JButton cd3 = new JButton("");
    JButton cd4 = new JButton("");
    JButton cd5 = new JButton("");
    JButton cd6 = new JButton("");
    JButton cd7 = new JButton("");
    JButton cd8 = new JButton("");
    JButton cd9 = new JButton("");
    ArrayList<JButton> buttons = new ArrayList<>();

    Tateti(){
        setCuadrados();
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setTitle("");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Player 1");
    }


    public void setCuadrados(){


        cd1.setBounds(160, 0,100,100);
        cd2.setBounds(270, 0, 100, 100);
        cd3.setBounds(380, 0, 100, 100);
        cd4.setBounds(160, 110, 100, 100);
        cd5.setBounds(270, 110, 100, 100);
        cd6.setBounds(380, 110, 100, 100);
        cd7.setBounds(160, 220, 100, 100);
        cd8.setBounds(270, 220, 100, 100);
        cd9.setBounds(380, 220, 100, 100);


        /*cd1.setBounds(0, 0,100,100);
        cd2.setBounds(110, 0, 100, 100);
        cd3.setBounds(220, 0, 100, 100);
        cd4.setBounds(0, 110, 100, 100);
        cd5.setBounds(110, 110, 100, 100);
        cd6.setBounds(220, 110, 100, 100);
        cd7.setBounds(0, 220, 100, 100);
        cd8.setBounds(110, 220, 100, 100);
        cd9.setBounds(220, 220, 100, 100);*/

        cd1.setFocusable(false);
        cd2.setFocusable(false);
        cd3.setFocusable(false);
        cd4.setFocusable(false);
        cd5.setFocusable(false);
        cd6.setFocusable(false);
        cd7.setFocusable(false);
        cd8.setFocusable(false);
        cd9.setFocusable(false);

        cd1.addActionListener(this);
        cd2.addActionListener(this);
        cd3.addActionListener(this);
        cd4.addActionListener(this);
        cd5.addActionListener(this);
        cd6.addActionListener(this);
        cd7.addActionListener(this);
        cd8.addActionListener(this);
        cd9.addActionListener(this);

        frame.add(cd1);
        frame.add(cd2);
        frame.add(cd3);
        frame.add(cd4);
        frame.add(cd5);
        frame.add(cd6);
        frame.add(cd7);
        frame.add(cd8);
        frame.add(cd9);

        buttons.add(cd1);
        buttons.add(cd2);
        buttons.add(cd3);
        buttons.add(cd4);
        buttons.add(cd5);
        buttons.add(cd6);
        buttons.add(cd7);
        buttons.add(cd8);
        buttons.add(cd9);

        frame.setTitle("Player 1");
    }

    int i = 9;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (i <= 0){
            return;
        }

        JButton button = (JButton) e.getSource();

        if(i%2 == 1){
            frame.setTitle("Player 2");
            System.out.println("Player 1");
            if(!buttonIsEmpty(e)){return;}
            button.setText("X");


        }else{

            System.out.println("Player 2");
            if(!buttonIsEmpty(e)){return;}
            button.setText("O");
            frame.setTitle("Player 1");
        }
        button.setFont(new Font("INK Free", Font.BOLD, 30));

        if(i < 6){

            System.out.println("Check");
            if(check()){
                if(i%2 == 1){
                    frame.setTitle("Ganador Jugador 1");
                    frame.setFont(new Font("INK Free", Font.BOLD, 30));

                }else{
                    frame.setTitle("Ganador Jugador 2");
                }
                i = 0;
            }
        }

        if(i == 1){
            frame.setTitle("Empate");
            i = 9;
            clearCds();
            frame.setTitle("Jugador 1");
        }

        i-=1;
    }


    public boolean buttonIsEmpty(ActionEvent event) {

        JButton cd = (JButton) event.getSource();

        String text = cd.getText();

        if (text.length() > 0) {
            return false;
        } else {
            return true;
        }
    }


    public boolean check(){

        String[][] arr = new String[3][3];

        arr[0][0] = cd1.getText();
        arr[0][1] = cd2.getText();
        arr[0][2] = cd3.getText();

        arr[1][0] = cd4.getText();
        arr[1][1] = cd5.getText();
        arr[1][2] = cd6.getText();

        arr[2][0] = cd7.getText();
        arr[2][1] = cd8.getText();
        arr[2][2] = cd9.getText();


        int a = 0;
        int b = 1;
        int c = 2;
        int count = 0;
        int d = 0;
        int e = 0;

        for (int i = 0; i < 6; i++) {

            if (count == 3){i = 0; b = 0; c = 0; d = 1; e = 2;}
            else if(count == 4){i = 0; a = 1; b = 1; c = 1;}
            else if(count == 5){i = 0; a = 2; b = 2; c = 2;}
            else if (count == 6){i = 0; a = 0; b = 1;}
            else if(count == 7){i = 2; b = 1; c = 2; d = -1; e = -2;}
            else if (count == 8){break;}

            if(Objects.equals(arr[i][a], arr[i+d][b]) && Objects.equals(arr[i][a], arr[i+e][c])){

                if (Objects.equals(arr[i][a], "X") || Objects.equals(arr[i][a], "○")){
                    return true;
                }
                else{
                    return false;
                }
            }
            count ++;
        }

        return false;

    }

    public void clearCds(){

        for (JButton button : buttons) {
            button.setText("");
        }
    }
}
