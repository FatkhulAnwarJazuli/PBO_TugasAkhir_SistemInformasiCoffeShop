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
public class pelanggan {
    private ArrayList <Integer> id_pelanggan;
    private ArrayList <String> nama;
    private ArrayList <Integer> nomor_meja;

    public pelanggan(){
        id_pelanggan = new ArrayList <Integer>();
        nama = new ArrayList <String>();
        nomor_meja = new ArrayList <Integer>();
    };
    
    
    public void insertid_pelanggan(Integer isi){
    this.id_pelanggan.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_pelanggan(){
        return this.id_pelanggan;
    }
    
    public void insertnama(String isi){
    this.nama.add(isi);
    }
    
    public ArrayList <String> getRecordnama(){
        return this.nama;
    }
    
    public void insertnomor_meja(Integer isi){
    this.nomor_meja.add(isi);
    }
    
    public ArrayList <Integer> getRecordnomor_meja(){
        return this.nomor_meja;
    }
}
