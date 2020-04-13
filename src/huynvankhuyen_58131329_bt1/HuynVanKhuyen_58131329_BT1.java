/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huynvankhuyen_58131329_bt1;

/**
 *
 * @author Khuyen
 */
public class HuynVanKhuyen_58131329_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LopHoc lh = new LopHoc();
       HocSinh HS1 = new HocSinh("8Th1", "choi game", "Huynh Van Khuyen", 1, "Quang nam", "0383827057");
       HocSinh HS2 = new HocSinh("8Th2", "Dua xe", "Phan Trong Nghia", 0, "Quang Nam", "113");
       lh.themHocSinh(HS2);
       lh.themHocSinh(HS1);
       lh.inDSHS();
       
       
    }

  
    }
