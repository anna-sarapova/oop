package com.company.lab9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.geom.Arc2D;

public class Calculator007 {

    private double var1 = 0.0;
    private double var2 = 0.0;
    private char math_operator;

    private JButton negativeButton;
    private JButton equalButton;
    private JButton decimalPointButton;
    private JButton a0Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton xButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton PlusButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton minusButton;
    private JButton divisionButton;
    private JButton ClearOneButton;
    private JButton clearAllButton;
    private JTextField TextField;
    private JLabel Error;
    private JPanel Calculator;

    private void getOperator(String buttonText){
        math_operator = buttonText.charAt(0);
        try {
            var1 = var1 + Double.parseDouble(TextField.getText());
        }
        catch(Exception error) {
            Error.setText("Invaaaalid Input");
            TextField.setText("");
        }
        TextField.setText("");
    }

    private void CheckVar2(double number) throws DivideBy0, DivideBy13{
        if (number == 0){
            throw new DivideBy0();
        }
        else if (number == 13){
            throw new DivideBy13();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator007");
        frame.setContentPane(new Calculator007().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Calculator007() {
        negativeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               double temporar = Double.parseDouble(TextField.getText());
               temporar = temporar * (-1);
               TextField.setText(String.valueOf(temporar));
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + "0");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + "3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + "6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + "9");
            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    CheckVar2(Double.parseDouble(TextField.getText()));
                } catch (DivideBy0 error){
                    Error.setText("U felt infinity ∞");
                } catch (DivideBy13 error) {
                    Error.setText("Death Number");
                }
            try {
                var2 = var1 / Double.parseDouble(TextField.getText());
            } catch (Exception error){
                Error.setText("Invallllid Input");
            }
            TextField.setText(Double.toString(var2));
            var1 = 0;
            TextField.setText(Double.toString(var2));
            }
        });
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String button_text = divisionButton.getText();
            getOperator(button_text);
            }
        });
        decimalPointButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if (TextField.getText().equals("")){
                TextField.setText("0.");
            }
            else if (TextField.getText().contains(".")){
                decimalPointButton.setEnabled(false);
            }
            else
            { String decimalPointText = TextField.getText() + decimalPointButton.getText();
                TextField.setText(decimalPointText);
            }
            decimalPointButton.setEnabled(true);
            }
        });
        clearAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var2 = 0;
                TextField.setText("");
                Error.setText("");
            }
        });
    }
}
