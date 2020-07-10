package com.example.androidflavours;

public class FlavourDataType {

    int image;
    String name;
    String version;
    int info;
    int bigimg;


    public FlavourDataType(int image, String name, String version, int info, int bigimg) {
        this.image = image;
        this.name = name;
        this.version = version;
        this.info = info;
        this.bigimg = bigimg;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }




    public int getInfo() {
        return info;
    }

    public int getBigimg() { return bigimg; }


}
