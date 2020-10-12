package com.company;
import java.util.ArrayList;
import java.util.List;

abstract public class CalculationProcessor implements HurricaneProcessor {
    String  hurricaneName;
    List<HurricaneRecord> hurricaneList = new ArrayList<>();

    public CalculationProcessor(String hurricaneName) {
        this.hurricaneName = hurricaneName;
    }

    @Override
    public String getName() {
        return hurricaneName;
    }

    @Override
    public double getAveragePressure() {
        int sum = 0;
        for (HurricaneRecord record: hurricaneList) {
            sum = sum + record.pressure;
        }
        return (double) sum/hurricaneList.size();
        // should return the average press
    }

    @Override
    public int getMaxPressure() {
        int maxPressure = hurricaneList.get(0).pressure;
        for(HurricaneRecord record: hurricaneList){
            if(record.pressure > maxPressure){
                maxPressure = record.pressure;
            }
        }
        return maxPressure;
    }

    @Override
    public int getMinPressure() {
        int minPressure = hurricaneList.get(0).pressure;
        for(HurricaneRecord record:hurricaneList){
            if(record.pressure < minPressure){
                minPressure = record.pressure;
            }
        }
        return minPressure;
    }

    @Override
    public double getAverageWindSpeed() {
        int sum = 0;
        for (HurricaneRecord record:hurricaneList) {
            sum = sum + record.wind;
        }
        return (double) sum/hurricaneList.size();
    }

    @Override
    public int getMaxWindSpeed() {
        int maxWind = hurricaneList.get(0).wind;
        for(HurricaneRecord record:hurricaneList){
            if(record.wind > maxWind){
                maxWind = record.wind;
            }
        }
        return maxWind;
    }

    @Override
    public int getMinWindSpeed() {
        int minWind = hurricaneList.get(0).wind;
        for(HurricaneRecord record: hurricaneList){
            if(record.wind < minWind){
                minWind = record.wind;
            }
        }

        return minWind;
    }

    @Override
    public Coordinate getStartLocation() {
        return hurricaneList.get(0).coordinate;
    }

    @Override
    public Coordinate getEndLocation() {
        return hurricaneList.get(hurricaneList.size()-1).coordinate;
    }

    @Override
    public String stormType() {
        return hurricaneList.get(0).stormType;
    }
 
    @Override
    public String summarize() {
       return String.format("Name: %s%nPressure (min,max,avg): %d,%d,%d%nWind (min,max,avg): %d,%d,%d%nStart Location: %f,%f%nEnd Location: %f,%f%nStorm Type: %s%n" ,getName(),getMinPressure(),getMaxPressure(),(int) getAveragePressure(),getMinWindSpeed(),getMaxWindSpeed(),(int)getAverageWindSpeed(),getStartLocation().latitude,getStartLocation().longitude,getEndLocation().latitude,getEndLocation().longitude,stormType());
    }
}
