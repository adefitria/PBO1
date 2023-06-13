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
public class datasetKurir {
    private ArrayList<String>kodekurir; 
    private ArrayList<String>namakurir; 
  
  public datasetKurir(){
    kodekurir= new ArrayList<>();
    namakurir= new ArrayList<>();
  }
  
  public void addKodekurir(String value){
        this.kodekurir.add(value);
    }
    
    public ArrayList<String> getDataKodekurir(){
        return this.kodekurir;
    }
    
    public void addNamakurir(String value){
        this.namakurir.add(value);
    }
    
    public ArrayList<String> getDataNamakurir(){
        return this.namakurir;
    }
}
