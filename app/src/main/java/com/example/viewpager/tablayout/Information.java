package com.example.viewpager.tablayout;

public class Information {

    private String name;

    private int img;


    private String about;

    public Information(String name, int img, String about) {
        this.name = name;
        this.img = img;
        this.about = about;
    }

    public String getAbout() {
        return about;
    }



    public void setAbout(String about) {
        this.about = about;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
