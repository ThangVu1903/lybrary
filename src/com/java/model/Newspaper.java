package com.java.model;


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
                +" ,releaseDate: "+releaseDate+ " }";
    }

    @Override
    public double calcualateCost() {
        return 15000;
    }
}
