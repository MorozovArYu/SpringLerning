package com.gmail.morozowau.aop;

public class Student {
    private String nameSerName;
    private int course;
    private double avgGrade;

    public Student(String nameSerName, int course, double avgGrade) {
        this.nameSerName = nameSerName;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getNameSerName() {
        return nameSerName;
    }

    public void setNameSerName(String nameSerName) {
        this.nameSerName = nameSerName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSerName='" + nameSerName + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
