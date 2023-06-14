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
public class struk {
    private ArrayList <Integer> id_pembayaran;
    private ArrayList <Integer> id_pesanan;
    private ArrayList <Integer> tanggal_pesan;
    private ArrayList <Integer> total_bayar; 
    
    public struk (){
        id_pembayaran= new ArrayList <Integer>();
        id_pesanan = new ArrayList <Integer>();
        tanggal_pesan = new ArrayList <Integer>();
        total_bayar = new ArrayList <Integer>();
    };
    
    
    public void insertid_pembayaran(Integer isi){
    this.id_pembayaran.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_pembayaran(){
        return this.id_pembayaran;
    }
    
    public void insertid_pesanan(Integer isi){
    this.id_pesanan.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_pesanan(){
        return this.id_pesanan;
    }
    
    public void inserttanggal_pesan(Integer isi){
    this.tanggal_pesan.add(isi);
    }
    
    public ArrayList <Integer> getRecordtanggal_pesan(){
        return this.tanggal_pesan;
    }
    
    public void inserttotal_bayar(Integer isi){
    this.total_bayar.add(isi);
    }
    
    public ArrayList <Integer> getRecordtotal_bayar(){
        return this.total_bayar;
    }
}
