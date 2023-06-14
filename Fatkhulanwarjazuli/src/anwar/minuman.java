/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anwar;

/**
 *
 * @author Anwar
 */
public class minuman {
    private int id_minuman;
    private String nama;
    private int harga;
    
    public minuman(int id_minuman, String nama, int harga){
        this.id_minuman=id_minuman;
        this.nama=nama;
        this.harga=harga;
    }
    
    public int getid_minuman(){
        return id_minuman;
    }
    
    public void setid_minuman(int id_minuman){
        this.id_minuman=id_minuman;
    }
    
    public String getnama(){
        return nama;
    }
    
    public void setnama(String nama){
        this.nama=nama;
    }
    
    public int getharga(){
        return harga;
    }
    
    public void setharga(int harga){
        this.harga=harga;
    }
}
