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
public class HuynhKhuyen_58131329_BTT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SinhVienPoLy SV1 = new SinhVienIT(8.0, 7.0, 7.0, "Huynh Van Khuyen", "CNTT"){};
       System.out.println(SV1.Nganh);
       SV1.Xuat();
       SinhVienPoLy SV2 = new SinhVienBiz(8.0, 7.5, "Vu Anh Thu", "Thuong Mai") {
       };
        System.out.println(SV2.Nganh);
       SV2.Xuat();
    }
    
}
