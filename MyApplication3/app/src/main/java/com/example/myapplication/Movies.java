package com.example.myapplication;

public class Movies {

    private String Name;
    private   double durtion;
    private double rating;
    private  String genre;
    private int year;
    private int img;

    public Movies(String name, double durtion, double rating, String genre, int year, int img) {
        Name = name;
        this.durtion = durtion;
        this.rating = rating;
        this.genre = genre;
        this.year = year;
        this.img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getDurtion() {
        return durtion;
    }

    public void setDurtion(double durtion) {
        this.durtion = durtion;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >=5 )

        this.rating = rating;

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
