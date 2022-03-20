package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private final int possibleMarks;
    private final String submitterName;

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.submitterName = submitterName;
        this.possibleMarks = possibleMarks;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }


    public String getLetterGrade() {
        if(1.0 * earnedMarks/possibleMarks * 100 >= 90) {return "A";}
        if(1.0 * earnedMarks/possibleMarks * 100 >= 80) {return "B";}
        if(1.0 * earnedMarks/possibleMarks * 100 >= 70) {return "C";}
        if(1.0 * earnedMarks/possibleMarks * 100 >= 60) {return "D";}
        return "F";
    }
}
