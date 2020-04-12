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
public abstract class SinhVienPoLy {
    protected String HoTen;
    protected String Nganh;

    public SinhVienPoLy() {
    }

    public SinhVienPoLy(String HoTen, String Nganh) {
        this.HoTen = HoTen;
        this.Nganh = Nganh;
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
    public abstract double getDiem();
    public String getHocLuc(){
        if(getDiem() < 5)
            return "Yeu";
        else
            if(getDiem()>= 5 && getDiem() < 6.5)
                return "Trung Binh";
            else
                if(getDiem() >= 6.5 && getDiem() < 7.5)
                    return "Kha";
                else
                    if(getDiem() >= 7.5 && getDiem() < 9)
                        return "Gioi";
                    else
                         return "Xuat Sac";
    }
    public void Xuat(){
        System.out.println( "Ho va ten " + HoTen + "Nganh " + Nganh + "Diem" + getDiem()+  "Hoc luc" + getHocLuc());
    }
    
}
