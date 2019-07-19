package com.sid;

import com.sid.data.DataProcessor;
import com.sid.data.IpInfo;
import javax.swing.*;
import java.util.Arrays;

public class Svet
{
    public static void main( String[] args ) throws ClassNotFoundException,
            UnsupportedLookAndFeelException,
            InstantiationException, IllegalAccessException {
        Hasher hasher = new Hasher();
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater( () -> {
                hasher.setVisible(true);
                hasher.setLocationRelativeTo(null);
        });
    }
//
////
////            DataProcessor dp = new DataProcessor();
////
////        try {
////            dp.printAllRecords();
////           // dp.addInfo(new IpInfo("10.0.011", "my", "Myland"));
////            System.out.print(String.format("The last record is: %s", dp.getLast().toString()));
////        } catch (IOException e){
////            e.printStackTrace();
////        }
//
//
//
//    }
}


