package com.company;

public abstract class AbstractReptiles extends AbstractAnimals{
//    Private  int length; //длина
//    Private String vision; //зрение
//    Private String hearingAbilities; //способности слышать
//    Private String typeOfReproduction;
//    Public abstract void abilitiesOfCrawling();

    private int length;
    private String vision;
    private String hearingAbilities;
    private String typeOfReproduction;

    public AbstractReptiles(double height, int weight, String location, String timeOfday, String season,
                            String gender, int length, String vision, String hearingAbilities,
                            String typeOfReproduction) {
        super(height, weight, location, timeOfday, season, gender);
        this.length = length;
        this.vision = vision;
        this.hearingAbilities = hearingAbilities;
        this.typeOfReproduction = typeOfReproduction;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getHearingAbilities() {
        return hearingAbilities;
    }

    public void setHearingAbilities(String hearingAbilities) {
        this.hearingAbilities = hearingAbilities;
    }

    public String getTypeOfReproduction() {
        return typeOfReproduction;
    }

    public void setTypeOfReproduction(String typeOfReproduction) {
        this.typeOfReproduction = typeOfReproduction;
    }
}
