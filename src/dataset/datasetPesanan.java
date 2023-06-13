/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class datasetPesanan {
   private ArrayList<String>dp; 
   private ArrayList<String>ket; 
   private ArrayList<String>kodepsn;
   private ArrayList<String>kodeservice; 
   private ArrayList<String>nomorkons; 
   private ArrayList<String>sisa;
   private ArrayList<String>tglpsn;
   private ArrayList<String>tglselesaipsn;
   private ArrayList<String>total;
   
   public datasetPesanan(){
    dp= new ArrayList<>();
    ket= new ArrayList<>();
    kodepsn= new ArrayList<>();
    kodeservice= new ArrayList<>();
    nomorkons= new ArrayList<>();
    sisa= new ArrayList<>();
    tglpsn= new ArrayList<>();
    tglselesaipsn= new ArrayList<>();
    total= new ArrayList<>();
   }
   
   public void addDp(String value){
        this.dp.add(value);
    }
    
    public ArrayList<String> getDataDp(){
        return this.dp;
    }
    
    public void addKet(String value){
        this.ket.add(value);
    }
    
    public ArrayList<String> getDataKet(){
        return this.ket;
    }
    
    public void addKodepsn(String value){
        this.kodepsn.add(value);
    }
    
    public ArrayList<String> getDataKodepsn(){
        return this.kodepsn;
    }
    
    public void addKodeservice(String value){
        this.kodeservice.add(value);
    }
    
    public ArrayList<String> getDataKodeservice(){
        return this.kodeservice;
    }
    public void addNomorkons(String value){
        this.nomorkons.add(value);
    }
    
    public ArrayList<String> getDataNomorkons(){
        return this.nomorkons;
    }
    
    public void addSisa(String value){
        this.sisa.add(value);
    }
    
    public ArrayList<String> getDataSisa(){
        return this.sisa;
    }
    
    public void addTglpsn(String value){
        this.tglpsn.add(value);
    }
    
    public ArrayList<String> getDataTglpsn(){
        return this.tglpsn;
    }
    
    public void addTglselesaipsn(String value){
        this.tglselesaipsn.add(value);
    }
    
    public ArrayList<String> getDataTglselesaipsn(){
        return this.tglselesaipsn;
    }
    
    public void addTotal(String value){
        this.total.add(value);
    }
    
    public ArrayList<String> getDataTotal(){
        return this.total;
    }

    public void addDP(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addTglseleaipsn(Integer valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
