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
public class datasetPengiriman {
    private ArrayList<String>jumlahbayar; 
    private ArrayList<String>kodekurir; 
    private ArrayList<String>nomorkirim;
    private ArrayList<String>tglkirim;  
    
    public datasetPengiriman(){
      jumlahbayar= new ArrayList<>();
      kodekurir= new ArrayList<>();
      nomorkirim= new ArrayList<>();
      tglkirim= new ArrayList<>();
    }
    
    public void addJumlahbyar(String value){
        this.jumlahbayar.add(value);
    }
    
    public ArrayList<String> getDataJumlahbayar(){
        return this.jumlahbayar;
    }
    
    public void addKodekurir(String value){
        this.kodekurir.add(value);
    }
    
    public ArrayList<String> getDataKodekurir(){
        return this.kodekurir;
    }
    
    public void addNomorkirim(String value){
        this.nomorkirim.add(value);
    }
    
    public ArrayList<String> getDataNomorkirim(){
        return this.nomorkirim;
    }
    
    public void addTglkirim(String value){
        this.tglkirim.add(value);
    }
    
    public ArrayList<String> getDataTglkirim(){
        return this.tglkirim;
    }
}
