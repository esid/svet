package com.sid.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {
    private JPanel contentPane;
      private JButton buttonCancel;
    private JTextField CurrMonthF;
    private JTextField PrevMonthF;
    private JButton Calculate;
    private JTextField Sum;

    public MainWindow() {
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

        setSize(600, 500);
        setVisible(true);
    }


    private void onCancel() {
// add your code here if necessary
        dispose();

    }



}
