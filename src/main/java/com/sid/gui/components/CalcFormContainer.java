package com.sid.gui.components;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.*;

public class CalcFormContainer extends JPanel {
    private JTextField CurrentMField;
    private JTextField PrevMField;
    private JLabel CurrentMFieldLabel;
    private JLabel PrevMFieldLabel;
    private JButton CalculateBtn;

    private CompoundBorder border;
    private GridBagLayout layout;
    private GridBagConstraints gc;

    public CalcFormContainer() {
        CurrentMField = new JTextField(15);
        PrevMField = new JTextField(15);
        CurrentMFieldLabel = new JLabel("Current month: ");
        PrevMFieldLabel = new JLabel("Previous month: ");
        CalculateBtn = new JButton("Calculate");


        border = createBorder();

        layout = new GridBagLayout();
        gc = new GridBagConstraints();

        setLayout(layout);
        setBorder(border);
        setElements();
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
        CurrentMFieldLabel.setFont(new Font(CurrentMFieldLabel.getFont().getName(), Font.PLAIN, 16));
        gc.weighty = 0.3;
        gc.insets = new Insets(12, 12, 0, 0);
        add(CurrentMFieldLabel, gc);

        gc.gridx = 1;
        add(CurrentMField, gc);

        /////// set previous ///
        PrevMFieldLabel.setFont(new Font(PrevMFieldLabel.getFont().getName(), Font.PLAIN, 16));
        gc.weighty = 0.3;
        gc.gridy = 1;
        gc.gridx = 0;
        gc.insets = new Insets(0, 12, 0, 0);
        add(PrevMFieldLabel, gc);

        gc.gridx = 1;
        add(PrevMField, gc);

        /////// set button///
        CalculateBtn.setFont(new Font(CalculateBtn.getFont().getName(), Font.PLAIN, 18));
        gc.weighty = 1.0;
        gc.gridy = 2;
        gc.gridx = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(30, 12, 0, 0);
        add(CalculateBtn, gc);


    }
}
