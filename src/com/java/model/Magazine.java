package com.java.model;

import java.util.Comparator;
import java.util.Objects;

public class Magazine extends Document {
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

    public String toString() {
        return "{ ID: " + ID + " ,producer: " + producer + " ,release: " + releaseNumber
                + " ,issueNumber: " + issueNumber + " , releaseMonth: "+releaseMonth+" , cost: " + calcualateCost() + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return issueNumber == magazine.issueNumber && Objects.equals(releaseMonth, magazine.releaseMonth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(releaseMonth, issueNumber);
    }

    @Override
    public double calcualateCost() {
        return 20000;
    }

    public static class SortMagazineMonth implements Comparator<Magazine> {
        @Override
        public int compare(Magazine o1, Magazine o2) {
            return o1.getReleaseMonth().compareTo(o2.getReleaseMonth());
        }
    }
    public static class SortMagazineNumberRelease implements Comparator<Magazine>{
        @Override
        public int compare(Magazine o1, Magazine o2){
            return o1.getReleaseNumber() - o2.getReleaseNumber();
        }
    }

}