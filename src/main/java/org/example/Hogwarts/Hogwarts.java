package org.example.Hogwarts;

import org.example.Main;

public abstract class Hogwarts {

    private String name;
    private int spellPower;
    private int transgressionDistance;

    private String faculty;

    public Hogwarts(String name, String faculty, int spellPower, int transgressionDistance) {
        this.name = name;
        this.faculty = faculty;
        this.spellPower = spellPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String comparison(Hogwarts hogwarts) {
        return (spellPower + transgressionDistance) > (hogwarts.getSpellPower() + hogwarts.getTransgressionDistance()) ?
                getName() + " обладает бОльшей мощностью магии, чем " + hogwarts.getName() :
                getName() + " обладает меньшей мощностью магии, чем " + hogwarts.getName();
    }
}
