package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HurricaneProcessor csvHurricaneProcessor = new CSVHurricaneProcessor("dorian.csv", "Dorian");
        HurricaneProcessor tsvHurricaneProcessor = new TSVHurricaneProcessor("barry.tsv", "Barry");

        System.out.print(csvHurricaneProcessor.summarize());
        System.out.println();
        System.out.print(tsvHurricaneProcessor.summarize());










    }
}
