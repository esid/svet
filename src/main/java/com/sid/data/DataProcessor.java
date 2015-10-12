package com.sid.data;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataProcessor {

    private File file;

    public DataProcessor() {
        this.file = new File(System.getProperty("user.home") + "/ips.csv");
        prepareDataFile();
    }

    public DataProcessor(File file){
        this.file = file;
        prepareDataFile();
    }

    private void prepareDataFile(){
        try {
            if (!file.exists()) {
                file.createNewFile();
                CSVWriter wr = new CSVWriter(new FileWriter(file, true));
                wr.writeNext(new String[]{"ip","countryCode", "country"});
                wr.close();
            }
        } catch (IOException e){
                System.out.println("Could not create ips db file!");
                e.printStackTrace();
        }
    }

    public void printAllRecords() throws IOException {
        CSVReader rd = new CSVReader(new FileReader(file));

       List<String []> cont = rd.readAll();
        if(recordsPresent(cont)){
            cont.remove(0);
            for (String[] row : cont) {
                IpInfo info = new IpInfo(row[0], row[1], row[2]);
                System.out.println(String.format("Record: %s - %s; ",
                        cont.indexOf(row) + 1, info.toString()));
            }
            System.out.println("Finished reading");
        }
        else {
            System.out.println("Ips file empty or contains no records!");
        }
        rd.close();
    }

    public void addInfo(IpInfo ipInfo) throws IOException {
        CSVWriter wr = new CSVWriter(new FileWriter(file, true));
        wr.writeNext(ipInfo.serialize());
        wr.close();
    }

    public IpInfo getLast() throws IOException {
        CSVReader rd = new CSVReader(new FileReader(file));
        List<String []> cont = rd.readAll();
        if(recordsPresent(cont)) {
            String[] last = cont.get(cont.size() - 1);
            rd.close();
            return new IpInfo(last);
        }
        else {
            System.out.println("Ips file empty or contains no records!");
            return new IpInfo( new String [] {"","",""} );
        }
    }

    private boolean recordsPresent(List<String []> recs){
        return  recs.size() != 0 && recs.size() !=1;
    }
}
