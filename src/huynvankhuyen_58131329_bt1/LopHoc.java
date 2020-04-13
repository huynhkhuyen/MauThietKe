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
public class LopHoc {
    QuanLyDanhSach dsHS;
    QuanLyDanhSach dsGV;
    GiaoVien CN;

    public LopHoc() {
    }

    public LopHoc(QuanLyDanhSach dsHS, QuanLyDanhSach dsGV, GiaoVien CN) {
        this.dsHS = dsHS;
        this.dsGV = dsGV;
        this.CN = CN;
    }

    public QuanLyDanhSach getDsHS() {
        return dsHS;
    }

    public void setDsHS(QuanLyDanhSach dsHS) {
        this.dsHS = dsHS;
    }

    public QuanLyDanhSach getDsGV() {
        return dsGV;
    }

    public void setDsGV(QuanLyDanhSach dsGV) {
        this.dsGV = dsGV;
    }

    public GiaoVien getCN() {
        return CN;
    }

    public void setCN(GiaoVien CN) {
        this.CN = CN;
    }

    public int themHocSinh(HocSinh x){
        dsHS.them(x);
        return 1;
    }
    public int themGiaoVien(GiaoVien y){
        dsGV.them(y);
        return 1;
    }
    public int inDSHS(){
        dsHS.inDS();
        return 1;
    }
    public int inDSGV(){
        dsGV.inDS();
        return 1;
    }
}
