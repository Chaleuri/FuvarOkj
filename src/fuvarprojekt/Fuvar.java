/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuvarprojekt;

/**
 *
 * @author Hatházi Péter
 */
public class Fuvar {
    
    private int taxi_id, idotartam;
    private String indulas, fizetes_modja;
    private double tavolsag, viteldij, borravalo;
    
    public Fuvar(String sor){
        String[] s = sor.split(";");
        this.taxi_id = Integer.parseInt(s[0]);
        this.indulas = s[1];
        this.idotartam = Integer.parseInt(s[2]);
        this.tavolsag = Double.parseDouble(s[3]);
        this.viteldij = Double.parseDouble(s[4]);
        this.borravalo = Double.parseDouble(s[5]);
        this.fizetes_modja = s[6];
    }
    
}
