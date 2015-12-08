/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author NguyenVanDung
 */
public class StandadizedMethod {

    public StandadizedMethod() {

    }

    //Viết hàm từ tên phương pháp chuẩn hóa phương pháp tại đây
    //name là tên phương pháp
    //value là mảng giá trị cần được chuẩn hóa
    //name      phuong phap
    //1         thuộc tính loi nhuan chia cho tong
    //2         thuoc tin loi nhuan chia cho tong binh phuong
    //3         thuoc tin loi nhuan chia cho max
    //-1        bien doi max - aij roif dung 1
    //-2        bien doi max - aij roif dung 2
    //-3        bien doi max - aij roif dung 3
    //0         dung phuong phap cho thuoc tinh khong tuyen tinh
    public float[] standadize(byte name, float[] value, float best) {  /* do soemthing here*/

        switch (name) {
            case 1:
                return benefitAtrribute1(value);
            case 2:
                return benefitAtrribute2(value);
            case 3:
                return benefitAtrribute3(value);
            case -1:
                return costAttribute1(value);
            case -2:
                return costAttribute2(value);
            case -3:
                return costAttribute3(value);
            case 0:
                return nonLinearAttribute(value, best);
        }

        return null;
    }

    //thuộc tính giá chia cho tong
    public float[] benefitAtrribute1(float[] input) {
        int N = input.length;
        float sum = 0;
        if (N == 0) {
            return null;
        }
        for (int i = 0; i < N; i++) {
            sum += input[i];
        }

        if (sum == 0) {
            return null;
        }

        for (int i = 0; i < N; i++) {
            input[i] = input[i] / sum;
        }

        return input;
    }

    //thuoc tin gia chia cho tong binh phuong
    public float[] benefitAtrribute2(float[] input) {
        int N = input.length;
        float sum = 0;
        if (N == 0) {
            return null;
        }
        for (int i = 0; i < N; i++) {
            sum += input[i] * input[i];
        }

        if (sum == 0) {
            return null;
        }

        sum = (float) Math.sqrt((double) sum);
        for (int i = 0; i < N; i++) {
            input[i] = input[i] / sum;
        }

        return input;
    }

    //thuoc tin gia chia cho max
    public float[] benefitAtrribute3(float[] input) {
        int N = input.length;

        if (N == 0) {
            return null;
        }
        float max = input[0];
        for (int i = 0; i < N; i++) {
            max = input[i] > max ? input[i] : max;
        }

        if (max == 0) {
            return null;
        }

        for (int i = 0; i < N; i++) {
            input[i] = input[i] / max;
        }

        return input;
    }

    //Thuoc tinh gia su dung benefitAtrribute1 bien doi tu max - aij
    public float[] costAttribute1(float[] input) {
        int N = input.length;
        if (N == 0) {
            return null;
        }
        float max = input[0];
        for (int i = 0; i < N; i++) {
            max = input[i] > max ? input[i] : max;
        }

        for (int i = 0; i < N; i++) {
            input[i] = max - input[i];
        }

        return benefitAtrribute1(input);
    }
    //Thuoc tinh gia su dung benefitAtrribute2 bien doi tu max - aij

    public float[] costAttribute2(float[] input) {
        int N = input.length;
        if (N == 0) {
            return null;
        }
        float max = input[0];
        for (int i = 0; i < N; i++) {
            max = input[i] > max ? input[i] : max;
        }

        for (int i = 0; i < N; i++) {
            input[i] = max - input[i];
        }

        return benefitAtrribute2(input);
    }

    //Thuoc tinh gia su dung benefitAtrribute3 bien doi tu max - aij
    public float[] costAttribute3(float[] input) {
        int N = input.length;
        if (N == 0) {
            return null;
        }
        float max = input[0];
        for (int i = 0; i < N; i++) {
            max = input[i] > max ? input[i] : max;
        }

        for (int i = 0; i < N; i++) {
            input[i] = max - input[i];
        }

        return benefitAtrribute3(input);
    }

    //Thuoc tinh khong tuyen tinh
    public float[] nonLinearAttribute(float[] input, float best) {
        float phuongsai = 0;
        int N = input.length;
        if (N == 0) {
            return null;
        }
        for (int i = 0; i < N; i++) {
            phuongsai += (input[i] - best) * (input[i] - best);
        }
        if (N == 1) {
            phuongsai = 0;
        } else {
            phuongsai /= N - 1;
        }

        phuongsai = (float) Math.sqrt((double) phuongsai);

        for (int i = 0; i < N; i++) {
            input[i] = (input[i] - best) / phuongsai;
            input[i] = (float) Math.pow(Math.E, (-1) * input[i] * input[i] / 2);
        }

        return input;
    }

    public static void main(String[] args) {
        StandadizedMethod st = new StandadizedMethod();
        float[] A = {10, 20, 37, 40, 50, 60, 70, 80, 90, 100};

        A = st.standadize((byte) 1, A, 37);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

    }
    //Viết các hàm là các phương pháp chuẩn hóa
}
