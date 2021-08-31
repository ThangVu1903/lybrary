package com.java.model;

public class Magazine extends Document{
    private String releaseMonth;
    private int issueNumber;

    public String getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(String releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    public String toString (){
        return "{ ID: "+ID+" ,producer: "+producer+" ,release: "+releaseNumber
                +" ,issueNumber: "+ issueNumber+ " }";
    }

    @Override
    public double calcualateCost() {
        return 20000;
    }
}
