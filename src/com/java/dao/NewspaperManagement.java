package com.java.dao;


import com.java.model.Magazine;
import com.java.model.Newspaper;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.List;

public class NewspaperManagement {
    private List<Newspaper> newspaperList = new ArrayList<>();

    public List<Newspaper> getNewspaperList(){
        return newspaperList;
    }
    public void aadNewspaper (Newspaper addNewspaper){
        for (Newspaper newspaper:newspaperList){
            if (newspaper.getID()==addNewspaper.getID()){
                System.out.println("Newspaper already exists, please re-enter");
                return;
            }
        }
        newspaperList.add(addNewspaper);
    }

    public void removeNewspaper(Newspaper newspaper) {
        newspaperList.remove(newspaper);
    }
    public void updateNewspaper(Newspaper updateNewspaper){
        for (Newspaper newspaper : newspaperList){
            if (newspaper.getID()==updateNewspaper.getID()){
                newspaper.setReleaseNumber(updateNewspaper.getReleaseNumber());
            }
        }
    }

    public Newspaper searchNewspaperID(long ID) {
        for (Newspaper newspaper: newspaperList) {
            if (newspaper.getID() == ID) {
                return newspaper;
            }
        }
        return null;
    }

}
