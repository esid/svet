package com.sid.gui.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FooterPanel extends JPanel {

    JFrame mainFrame;
    JButton closeButton;
    FlowLayout layout;
    private JLabel ErrorMessage;


    public FooterPanel(JFrame main) {
        mainFrame = main;
        
        closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainFrame.dispose();
            }
        });


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
