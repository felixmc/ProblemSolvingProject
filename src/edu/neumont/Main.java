package edu.neumont;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FileLoader fileLoader = new FileLoader();
        ArrayList<String> records = fileLoader.loadFile("projectdata_fall_2014.txt");

        //For testing file loader
        for(String record : records) {
            System.out.println(record);
        }
    }
}
