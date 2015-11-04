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

        /*DataProcessor dp = new DataProcessor();

        try {
            dp.printAllRecords();
           // dp.addInfo(new IpInfo("10.0.011", "my", "Myland"));
            System.out.print(String.format("The last record is: %s", dp.getLast().toString()));
        } catch (IOException e){
            e.printStackTrace();
        }
*/


    }
}


