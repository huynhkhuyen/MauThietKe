/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huynhkhuyen_58131329_btt1;

import java.util.ArrayList;

/**
 *
 * @author Khuyen
 */
public class quanLyNhanVien implements IQuanLy{

     ArrayList<NhanVien> list = new ArrayList<>();

 
    
    
    @Override
    public void them(NhanVien nv) {
            list.add(nv);         
    }

    @Override
    public void inDS() {
        for(int i = 0;i < list.size(); i++)
            System.out.println(list.get(i).toString());
    }
 
}

