package com.sid;

import com.sid.data.DataProcessor;
import com.sid.data.IpInfo;
import java.io.IOException;

public class Svet 
{
    public static void main( String[] args )
    {

            DataProcessor dp = new DataProcessor();

        try {
            dp.printAllRecords();
           // dp.addInfo(new IpInfo("10.0.011", "my", "Myland"));
            System.out.print(String.format("The last record is: %s", dp.getLast().toString()));
        } catch (IOException e){
            e.printStackTrace();
        }



    }
}


