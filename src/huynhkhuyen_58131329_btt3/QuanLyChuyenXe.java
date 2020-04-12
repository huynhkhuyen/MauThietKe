/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huynhkhuyen_58131329_btt3;

import java.util.ArrayList;

/**
 *
 * @author Khuyen
 */
public class QuanLyChuyenXe implements IQuanLyChuyenXe{
    ArrayList<ChuyenXe> DSCX = new ArrayList<>();

    @Override
    public void them(ChuyenXe cx) {
        DSCX.add(cx);
    }

    @Override
    public void inDS() {
        for (int i = 0; i < DSCX.size(); i++){
            DSCX.get(i).xuatThongTin();
        }
    }

    @Override
    public double tongDoanhThuXeNoiThanh() {
        double sum = 0;
        for (int i = 0; i < DSCX.size(); i++){
            ChuyenXe tam = DSCX.get(i);
            if(tam instanceof ChuyenXeNoiThanh){
                sum += tam.getDoanhThu();
            }
        }
        return sum;
    }

    @Override
    public double tongDoanhThuXeNgoaiThanh() {
        double sum = 0;
        for (int i = 0; i < DSCX.size(); i++){
            ChuyenXe tam = DSCX.get(i);
            if (tam instanceof ChuyenXeNgoaiThanh){
                sum += tam.getDoanhThu();
            }
        }
        return sum;
    }

    @Override
    public double tongDoanhThuHaiLoaiXe() {
        double sum = 0;
        for(int i = 0; i < DSCX.size(); i++){
            sum += DSCX.get(i).getDoanhThu();
        }
        return sum;
    }  
}