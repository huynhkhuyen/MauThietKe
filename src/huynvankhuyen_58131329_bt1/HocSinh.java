package huynvankhuyen_58131329_bt1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khuyen
 */
public class HocSinh extends CaNhan{
    private  String lop;
    private  String nangKhieu;

    public HocSinh() {
    }

    public HocSinh(String lop, String nangKhieu) {
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
    @Override
    public void hienThiTT(){
        System.out.println("Ho ten " + hoTen);
        System.out.println("Tuoi " + tuoi);
        System.out.println("Dia chi" + diaChi);
        System.out.println("So dien thoai" + sdt);
        System.out.println("Lop " + lop);
        System.out.println("Nang khieu " + nangKhieu);
}
}
