package org.example;

public class Performance {
    private String performanceID;
    private String performanceName;
    private String performanceLeadName;
    private int performanceGroup;

    public String getPerformanceID() {
        return performanceID;
    }

    public void setPerformanceID(String performanceID) {
        this.performanceID = performanceID;
    }

    public String getPerformanceName() {
        return performanceName;
    }

    public void setPerformanceName(String performanceName) {
        this.performanceName = performanceName;
    }

    public String getPerformanceLeadName() {
        return performanceLeadName;
    }

    public void setPerformanceLeadName(String performanceLeadName) {
        this.performanceLeadName = performanceLeadName;
    }

    public int getPerformanceGroup() {
        return performanceGroup;
    }

    public void setPerformanceGroup(int performanceGroup) {
        this.performanceGroup = performanceGroup;
    }

    public Performance(String performanceID, String performanceName, String performanceLeadName, int performanceGroup) {
        this.performanceID = performanceID;
        this.performanceName = performanceName;
        this.performanceLeadName = performanceLeadName;
        this.performanceGroup = performanceGroup;
    }

    public String toString() {
        return "\n" + "performnceID" + performanceID +
               "\n" + "performnceName" + performanceName +
               "\n" + "performanceLeadName" + performanceLeadName +
               "\n" + "performanceGroup" + performanceGroup;



    }
}