package adefitriafebrianti2110010485;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Kurir {
     private String kodekurir, namakurir;
    public Kurir(){}

    public Kurir(String kodekurir, String namakurir) {
    this.kodekurir = kodekurir;
    this.namakurir = namakurir;
    }

    public void setKODEKURIR(String kodekurir){
        this.kodekurir=kodekurir;
    }
    
    public String getKODEKURIR(){
        return this.kodekurir;
    }

    public void setNAMAKURIR(String namakurir){
        this.namakurir=namakurir;
    }
    
    public String getNAMAKURIR(){
        return this.namakurir;
    }
        
    

}
