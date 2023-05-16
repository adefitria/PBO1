/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class MenuUtama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Konsumen obj = new Konsumen();
        obj.setNAMA("Ade");
        obj.setALAMATKONS("Jl.Belitung");
        obj.setNOMORKONS("01");
        obj.setTLPKONS("085822969826");
        System.out.println("Nama "+obj.getNAMA() +"\n Alamat "+obj.getALAMATKONS() +"\n NOMOR KONSUMEN " +obj.getNOMORKONS()+"\n TELPON KONSUMEN"+obj.getNOMORKONS());
    }
    
}
