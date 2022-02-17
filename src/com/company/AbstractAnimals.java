package com.company;

public abstract class AbstractAnimals{
//    Private double height; //бой
//    private int weight;  // салмак
//    Private String location; //локация
//    Private String timeOfDay;
//    Private String season; //сезон
//    Private String gender; //пол
////    Конструктор
//    Геттер сеттер
//    Public abstract boolean canReproduce();
    private double height;
    private int weight;
    private String location;
    private String timeOfday;
    private String season;
    private String gender;


    public AbstractAnimals(double height, int weight, String location, String timeOfday, String season, String gender) {
        this.height = height;
        this.weight = weight;
        this.location = location;
        this.timeOfday = timeOfday;
        this.season = season;
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTimeOfday() {
        return timeOfday;
    }

    public void setTimeOfday(String timeOfday) {
        this.timeOfday = timeOfday;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public abstract boolean canReproduce();
}
