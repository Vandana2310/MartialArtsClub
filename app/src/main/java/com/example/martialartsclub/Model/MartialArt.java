package com.example.martialartsclub.Model;

public class MartialArt {

    private int martialArtID;
    private String martialArtName;
    private String martialArtColor;
    private double martialArtPrice;


    public MartialArt(int id, String name, double price, String color) {

        setMartialArtId(id);
        setMartialArtName(name);
        setMartialPrice(price);
        setMartialArtColor(color);
    }

    public int getMartialArtID() {
        return martialArtID;
    }

    public void setMartialArtId(int martialArtId) {
        this.martialArtID = martialArtId;
    }

    public String getMartialArtName() {
        return martialArtName;
    }

    public void setMartialArtName(String martialArtName) {
        this.martialArtName = martialArtName;
    }

    public String getMartialArtColor() {
        return martialArtColor;
    }

    public void setMartialArtColor(String martialArtColor) {
        this.martialArtColor = martialArtColor;
    }

    public double getMartialArtPrice() {
        return martialArtPrice;
    }

    public void setMartialPrice(double martialPrice) {
        this.martialArtPrice = martialPrice;
    }

    @Override
    public String toString() {
        return getMartialArtID() + "\n" + getMartialArtName() + "\n" + getMartialArtPrice() + "\n" + getMartialArtColor();
    }
}