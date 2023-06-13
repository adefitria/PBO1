package adefitriafebrianti2110010485;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Pesanan {
    private String dp, ket, kodepsn, kodeservice, nomorkons, sisa, tglpsn, tglselesaipsn, total;
    public Pesanan(){}

    public Pesanan(String dp, String ket, String kodepsn, String kodeservice, String nomorkons, String sisa, String tglpsn, String tglselesaipsn, String total) {
    this.dp = dp;
    this.ket = ket;
    this.kodepsn = kodepsn;
    this.kodeservice = kodeservice;
    this.nomorkons = nomorkons;
    this.sisa = sisa;
    this.tglpsn = tglpsn;
    this.tglselesaipsn = tglselesaipsn;  
    this.total = total;
    }

     public void setDP(String dp){
        this.dp=dp;
    }
    
    public String getDP(){
        return this.dp;
    }

    public void setKET(String ket){
        this.ket=ket;
    }
    
    public String getKET(){
        return this.ket;
    }

     public void setKODEPSN(String kodepsn){
        this.kodepsn=kodepsn;
    }
    
    public String getKODEPSN() {
        return this.kodepsn;
    }
    
    public void setKODESERVICE(String kodeservice){
        this.kodeservice=kodeservice;
    }
    
    public String getKODESERVICE(){
        return this.kodeservice;
    }
    
    public void setNOMORKONS(String nomorkons){
        this.nomorkons=nomorkons;
    }
    
    public String getNOMORKONS(){
        return this.nomorkons;
    }
    
    public void setSISA(String sisa){
        this.sisa=sisa;
    }
    
    public String getSISA(){
        return this.sisa;
    }
    
    public void setTGLPSN(String tglpsn){
        this.tglpsn=tglpsn;
    }
    
    public String getTGLPSN(){
        return this.tglpsn;
    }
    
    public void setTGLSELESAIPSN(String tglselesaipsn){
        this.tglselesaipsn=tglselesaipsn;
    }
    
    public String getTGLSELESAIPSN(){
        return this.tglselesaipsn;
    }
    
    public void setTOTAL(String total){
        this.total=total;
    }
    
    public String getTOTAL(){
        return this.total;
    }

}      