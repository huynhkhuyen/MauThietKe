/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huynhkhuyen_58131329_btt2;

/**
 *
 * @author Khuyen
 */
public abstract class SinhVienBiz extends SinhVienPoLy{
    double diemMarketing;
    double diemSales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double diemMarketing, double diemSales, String HoTen, String Nganh) {
        super(HoTen, Nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem(){
        return (2 * diemMarketing + diemSales)/3;
    }
}
