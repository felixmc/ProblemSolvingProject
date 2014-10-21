package edu.neumont;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by jjensen on 10/20/14.
 */
public class FileLoader {

    public ArrayList<String> loadFile(String filename) {
        File file = new File(filename);
        ArrayList<String> list = new ArrayList<String>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            while((line = reader.readLine()) != null) {
                //todo Code for employee record will go here
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
