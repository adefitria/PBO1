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
public class datasetOperator {
    private ArrayList<String>kodeopr; 
    private ArrayList<String>namaopr; 
    private ArrayList<String>passopr;
    private ArrayList<String>status;
    
    public datasetOperator(){
        kodeopr= new ArrayList<>();
        namaopr= new ArrayList<>();
        passopr= new ArrayList<>();
        status= new ArrayList<>();
    }
    
    public void addKodeopr(String value){
        this.kodeopr.add(value);
    }
    
    public ArrayList<String> getDataKodeopr(){
        return this.kodeopr;
    }
    
    public void addNamaopr(String value){
        this.namaopr.add(value);
    }
    
    public ArrayList<String> getDataNamaopr(){
        return this.namaopr;
    }
    
    public void addPassopr(String value){
        this.passopr.add(value);
    }
    
    public ArrayList<String> getDataPassopr(){
        return this.passopr;
    }
    
    public void addStatus(String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getDataStatus(){
        return this.status;
    }
    
}
