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
public abstract class SinhVienIT extends SinhVienPoLy{
    double diemJV;
    double diemCss;
    double diemHtml;

    public SinhVienIT() {
    }

    public SinhVienIT(double diemJV, double diemCss, double diemHtml, String HoTen, String Nganh) {
        super(HoTen, Nganh);
        this.diemJV = diemJV;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public double getDiemJV() {
        return diemJV;
    }

    public void setDiemJV(double diemJV) {
        this.diemJV = diemJV;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

   
    
    @Override
    public double getDiem(){
        return (diemJV * 2 + diemHtml + diemCss)/4;
    }
}
