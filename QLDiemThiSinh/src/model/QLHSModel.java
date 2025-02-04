/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author thaii
 */
public class QLHSModel{
    private ArrayList<HocSinh> dsHocSinh;
    private String tenFile;

    public QLHSModel() {
        this.dsHocSinh = new ArrayList<>();
        this.tenFile="";
        
    }

    public QLHSModel(ArrayList<HocSinh> dsHocSinh) {
        this.dsHocSinh = dsHocSinh;
    }

    public ArrayList<HocSinh> getDsHocSinh() {
        return dsHocSinh;
    }

    public void setDsHocSinh(ArrayList<HocSinh> dsHocSinh) {
        this.dsHocSinh = dsHocSinh;
    }

    public String getTenFile() {
        return tenFile;
    }

    public void setTenFile(String tenFile) {
        this.tenFile = tenFile;
    }

    
    
    public void insert(HocSinh hocSinh){
        this.dsHocSinh.add(hocSinh);
    }
    
    public void delete(HocSinh hs, int i_row){  
        this.getDsHocSinh().set(i_row, hs);
//        this.dsHocSinh.remove(hs);        
    }
    
    public void delete(HocSinh hs){  
        this.dsHocSinh.remove(hs);        
    }
    
    public void update(HocSinh hocSinh,int i_row){
        this.delete(hocSinh,i_row);
//        this.dsHocSinh.add(hocSinh);
    }
    
    public void sapXep(HocSinh hs){
        this.dsHocSinh.sort((Comparator<? super HocSinh>) hs);
    }
    
    
    public boolean kiemTraTonTaiTS(HocSinh hs) {
        for (HocSinh hocSinh : dsHocSinh) {
            if(hocSinh.getMaHocSinh() == hs.getMaHocSinh()){
                return true;
            }
        }
        return false;
    }

    

    
    
    
    
    
    
    
    
}
