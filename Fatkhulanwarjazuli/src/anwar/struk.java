/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anwar;

/**
 *
 * @author Anwar
 */
public class struk {
    private int id_pembayaran;
    private int id_pesanan;
    private int tanggal_pesan;
    private int total_bayar;
    
    public struk(int id_pembayaran, int id_pesanan, int tanggal_pesan, int total_bayar){
        this.id_pembayaran=id_pembayaran;
        this.id_pesanan=id_pesanan;
        this.tanggal_pesan=tanggal_pesan;
        this.total_bayar=total_bayar;        
    }
    
    public int getid_pembayaran(){
        return id_pembayaran;
    }
    
    public void setid_pembayaran(int id_pembayaran){
        this.id_pembayaran=id_pembayaran;
    }
    
    public int getid_pesanan(){
        return id_pesanan;
    }
    
    public void setid_pesanan(int id_pesanan){
        this.id_pesanan=id_pesanan;
    }
    
    public int gettanggal_pesan(){
        return tanggal_pesan;
    }
    
    public void settanggal_pesan(int tanggal_pesan){
        this.tanggal_pesan=tanggal_pesan;
    }
    
    public int gettotal_bayar(){
        return total_bayar;
    }
    
    public void settotal_bayar(int total_bayar){
        this.total_bayar=total_bayar;
    }    
}
