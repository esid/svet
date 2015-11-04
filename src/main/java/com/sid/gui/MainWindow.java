package com.sid.gui;

import com.sid.Calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {
    private JPanel contentPane;
    private JButton buttonCancel;
    private JTextField CurrMonthF;
    private JTextField PrevMonthF;
    private JButton Calculate;
    private JLabel Sum;
    private JPanel ErrorPanel;
    private JLabel errorText;
    private JPanel CalcFormContainer;

    public MainWindow() {
        Prepare();
        Calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCalc();
            }
        });


        setSize(600, 500);
        setVisible(true);
    }

    private void onCalc(){

        int currRate = Integer.parseInt(CurrMonthF.getText());
        int prevRate = Integer.parseInt(PrevMonthF.getText());
        //ShowErrorMessage();
        double res = Calc.Calculate(currRate, prevRate);

        showResult(String.valueOf(res));
    }


    private void showResult(String resultValue) {
        Sum.setText("");
        Sum.setText(resultValue + " hrivnas");
    }

    private void ShowErrorMessage() {
        Font font = errorText.getFont();
        Font newFont = new Font(font.getName(), Font.BOLD, font.getSize() + 6);
        errorText.setText("Error so far!");
        errorText.setForeground(Color.RED);
        errorText.setFont(newFont);
    }

    private void onCancel() { dispose();}

    private void Prepare() {
        setContentPane(contentPane);
        pack();
        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

}
