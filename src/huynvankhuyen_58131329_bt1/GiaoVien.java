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
public class GiaoVien extends CaNhan{
    private  String monDay;
    private  String toBoMon;

    public GiaoVien() {
    }

    public GiaoVien(String monDay, String toBoMon) {
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    public String getHoTen() {
        return hoTen;
    }

    @Override
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    @Override
    public void hienThiTT(){
        System.out.println("Ho ten" + hoTen);
        System.out.println("tuoi" + tuoi);
        System.out.println("dia chi" + diaChi);
        System.out.println("So dien thoai" + sdt);
        System.out.println("mon day" + monDay);
        System.out.println("to bo mon" + toBoMon);
    }
}
