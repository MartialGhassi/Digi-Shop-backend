package de.htwberlin.webtech.digishop.model;

public class Produkt {
    private String name;
    private double preis;
    private String beschreibung;

    public Produkt(String name, double preis, String beschreibung) {
        this.name =name;
        this.preis = preis;
        this.beschreibung = beschreibung;

    }

    public String getName(){
        return name;
    }
    public double getPreis(){
        return preis;
    }
    public String getBeschreibung(){
        return beschreibung;
    }
}
