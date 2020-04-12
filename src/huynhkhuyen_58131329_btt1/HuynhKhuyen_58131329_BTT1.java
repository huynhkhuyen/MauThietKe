/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huynhkhuyen_58131329_btt1;

/**
 *
 * @author Khuyen
 */
public class HuynhKhuyen_58131329_BTT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        quanLyNhanVien ql = new quanLyNhanVien();
        NhanVien NV1;
        NV1 = new NhanVien("huynh van khuyen", "25", "Quang Nam", 12000.0, 200);
        NV1.getThongTin();
        NhanVien NV2;
        NV2 = new NhanVien("phan trong nghia", "22", "Quang Nam", 10000.0, 100);
        NV2.getThongTin();
        NhanVien NV3;
        NV3 = new NhanVien("Mai duong thao", "22", "Quang Nam", 10000.0, 150);
        NhanVien NV4;
        NV4 = new NhanVien("Nguyen Hoang Hai", "22", "Khanh Hoa", 12000.0, 0);
        NhanVien NV5 ;
        NV5 = new NhanVien("Tran Thi Thach Thao", "22", "Quang Tri", 10000.0, 0);
        ql.them(NV1);
        ql.them(NV2);
        ql.them(NV3);
        ql.them(NV4);
        ql.them(NV5);
        ql.inDS();
    } ;
}

    
