package org.example.Hogwarts;

public class Hufflepuff extends Hogwarts {

    private int hardworking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String faculty, int spellPower, int transgressionDistance, int hardworking, int loyalty, int honesty) {
        super(name, faculty, spellPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public String toString() {

        return ("Имя: " + getName() + "; Сила магии: " + getSpellPower() + "; Расстояние трансгрессия: " + getTransgressionDistance() + "; Трудолюбие: "
                + getHardworking() + "; Верность: " + getLoyalty() + "; Честность: " + getHonesty() + ".");
    }

    public String comparison(Hufflepuff hufflepuff){
        return (hardworking + loyalty + honesty) > (hufflepuff.getHardworking() + hufflepuff.getLoyalty() + hufflepuff.getHonesty()) ?
                getName() + " лучший " + getFaculty() + "ец чем " + hufflepuff.getName() :
                getName() + " худший " + getFaculty() + "ец чем " + hufflepuff.getName();
    }

}
