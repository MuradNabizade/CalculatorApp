package com.muradn;

import javax.swing.*;
import java.awt.*;


public class CalculatorApp extends JFrame{
    private JPanel mainPanel;
    public static void main(String[] args) {
        JFrame frame=new CalculatorAppGui("Calculator");

        frame.setSize(400,500);
        frame.setBackground(new Color(24, 19, 187));
        frame.setVisible(true);

    }

}
