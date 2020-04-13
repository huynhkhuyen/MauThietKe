package huynvankhuyen_58131329_bt1;


import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khuyen
 */
public class QuanLyDanhSach implements iQuanLyDanhSach{

  ArrayList<CaNhan> ds;

    public QuanLyDanhSach() {
        ds = new ArrayList();
    }
    
    @Override
    public int them(CaNhan p) {
        ds.add(p);
      return 1;
}

    @Override
    public int xoa(String Ten) {
        for(int i = 0; i < ds.size(); i++)
            if(ds.get(i).hoTen.equals(Ten))
                ds.remove(i);
        return 1;
    }

    @Override
    public void inDS() {
        for(int i = 0; i < ds.size(); i++)
            ds.get(i).hienThiTT();
        }
}
