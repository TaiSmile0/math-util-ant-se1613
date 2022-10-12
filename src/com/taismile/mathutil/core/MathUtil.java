/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taismile.mathutil.core;

/**
 *
 * @author Tài Smile
 */
//Đây là class mô phỏng lại các hàm tiện ích dùng chung cho mọi class khác,
//mô phỏng lại class tiện ích java.Math của JDK
//Phàm cái gì là đồ dùng chung, thường được thiết kế là static 
public class MathUtil {
    public static final double PI = 3.141515960326;
    //hàm tiện ích tính n! = 1.2.3....n
    //lưu ý//quy ước:
    //- Không tính giai thừa số âm!!!
    //0! = 1! = 1
    //Vì giai thừa tăng cực nhanh, nên 21! đã vượt 18 số 0
    //tràn kiểu long
    //Ta không tính 21! trở lên
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid n, n must be between 0 to 20");
        }
        if(n == 0 || n == 1){
            return 1;
        }
        
        long product = 1;
        for (int i  = 2; i <= n; i++)
            product = product * i;
        
        return product;
    }
}
//CODING CONVENTION: QUY TẮC VIẾT CODE CÔNG TY ÉP PHẢI THEO
//ALT+SHIFT+F ĐỂ CĂN DÒNG TỰ ĐỘNG, NHƯNG KO LẠM DỤNG

// TA HỌC SƠ VỀ KHÁI NIỆM TDD - TEST-DRIVEN DEVELOPMENT
// LÀ KĨ THUẬT LẬP TRÌNH/ÁP DỤNG CHO DÂN DEVELOPER ĐỂ GIA TĂNG
// CHẤT LƯỢNG CODE//GIẢM THIỂU CÔNG SỨC TÌM BUG/PHÁT HIỆN BUG SỚM
// TDD yêu cầu dev khi viết code/viết hàm/viết class phải viết luôn
// các bộ kiểm thử/viết luôn các test cases/viết luôn các đoạn
// code dùng thử hàm/class để kiểm tra tính đúng đắn của hàm/class

// viết code kèm với viết test case
// viết code có ý thức viết luôn phần kiểm thử code/hàm/class
//      development driven                      test

// SAU KHI CÓ ĐC TÊN HÀM (CHỈ TÊN HÀM MÀ THÔI)
// TA VIẾT LUÔN CÁC TÌNH HUỐNG SAI HÀM
// CHẤP NHẬN KHI CHẠY HÀM CHẠY SAI - DO CODE CHƯA XONG
// SAU ĐÓ TA TỐI ƯU/CHỈNH SỬA CODE ĐỂ ĐẢM BẢO CODE CHẠY ĐÚNG!!!
// QUÁ TRÌNH SAI - ĐÚNG - SAI - ĐÚNG diễn ra liên tục (cycle)