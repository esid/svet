package com.sid.gui.components;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CalcFormContainer extends JPanel {
    private JTextField CurrentMField;
    private JTextField PrevMField;
    private JLabel CurrentMFieldLabel;
    private JLabel PrevMFieldLabel;
    private JButton Culculate;
    private JLabel ErrorMessage;

    private GridLayout layout;

    public CalcFormContainer() {
        CurrentMField = new JTextField();
        PrevMField = new JTextField();
        CurrentMFieldLabel = new JLabel("Current month: ");
        PrevMFieldLabel = new JLabel("Previous month: ");
        Culculate = new JButton("Culculate");
        ErrorMessage = new JLabel();

        //CurrentMField.setPreferredSize(new Dimension(1, 2));
        //CurrentMField.setMaximumSize(new Dimension(1, 2));
        setMaximumSize(new Dimension(20, 30));
        setMinimumSize(new Dimension(20, 30));
        setPreferredSize(new Dimension(20, 30));

        layout= new GridLayout(2,1);
        layout.setHgap(5);
        layout.setVgap(6);


        setLayout(layout);
        setElements();
        Border border = BorderFactory.createTitledBorder("Calculate the svet payment");
        setBorder(border);
    }

    private void setElements() {

        JPanel CurrM = new JPanel(new FlowLayout(FlowLayout.LEFT));
        CurrM.setSize(new Dimension(12,12));
        CurrM.setVisible(true);
        CurrM.add(CurrentMFieldLabel);
        CurrM.add(CurrentMField);
        JPanel PrevM = new JPanel(new FlowLayout(FlowLayout.LEFT));
        PrevM.setSize(450, 50);
        PrevM.setVisible(true);
        PrevM.add(PrevMFieldLabel);
        PrevM.add(PrevMField);

        CurrentMFieldLabel.setFont(new Font(CurrentMFieldLabel.getFont().getName(), Font.PLAIN, 14));
        PrevMFieldLabel.setFont(new Font(PrevMFieldLabel.getFont().getName(), Font.PLAIN, 14));

        CurrentMField.setBounds(1, 2, 3, 4);
        add(CurrM, 0);
        add(PrevM, 1);
       /* add(CurrentMFieldLabel, 0);
        add(CurrentMField, 1);
        add(PrevMFieldLabel, 2);
        add(PrevMField, 3);
        add(Culculate, 4);
        add(ErrorMessage, 5);  */

    }
}
