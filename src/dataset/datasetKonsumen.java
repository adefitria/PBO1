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
public class datasetKonsumen {
    private ArrayList<String>namakons; 
    private ArrayList<String>alamatkons; 
    private ArrayList<String>nomorkons;
    private ArrayList<String>tlpkons;
    
    public datasetKonsumen(){
        namakons= new ArrayList<>();
        alamatkons= new ArrayList<>();
        nomorkons= new ArrayList<>();
        tlpkons= new ArrayList<>();
    }
    
     public void addNamakons(String value){
        this.namakons.add(value);
    }
    
    public ArrayList<String> getDataNamakons(){
        return this.namakons;
    }
    
    public void addAlamatkons(String value){
        this.alamatkons.add(value);
    }
    
    public ArrayList<String> getDataAlamatkons(){
        return this.alamatkons;
    }
    
    public void addNomorkons(String value){
        this.nomorkons.add(value);
    }
    
    public ArrayList<String> getDataNomorkons(){
        return this.nomorkons;
    }
    
    public void addTlpkons(String value){
        this.tlpkons.add(value);
    }
    
    public ArrayList<String> getDataTlpkons(){
        return this.tlpkons;
    }
}
