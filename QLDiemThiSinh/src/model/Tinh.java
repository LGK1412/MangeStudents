/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author thaii
 */
public class Tinh implements Serializable{

    public static Tinh getTinhById(int queQuan) {
        return Tinh.getDSTinh().get(queQuan);
    }

    public static Tinh getTinhByTen(String tenTinh) {
        ArrayList<Tinh> listTinh = Tinh.getDSTinh();
        for (Tinh tinh : listTinh) {
            if(tinh.tenTinh.equals(tenTinh)){
                return tinh;
            }
        }
        return null;
    }
    private int maTinh;
    private String tenTinh;

    public Tinh(int maTinh, String tenTinh) {
        this.maTinh = maTinh;
        this.tenTinh = tenTinh;
    }

    public int getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(int maTinh) {
        this.maTinh = maTinh;
    }

    public String getTenTinh() {
        return tenTinh;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }

    @Override
    public String toString() {
        return "Tinh{" + "maTinh=" + maTinh + ", tenTinh=" + tenTinh + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.maTinh;
        hash = 19 * hash + Objects.hashCode(this.tenTinh);
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
        final Tinh other = (Tinh) obj;
        if (this.maTinh != other.maTinh) {
            return false;
        }
        return Objects.equals(this.tenTinh, other.tenTinh);
    }
    
    public static ArrayList<Tinh> getDSTinh(){
        String[] arr_Tinh = {
            "Hà Giang",
            "Cao Bằng",
            "Lào Cai",
            "Sơn La",
            "Lai Châu",
            "Bắc Kạn",
            "Lạng Sơn",
            "Tuyên Quang",
            "Yên Bái",
            "Thái Nguyên",
            "Điện Biên",
            "Phú Thọ",
            "Vĩnh Phúc",
            "Bắc Giang",
            "Bắc Ninh",
            "Hà Nội",
            "Quảng Ninh",
            "Hải Dương",
            "Hải Phòng",
            "Hòa Bình",
            "Hưng Yên",
            "Hà Nam",
            "Thái Bình",
            "Nam Định",
            "Ninh Bình",
            "Thanh Hóa",
            "Nghệ An",
            "Hà Tĩnh",
            "Quảng Bình",
            "Quảng Trị",
            "Thừa Thiên Huế",
            "Đà Nẵng",
            "Quảng Nam",
            "Quảng Ngãi",
            "Kon Tum",
            "Gia Lai",
            "Bình Định",
            "Phú Yên",
            "Đắk Lắk",
            "Khánh Hòa",
            "Đắk Nông",
            "Lâm Đồng",
            "Ninh Thuận",
            "Bình Phước",
            "Tây Ninh",
            "Bình Dương",
            "Đồng Nai",
            "Bình Thuận",
            "Thành phố Hồ Chí Minh",
            "Long An",
            "Bà Rịa – Vũng Tàu",
            "Đồng Tháp",
            "An Giang",
            "Tiền Giang",
            "Vĩnh Long",
            "Bến Tre",
            "Cần Thơ",
            "Kiên Giang",
            "Trà Vinh",
            "Hậu Giang",
            "Sóc Trăng",
            "Bạc Liêu",
            "Cà Mau"};
        
        ArrayList<Tinh> listTinh = new ArrayList<>();
        int i = 0;
        for (String tenTinh : arr_Tinh) {
            Tinh t = new Tinh(i, tenTinh);
            listTinh.add(t);
        }
        return listTinh;
    }

    
}
