package com.company;

public interface HurricaneProcessor{

    String getName();
    double getAveragePressure();
    int getMaxPressure();
    int getMinPressure();
    double getAverageWindSpeed();
    int getMaxWindSpeed();
    int getMinWindSpeed();
    String stormType();
    Coordinate getStartLocation();
    Coordinate getEndLocation();
    String summarize();



}
