package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TSVHurricaneProcessor extends CalculationProcessor {
    String fileName;

    public TSVHurricaneProcessor(String fileName, String hurricaneName) {
        super(hurricaneName);
        this.fileName = fileName;


        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = null;

            while ((line = reader.readLine()) != null) {
                if (line.contains("Date")) {
                    continue;
                }
                String[] hurricaneData = line.split("\t");
                double lat = Double.parseDouble(hurricaneData[4]);
                double lng = Double.parseDouble(hurricaneData[5]);
                int wind = Integer.parseInt(hurricaneData[2]);
                int pressure = Integer.parseInt(hurricaneData[3]);
                String stormType = String.valueOf(hurricaneData[6]);


                Coordinate coordinate = new Coordinate(lat, lng);
                HurricaneRecord hurricaneRecord = new HurricaneRecord(coordinate, wind, pressure, hurricaneName,stormType);
                hurricaneList.add(hurricaneRecord);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



