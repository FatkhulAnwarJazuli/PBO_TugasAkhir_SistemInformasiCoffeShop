/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anwar;

/**
 *
 * @author Anwar
 */
public class makanan {
    private int id_makanan;
    private String nama;
    private int harga;
    
    public makanan(int id_makanan, String nama, int harga){
        this.id_makanan=id_makanan;
        this.nama=nama;
        this.harga=harga;
    }
    
    public int getid_makanan(){
        return id_makanan;
    }
    
    public void setid_makanan(int id_makanan){
        this.id_makanan=id_makanan;
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
