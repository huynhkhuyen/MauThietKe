/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huynhkhuyen_58131329_btt3;

/**
 *
 * @author Khuyen
 */
public class HuynhKhuyen_58131329_BTT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
    
        ChuyenXe N1 = new ChuyenXeNoiThanh(15,20,"abc123","HuynhVanKhuyen","92G123578",15000);
        ChuyenXe N2 = new ChuyenXeNoiThanh(10, 20, "abc124", "Ho Ngoc Ha", "47B123456", 20000);
        
        ChuyenXe N3 = new ChuyenXeNgoaiThanh("Cam Ranh", 2, "abc125", "Phan trong nghia", "92E134521", 220000);
        ChuyenXe N4 = new ChuyenXeNgoaiThanh("Nha Trang", 1, "abc126", "Son Tung", "51B222222", 200000);

        
        qlcx.them(N1);
        qlcx.them(N2);
        qlcx.them(N3);
        qlcx.them(N4);
        
        qlcx.inDS();
        
        System.out.println("Tong doanh thu xe noi thanh: " + qlcx.tongDoanhThuXeNoiThanh());
        System.out.println("Tong doanh thu xe ngoai thanh: " + qlcx.tongDoanhThuXeNgoaiThanh());
        System.out.println("Tong doanh thu ca hai xe: " + qlcx.tongDoanhThuHaiLoaiXe());
    }
}
