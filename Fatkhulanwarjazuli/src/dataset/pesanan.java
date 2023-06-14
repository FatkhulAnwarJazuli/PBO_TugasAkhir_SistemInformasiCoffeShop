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
public class pesanan {
    private ArrayList <Integer> id_pesanan;
    private ArrayList <Integer> id_pelanggan;
    private ArrayList <Integer> id_admin;
    private ArrayList <Integer> id_makanan;
    private ArrayList <Integer> id_minuman;
    private ArrayList <Integer> jumlah;
    
    public pesanan (){
        id_pesanan = new ArrayList <Integer>();
        id_pelanggan = new ArrayList <Integer>();
        id_admin = new ArrayList <Integer>();
        id_makanan = new ArrayList <Integer>();
        id_minuman = new ArrayList <Integer>();
        jumlah = new ArrayList <Integer>();
    };
    
    
    public void insertid_pesanan(Integer isi){
    this.id_pesanan.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_pesanan(){
        return this.id_pesanan;
    }
    
    public void insertid_pelanggan(Integer isi){
    this.id_pelanggan.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_pelanggan(){
        return this.id_pelanggan;
    }
    
    public void insertid_admin(Integer isi){
    this.id_admin.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_admin(){
        return this.id_admin;
    }
    
    public void insertid_makanan(Integer isi){
    this.id_makanan.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_makanan(){
        return this.id_makanan;
    }
    
    public void insertid_minuman(Integer isi){
    this.id_minuman.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_minuman(){
        return this.id_minuman;
    }
    
    public void insertjumlah(Integer isi){
    this.jumlah.add(isi);
    }
    
    public ArrayList <Integer> getrecordjumlah(){
        return this.id_minuman;
    }
}
