package edu.neumont;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jjensen on 10/21/14.
 */
public class EmployeeRecord {
    private int employeeNumber;
    private int dateString;
    private char sampleType;
    private int jobCode;
    private Map elements;

    public EmployeeRecord(int employeeNumber, int dateString, char sampleType,
                          int jobCode) {
        this.employeeNumber = employeeNumber;
        this.dateString = dateString;
        this.sampleType = sampleType;
        this.jobCode = jobCode;
        elements = new HashMap();

    }

    public void addElement(int key, double  value) {
        elements.put(key, value);
    }


    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public int getDateString() {
        return dateString;
    }

    public char getSampleType() {
        return sampleType;
    }

    public int getJobCode() {
        return jobCode;
    }



}
