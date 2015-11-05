package com.sid;

import com.sid.gui.components.MainFrame;

import javax.swing.*;

public class Svet
{
    public static void main( String[] args )
    {

        SwingUtilities.invokeLater( new Runnable() {
            public void run() {  new MainFrame(); }
        });


    }
}


