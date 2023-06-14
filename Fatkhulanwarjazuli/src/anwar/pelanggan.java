/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anwar;

/**
 *
 * @author Anwar
 */
public class pelanggan {
    private int id_pelanggan;
    private String nama;
    private int nomor_meja;
    
    public pelanggan (int id_pelanggan, String nama, int nomor_meja){
        this.id_pelanggan=id_pelanggan;
        this.nama=nama;
        this.nomor_meja=nomor_meja;
    }
    
    public int getid_pelanggan(){
        return id_pelanggan;
    }
    
    public void setid_pelanggan(int id_pelanggan){
        this.id_pelanggan=id_pelanggan;
    }
    
     public String getnama(){
        return nama;
    }
    
    public void setnama(String nama){
        this.nama=nama;
    }
    
     public int getnomor_meja(){
        return nomor_meja;
    }
    
    public void setnomor_meja(int nomor_meja){
        this.nomor_meja=nomor_meja;
    }
            
}
