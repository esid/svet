package com.sid.gui.components;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    CalcFormContainer container;

    public MainFrame() throws HeadlessException {
        super("Svet calculator");

        container = new CalcFormContainer();
        add(container);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 500);
        setVisible(true);
    }
}
