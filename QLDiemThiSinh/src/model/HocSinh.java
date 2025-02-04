/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.*;
public class HocSinh implements Serializable{
    private int maHocSinh;
    private String tenHocSinh;
    private Tinh queQuan;
    private Date ngaySinh;
    private boolean gioiTinh;
    private float diemMieng, diem15Phut, diem1Tiet, diemCuoiKy;

    public HocSinh() {
    }

    public HocSinh(int maThiSinh, String tenThiSinh, Tinh queQuan, Date ngaySinh, boolean gioiTinh, float diemMieng, float diem15Phut, float diem1Tiet, float diemCuoiKy) {
        this.maHocSinh = maThiSinh;
        this.tenHocSinh = tenThiSinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemMieng = diemMieng;
        this.diem15Phut = diem15Phut;
        this.diem1Tiet = diem1Tiet;
        this.diemCuoiKy = diemCuoiKy;
    }

    public int getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(int maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public String getTenHocSinh() {
        return tenHocSinh;
    }

    public void setTenHocSinh(String tenHocSinh) {
        this.tenHocSinh = tenHocSinh;
    }

    public Tinh getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(Tinh queQuan) {
        this.queQuan = queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getDiemMieng() {
        return diemMieng;
    }

    public void setDiemMieng(float diemMieng) {
        this.diemMieng = diemMieng;
    }

    public float getDiem15Phut() {
        return diem15Phut;
    }

    public void setDiem15Phut(float diem15Phut) {
        this.diem15Phut = diem15Phut;
    }

    public float getDiem1Tiet() {
        return diem1Tiet;
    }

    public void setDiem1Tiet(float diem1Tiet) {
        this.diem1Tiet = diem1Tiet;
    }

    public float getDiemCuoiKy() {
        return diemCuoiKy;
    }

    public void setDiemCuoiKy(float diemCuoiKy) {
        this.diemCuoiKy = diemCuoiKy;
    }

    @Override
    public String toString() {
        return "ThiSinh{" + "maThiSinh=" + maHocSinh + ", tenThiSinh=" + tenHocSinh + ", queQuan=" + queQuan + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diemMieng=" + diemMieng + ", diem15Phut=" + diem15Phut + ", diem1Tiet=" + diem1Tiet + ", diemCuoiKy=" + diemCuoiKy + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.maHocSinh;
        hash = 83 * hash + Objects.hashCode(this.tenHocSinh);
        hash = 83 * hash + Objects.hashCode(this.queQuan);
        hash = 83 * hash + Objects.hashCode(this.ngaySinh);
        hash = 83 * hash + (this.gioiTinh ? 1 : 0);
        hash = 83 * hash + Float.floatToIntBits(this.diemMieng);
        hash = 83 * hash + Float.floatToIntBits(this.diem15Phut);
        hash = 83 * hash + Float.floatToIntBits(this.diem1Tiet);
        hash = 83 * hash + Float.floatToIntBits(this.diemCuoiKy);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HocSinh other = (HocSinh) obj;
        if (this.maHocSinh != other.maHocSinh) {
            return false;
        }
        if (this.gioiTinh != other.gioiTinh) {
            return false;
        }
        if (Float.floatToIntBits(this.diemMieng) != Float.floatToIntBits(other.diemMieng)) {
            return false;
        }
        if (Float.floatToIntBits(this.diem15Phut) != Float.floatToIntBits(other.diem15Phut)) {
            return false;
        }
        if (Float.floatToIntBits(this.diem1Tiet) != Float.floatToIntBits(other.diem1Tiet)) {
            return false;
        }
        if (Float.floatToIntBits(this.diemCuoiKy) != Float.floatToIntBits(other.diemCuoiKy)) {
            return false;
        }
        if (!Objects.equals(this.tenHocSinh, other.tenHocSinh)) {
            return false;
        }
        if (!Objects.equals(this.queQuan, other.queQuan)) {
            return false;
        }
        if (!Objects.equals(this.ngaySinh, other.ngaySinh)) {
            return false;
        }
        return true;
    }

   
    
    
}
