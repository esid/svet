package com.sid.gui.components;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel {
    JButton closeButton;
    FlowLayout layout;
    private JLabel ErrorMessage;

    public FooterPanel(JFrame main) {
        closeButton = new JButton("Close");
        ErrorMessage = new JLabel("Error");
        ErrorMessage.setVisible(false);

        layout = new FlowLayout();
        layout.setAlignment(FlowLayout.RIGHT);
        layout.setHgap(15);

        setPreferredSize(new Dimension(main.getWidth(), 50));
        setLayout(layout);

        add(ErrorMessage);
        add(closeButton);
    }
}
