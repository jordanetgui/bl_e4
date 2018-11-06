/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author etudiant
 */
public class Produit {
    private int id;
    private String Nom;
    private double Prix;
    private int StockTotal;
    
    public Produit (String pNom, double pPrix, int pStockTotal) {
        this.Nom = pNom;
        this.Prix = pPrix;
        this.StockTotal = pStockTotal;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public double getPrix() {
        return Prix;
    }

    public void setPrix(double Prix) {
        this.Prix = Prix;
    }

    public int getStockTotal() {
        return StockTotal;
    }

    public void setStockTotal(int StockTotal) {
        this.StockTotal = StockTotal;
    }
    
    
}
