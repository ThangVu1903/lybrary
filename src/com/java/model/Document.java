package com.java.model;

public abstract class Document {
    protected long ID;
    protected String producer;
    protected int releaseNumber;


    public long getID() {
        return ID;
    }

    public abstract double calcualateCost();

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }
}
