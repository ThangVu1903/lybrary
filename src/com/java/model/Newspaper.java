package com.java.model;


import java.util.Comparator;
import java.util.Objects;

public class Newspaper extends Document {
    private String releaseDate;

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String toString (){
        return "{ ID: "+ID+" ,producer: "+producer+" ,release: "+releaseNumber
                +" ,releaseDate: "+releaseDate+",  cost: "+calcualateCost()+" }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Newspaper newspaper = (Newspaper) o;
        return Objects.equals(releaseDate, newspaper.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(releaseDate);
    }

    @Override
    public double calcualateCost() {
        return 15000;
    }

    public static class SortNewspaperNumberRelease implements Comparator<Newspaper> {
        @Override
        public int compare(Newspaper o1, Newspaper o2){
            return o1.getReleaseNumber() - o2.getReleaseNumber();
        }
    }
}
