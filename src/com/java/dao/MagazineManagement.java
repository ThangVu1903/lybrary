package com.java.dao;

import com.java.model.Book;
import com.java.model.Magazine;

import java.util.ArrayList;
import java.util.List;

public class MagazineManagement {
    private List<Magazine> magazineList = new ArrayList<>();

    public List<Magazine> getMagazineList(){
        return magazineList;
    }

    public void addMagazine(Magazine addMagazine){
        for (Magazine magazine: magazineList){
            if (magazine.equals(addMagazine)){
                System.out.println("Magazine already exists, please re-enter");
                return;
            }
        }
        magazineList.add(addMagazine);
    }

    public void removeMagazine(Magazine magazine){
        magazineList.remove(magazine);
    }


    public void updateMagazine(Magazine updateMagazine){
        for (Magazine magazine : magazineList){
            if (magazine.getID()==updateMagazine.getID()){
                magazine.setReleaseNumber(updateMagazine.getReleaseNumber());
            }
        }
    }


    public Magazine searchMagazineID(long ID) {
        for (Magazine magazine: magazineList) {
            if (magazine.getID() == ID) {
                return magazine;
            }
        }
        return null;
    }
}
