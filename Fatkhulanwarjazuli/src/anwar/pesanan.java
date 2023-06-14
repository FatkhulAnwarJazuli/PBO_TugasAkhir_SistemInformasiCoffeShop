/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anwar;

/**
 *
 * @author Anwar
 */
public class pesanan {
    private int id_pesanan;
    private int id_pelanggan;
    private int id_admin;
    private int id_makanan;
    private int id_minuman;
    private int jumlah;
    
    public pesanan(int id_pesanan, int id_pelanggan, int id_admin, int id_makanan, int id_minuman, int jumlah){
        this.id_pesanan=id_pesanan;
        this.id_pelanggan=id_pelanggan;
        this.id_admin=id_admin;
        this.id_makanan=id_makanan;
        this.id_minuman=id_minuman;
        this.jumlah=jumlah;
    }
    
    public int getid_pesanan(){
        return id_pesanan;
    }
    
    public void setid_pesanan(int id_pesanan){
        this.id_pesanan=id_pesanan;
    }
    
    public int getid_pelanggan(){
        return id_pelanggan;
    }
    
    public void setid_pelanggan(int id_pelanggan){
        this.id_pelanggan=id_pelanggan;
    }
    
    public int getid_admin(){
        return id_admin;
    }
    
    public void setid_admin(int id_admin){
        this.id_admin=id_admin;
    }
    
    public int getid_makanan(){
        return id_makanan;
    }
    
    public void setid_makanan(int id_makanan){
        this.id_makanan=id_makanan;
    }
    
    public int getid_minuman(){
        return id_minuman;
    }
    
    public void setid_minuman(int id_minuman){
        this.id_minuman=id_minuman;
    }
    
    public int getjumlah(){
        return jumlah;
    }
    
    public void setjumlah(int jumlah){
        this.jumlah=jumlah;
    }        
}
