package com.muradn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorAppGui extends JFrame {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton xButton;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a2Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton EqualButton;
    private JButton buttonDiv;
    private JButton clearButton;
    private JButton DELButton;
    private JTextField CelsiusTextField;
    private JButton ConvertButton;
    private JLabel faranheit;

    double num1=0,num2=0,result=0;
    char operator;

    public CalculatorAppGui(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        Font myFont = new Font("Ink Free",Font.BOLD,30);
        textField1.setFont(myFont);
        //textfield.setEditable(false);

        a0Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat(String.valueOf(0)));

            }
        });
        a1Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat(String.valueOf(1)));

            }
        });
        a2Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat(String.valueOf(2)));

            }
        });
        a3Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat(String.valueOf(3)));

            }
        });
        a4Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat(String.valueOf(4)));

            }
        });
        a5Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat(String.valueOf(5)));

            }
        });
        a6Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat(String.valueOf(6)));

            }
        });
        a7Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat(String.valueOf(7)));

            }
        });
        a8Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat(String.valueOf(8)));

            }
        });
        a9Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText().concat(String.valueOf(9)));

            }
        });

        //div mul plus min
        buttonDiv.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
                operator ='/';
                textField1.setText("");

            }
        });

        buttonMinus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
                operator ='-';
                textField1.setText("");

            }
        });
        buttonPlus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
                operator ='+';
                textField1.setText("");

            }
        });
        xButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField1.getText());
                operator ='*';
                textField1.setText("");

            }
        });
        //clear
        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        //Negative
//        negButton.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                double temp = Double.parseDouble(textField1.getText());
//                temp*=-1;
//                textField1.setText(String.valueOf(temp));
//            }
//        });
        DELButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String string = textField1.getText();
                textField1.setText("");
                for(int i=0;i<string.length()-1;i++) {
                    textField1.setText(textField1.getText()+string.charAt(i));
                }
            }
        });




        //equal
        EqualButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                num2=Double.parseDouble(textField1.getText());

                switch(operator) {
                    case'+':
                        result=num1+num2;
                        break;
                    case'-':
                        result=num1-num2;
                        break;
                    case'*':
                        result=num1*num2;
                        break;
                    case'/':
                        result=num1/num2;
                        break;
                }
                textField1.setText(String.valueOf(result));
                num1=result;
            }


        });










    }

}
