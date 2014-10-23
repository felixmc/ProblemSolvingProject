package edu.neumont;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by jjensen on 10/20/14.
 */
public class FileLoader {

    public ArrayList<EmployeeRecord> loadFile(String filename) {
        File file = new File(filename);
        ArrayList<EmployeeRecord> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split("\t", -1);
                EmployeeRecord employeeRecord = new EmployeeRecord(intParser(parts[0]), intParser(parts[1]), parts[2].charAt(0),
                        intParser(parts[3]));
                if(parts.length > 4) {
                    for(int i = 4; i < parts.length; i += 2) {
                        employeeRecord.addElement(intParser(parts[i]), doubleParser(parts[i + 1]));
                    }
                }

                list.add(employeeRecord);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    private int intParser(String string) {
        int result = 0;

        try {
            result = Integer.parseInt(string);
        } catch(NumberFormatException exception) {
            exception.printStackTrace();
        }

        return result;
    }

    private double doubleParser(String string) {
        double result = 0.0;

        try {
            result = Double.parseDouble(string);
        } catch(NumberFormatException exception) {
            exception.printStackTrace();
        }

        return result;
    }
}
