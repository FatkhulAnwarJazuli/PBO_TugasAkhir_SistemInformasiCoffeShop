/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anwar;

/**
 *
 * @author Anwar
 */
public class admin {
    private int id_admin;
    private String nama;
    
    public admin(int id_admin, String nama){
        this.id_admin=id_admin;
        this.nama=nama;
    }
    
    public int getid_admin(){
        return id_admin;
    }
    
    public void setid_admin(int id_admin){
        this.id_admin=id_admin;
    }
    
    public String getnama(){
        return nama;
    }
    
    public void setnama(String nama){
        this.nama=nama;
    }
}
