package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVHurricaneProcessor extends CalculationProcessor {
    String fileName;



    public CSVHurricaneProcessor(String fileName, String hurricaneName) {
        super(hurricaneName);
        this.fileName = fileName;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = null;

            while ((line = reader.readLine()) != null) {
                if (line.contains("Date")) {
                    continue;
                }
                String[] hurricaneData = line.split(",");
                double lat = Double.parseDouble(hurricaneData[2]);
                double lng = Double.parseDouble(hurricaneData[3]);
                int wind = Integer.parseInt(hurricaneData[4]);
                int pressure = Integer.parseInt(hurricaneData[5]);
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


