package org.example.Hogwarts;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String faculty, int spellPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, faculty, spellPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public String toString() {

        return ("Имя: " + getName() + "; Сила магии: " + getSpellPower() + "; Расстояние трансгрессия: " + getTransgressionDistance() + "; Хитрость: "
                + getCunning() + "; Решительность: " + getDetermination() + "; Амбиции: " + getAmbition() + "; Находчивость: "
                + getResourcefulness() + "; Жажда власти: " + getLustForPower() + ".");

    }

    public String comparison(Slytherin slytherin){
        return (cunning + determination + ambition + resourcefulness + lustForPower) > (slytherin.getCunning() + slytherin.getDetermination()
                + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower()) ?
                getName() + " лучший " + getFaculty() + "ец чем " + slytherin.getName() :
                getName() + " худший " + getFaculty() + "ец чем " + slytherin.getName();
    }
}
