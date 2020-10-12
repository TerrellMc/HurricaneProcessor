package com.company;

public class HurricaneRecord {
    Coordinate coordinate;
    int wind, pressure;
    String hurricaneName;
    String stormType;


    public HurricaneRecord(Coordinate coordinate, int wind, int pressure, String hurricaneName, String stormType) {
        this.coordinate = coordinate;
        this.wind = wind;
        this.pressure = pressure;
        this.hurricaneName = hurricaneName;
        this.stormType = stormType;
    }
}
