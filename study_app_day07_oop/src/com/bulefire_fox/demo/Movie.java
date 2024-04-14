package com.bulefire_fox.demo;

public class Movie {
    private int id;
    private String name;
    private double price;
    private double score;
    private String maker;
    private String mainPeople;
    private String info;

    public Movie() {
    }

    public Movie(int id, String name, double price,
                 double score, String maker,
                 String mainPeople, String info) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.score = score;
        this.maker = maker;
        this.mainPeople = mainPeople;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getMainPeople() {
        return mainPeople;
    }

    public void setMainPeople(String mainPeople) {
        this.mainPeople = mainPeople;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
