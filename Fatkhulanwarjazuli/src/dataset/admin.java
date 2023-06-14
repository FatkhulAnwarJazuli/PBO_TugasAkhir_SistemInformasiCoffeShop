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
public class admin {
    private ArrayList <Integer> id_admin;
    private ArrayList <String> nama; 
    
    public admin (){
        id_admin = new ArrayList <Integer>();
        nama = new ArrayList <String>(); 
    }
    
    public void insertid_admin(Integer isi){
    this.id_admin.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_admin(){
        return this.id_admin;
    }
    
    public void insertNama(String isi){
    this.nama.add(isi);
    }
    
    public ArrayList <String> getRecordNama(){
        return this.nama;
    }
}
