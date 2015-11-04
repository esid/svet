package com.sid.gui.components;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private UpperPanel upper;
    private CalcFormContainer container;
    private FooterPanel footer;
    private BorderLayout layout;

    public MainFrame() throws HeadlessException {
        super("Svet calculator");

        layout = new BorderLayout();


        upper = new UpperPanel(this);
        container = new CalcFormContainer();
        footer = new FooterPanel(this);
        setLayout(layout);

        add(upper, BorderLayout.NORTH);
        add(container, BorderLayout.CENTER);
        add(footer, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 450);
        setResizable(false);
        setVisible(true);
    }
}
