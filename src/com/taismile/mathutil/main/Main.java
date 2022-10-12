/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taismile.mathutil.main;

import com.taismile.mathutil.core.MathUtil;

/**
 *
 * @author Tài Smile
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This statement comes from the main() method");
        tryTDDFirst();
        //testFactorialGivenWrongArgumentThrowsException();
    }
    
    public static void testFactorialGivenWrongArgumentThrowsException(){
        //Test case #3: đưa data cà chớn, n âm, n quá lớn
        //              hàm đc thiết kế ném về ngoại lệ!!!
        //Thấy ngoại lệ mừng rơi nc mắt khi đưa vào -5
        //thấy ngoại lệ xuất hiện như kì vọng -> passed cái test -> màu xanh
        System.out.println("Hope to see the Exception | Illegal Argument Exception");
        MathUtil.getFactorial(-5);
    }
    
    //hàm này đc viết ra để dùng thử kĩ thuật viết code kiểu TDD
    //gọi thử/dùng thử hàm chính bên core// bên MathUtil xem nó sai đúng ra sao
    //ở ngay mức khởi đầu viết hàm
    public static void tryTDDFirst() {
        //Test case #1 (tình huống kiểm thử hàm số 1/xài thử hàm):
        //- Input: n = 1;
        //- Gọi hàm getFactorial(1)
        //- Hy vọng hàm trả về 1, vì 1! = 1
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        //so sánh expected vs. actual coi chúng nó giống nhau hong?
        //giống -> hàm đúng với case đang test
        //sai   -> bug rồi!!! với case đang test
        System.out.println("Test 1! | Status: "+
                                    "Expected: "+expected+
                                    " | Actual:"+actual);
    }
}
//TEST CASE LÀ GÌ?
//Là 1 tình huống xài app/kiểm thử app/kiểm thử tính năng/màn hình
//chức năng/xử lí của app
//Test case là tình huống kiểm thử app/chức năng mà khi đó
//ta phải
//- đưa vào data giả/mẫu test,
//- đưa ra giá trị kì vọng ta mong chờ app trả ra
//sau đó chờ hàm/tính năng xử lí xong trả ra kết quả!!!
//và ta nhìn kết quả và ta so sánh với kì vọng trước đó!!!
//để kết luận hàm hoạt động ổn/tính năng ổn
