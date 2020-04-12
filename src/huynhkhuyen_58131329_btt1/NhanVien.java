/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huynhkhuyen_58131329_btt1;

import java.util.Scanner;

/**
 *
 * @author Khuyen
 */
public class NhanVien {
    String ten;
    String tuoi;
    String diaChi;
    Double tienLuong;
    int tongGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, String tuoi, String diaChi, Double tienLuong, int tongGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }
 
    public void getThongTin(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ten=" + ten + ", tuoi=" + tuoi + ", diaChi=" + diaChi + ", tienLuong=" + tienLuong + ", tongGioLam=" + tongGioLam + '}';
    }

    public double  tienThuong(){
        if(tongGioLam >= 200)
               return tienLuong*0.2;
        else 
            if(tongGioLam < 200 && tongGioLam >= 100)
                return tienLuong *0.1;
        else
                return 0;
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(Double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }
    
}
