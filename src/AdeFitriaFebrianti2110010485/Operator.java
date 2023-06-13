package adefitriafebrianti2110010485;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Operator {
    private String kodeopr, namaopr, passopr, status;
    public Operator(){}

    public Operator(String kodeopr, String namaopr, String passopr, String status) {
    this.kodeopr = kodeopr;
    this.namaopr = namaopr;
    this.passopr = passopr;
    this.status = status;
    }

    public void setKODEOPR(String kodeopr){
        this.kodeopr=kodeopr;
    }
    
    public String getKODEOPR(){
        return this.kodeopr;
    }

    public void setNAMAOPR(String namaopr){
        this.namaopr=namaopr;
    }
    
    public String getNAMAOPR(){
        return this.namaopr;
    }

     public void setPASSOPR(String passopr){
        this.passopr=passopr;
    }
    
    public String getPASSOPR(){
        return this.passopr;
    }
    
    public void setSTATUS(String status){
        this.status=status;
    }
    
    public String getSTATUS(){
        return this.status;
    }
    
}
