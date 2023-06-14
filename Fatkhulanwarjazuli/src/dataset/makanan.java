/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author Anwar
 */
public class makanan {
    private ArrayList <Integer> id_makanan;
    private ArrayList <String> Nama;
    private ArrayList <Integer> harga;
    
    public makanan (){
        id_makanan = new ArrayList <Integer>();
        Nama = new ArrayList <String>();
        harga = new ArrayList <Integer>();
    }
    
    public void insertid_makanan (Integer isi){
    this.id_makanan.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_makanan(){
        return this.id_makanan;
    }
    
    public void insertNama(String isi){
    this.Nama.add(isi);
    }
    
    public ArrayList <String> getrecordNama(){
        return this.Nama;
    }
    
    public void insertharga(Integer isi){
    this.harga.add(isi);
    }
    
    public ArrayList <Integer> getRecordharga(){
        return this.harga;
    }

}
