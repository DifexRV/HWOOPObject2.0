package org.example.Hogwarts;

public class Ravenclaw extends Hogwarts {

    private int smart;
    private int wisdom;
    private int witty;
    private int creative;

    public Ravenclaw(String name, String faculty, int spellPower, int transgressionDistance, int smart, int wisdom, int witty, int creative) {
        super(name, faculty, spellPower, transgressionDistance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public String toString() {

        return ("Имя: " + getName() + "; Сила магии: " + getSpellPower() + "; Расстояние трансгрессия: " + getTransgressionDistance() + "; Умный: "
                + getSmart() + "; Мудрость: " + getWisdom() + "; Остроумный: " + getWitty() + "; Творческий: " + getCreative() + ".");

    }

    public String comparison(Ravenclaw ravenclaw){
        return (smart + wisdom + witty + creative) > (ravenclaw.getSmart() + ravenclaw.getWisdom() + ravenclaw.getWitty() + ravenclaw.getCreative()) ?
                getName() + " лучший " + getFaculty() + "ец чем " + ravenclaw.getName() :
                getName() + " худший " + getFaculty() + "ец чем " + ravenclaw.getName();
    }

}
