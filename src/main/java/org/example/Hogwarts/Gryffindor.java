package org.example.Hogwarts;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String faculty, int spellPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, faculty, spellPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public String toString() {

        return ("Имя: " + getName() + "; Сила магии: " + getSpellPower() + "; Расстояние трансгрессия: " + getTransgressionDistance() + "; Благородство: "
                + getNobility() + "; Честь: " + getHonor() + "; Храбрость: " + getBravery() + ".");

    }

    public String comparison(Gryffindor gryffindor){
        return (nobility + honor + bravery) > (gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery()) ?
                getName() + " лучший " + getFaculty() + "ец чем " + gryffindor.getName() :
                getName() + " худший " + getFaculty() + "ец чем " + gryffindor.getName();
    }
}
