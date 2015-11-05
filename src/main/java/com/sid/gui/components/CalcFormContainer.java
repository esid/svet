package com.sid.gui.components;

import com.sid.Calc;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcFormContainer extends JPanel {
    private JTextField currentMField;
    private JTextField prevMField;
    private JLabel currentMFieldLabel;
    private JLabel prevMFieldLabel;
    private JButton calculateBtn;
    private JLabel resultLabel;

    private CompoundBorder border;
    private GridBagLayout layout;
    private GridBagConstraints gc;

    public CalcFormContainer() {
        currentMField = new JTextField(15);
        prevMField = new JTextField(15);
        currentMFieldLabel = new JLabel("Current month: ");
        prevMFieldLabel = new JLabel("Previous month: ");
        calculateBtn = new JButton("Calculate");
        calculateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                double result = CalculateSvet();
                ShowResult(result);
            }
        });
        resultLabel = new JLabel();
        resultLabel.setVisible(false);


        border = createBorder();

        layout = new GridBagLayout();
        gc = new GridBagConstraints();

        setLayout(layout);
        setBorder(border);
        setElements();
    }

    private void ShowResult(double result) {
        resultLabel.setText(String.valueOf(result) + " hr");
        resultLabel.setVisible(true);

    }

    private double CalculateSvet() {
        resultLabel.setText("");
        resultLabel.setVisible(false);

        int current = Integer.parseInt(currentMField.getText());
        int previous = Integer.parseInt(prevMField.getText());
        double res = Calc.Calculate(current, previous);
        return res;
    }

    private CompoundBorder createBorder() {
        Border out = BorderFactory.createEmptyBorder(15,15,15,15);
        Border named = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Calculate the svet payment");
        return BorderFactory.createCompoundBorder(out, named);
    }

    private void setElements() {
        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 1;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_START;

        /////// set current ///
        currentMFieldLabel.setFont(new Font(currentMFieldLabel.getFont().getName(), Font.PLAIN, 16));
        gc.weighty = 0.3;
        gc.insets = new Insets(12, 12, 0, 0);
        add(currentMFieldLabel, gc);

        gc.gridx = 1;
        add(currentMField, gc);

        /////// set previous ///
        prevMFieldLabel.setFont(new Font(prevMFieldLabel.getFont().getName(), Font.PLAIN, 16));
        gc.weighty = 0.3;
        gc.gridy = 1;
        gc.gridx = 0;
        gc.insets = new Insets(0, 12, 0, 0);
        add(prevMFieldLabel, gc);

        gc.gridx = 1;
        add(prevMField, gc);

        /////// set button///
        calculateBtn.setFont(new Font(calculateBtn.getFont().getName(), Font.PLAIN, 16));
        gc.weighty = 1.0;
        gc.gridy = 2;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(30, 12, 0, 0);
        add(calculateBtn, gc);

        //// add resultLabel label////
        resultLabel.setFont(new Font(resultLabel.getFont().getName(), Font.PLAIN, 18));
        gc.gridx = 1;
        add(resultLabel, gc);

    }
}
