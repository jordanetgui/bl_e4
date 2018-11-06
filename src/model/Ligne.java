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
public class Ligne {
    
    private Produit prod;
    private int qte;
    
    public Ligne (Produit pProd, int pQte) {
        this.prod = pProd;
        this.qte = pQte;
    }
    
}
