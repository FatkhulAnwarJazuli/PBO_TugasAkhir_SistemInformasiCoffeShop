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
public class minuman {
    private ArrayList <Integer> id_minuman;
    private ArrayList <String> nama;
    private ArrayList <Integer> harga;
    
    public minuman (){
        id_minuman = new ArrayList <Integer>();
        nama = new ArrayList <String>();
        harga = new ArrayList <Integer>();
    };
    
    
    public void insertid_minuman(Integer isi){
    this.id_minuman.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_minuman(){
        return this.id_minuman;
    }
    
    public void insertnama(String isi){
    this.nama.add(isi);
    }
    
    public ArrayList <String> getRecordnama(){
        return this.nama;
    }
    
    public void insertharga(Integer isi){
    this.harga.add(isi);
    }
    
    public ArrayList <Integer> getRecordharga(){
        return this.harga;
    }
}
