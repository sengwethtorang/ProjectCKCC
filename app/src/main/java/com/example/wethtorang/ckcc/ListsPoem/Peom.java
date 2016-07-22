package com.example.wethtorang.ckcc.ListsPoem;

/**
 * Created by WETHTORANG on 7/19/2016.
 */
public class Peom {
    private String number;
    private String title;
    public Peom(){

    }
    public Peom(String title, String number){
        this.number = number;
        this.title = title;
    }
    public String getNumber() {
        return number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
