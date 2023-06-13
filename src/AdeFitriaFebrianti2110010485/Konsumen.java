package adefitriafebrianti2110010485;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Konsumen {
    private String namakons, alamatkons, nomorkons, tlpkons;
    public Konsumen(){}

    public Konsumen(String namakons, String alamatkons, String nomorkons, String tlpkons) {
        this.namakons = namakons;
        this.alamatkons = alamatkons;
        this.nomorkons = nomorkons;
        this.tlpkons = tlpkons;
    }
    
    public void setNAMAKONS(String namakons){
        this.namakons=namakons;
    }
    
    public String getNAMAKONS(){
        return this.namakons;
    }

    public void setALAMATKONS(String alamatkons){
        this.alamatkons=alamatkons;
    }
    
    public String getALAMATKONS(){
        return this.alamatkons;
    }
    
    public void setNOMORKONS(String nomorkons){
        this.nomorkons=nomorkons;
    }
    
    public String getNOMORKONS(){
        return this.nomorkons;
    }

    public void setTLPKONS(String tlpkons){
        this.tlpkons=tlpkons;
    }
    
    public String getTLPKONS(){
        return this.tlpkons;
    }
    
}
