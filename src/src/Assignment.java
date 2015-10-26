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
public class Assignment {
    //Khai báo các bộ từ và các bộ giá trị tại đây

    private static final String[] job = {"rất cao", "cao", "trung bình", "thấp", "rất thấp"};
    private static final int[] job_value = {10, 8, 5, 3, 2};

    private static final String[] promotion = {"rất cao", "cao", "trung bình", "thấp", "rất thấp"};
    private static final int[] promotion_value = {10, 8, 6, 4, 2};

    private static final String[] language = {"thành thạo", "giỏi", "khá", "sử dụng được", "cơ bản", "không yêu cầu"};
    private static final int[] language_value = {10, 8, 6, 4, 2, 1};

    //Khai báo các bộ gán tại đây..Có thể mở rộng tùy ý
    public static int Assign(String type, String value) {
        if (type.compareTo("job") == 0) {
            for (int i = 0; i < job.length; i++) {
                if (job[i].compareTo(value) == 0) {
                    return job_value[i];
                }
            }
        }

        if (type.compareTo("promotion") == 0) {
            for (int i = 0; i < promotion.length; i++) {
                if (promotion[i].compareTo(value) == 0) {
                    return promotion_value[i];
                }
            }
        }

        if (type.compareTo("language_requirement") == 0) {
            for (int i = 0; i < language.length; i++) {
                if (language[i].compareTo(value) == 0) {
                    return language_value[i];
                }
            }
        }

        return 0;
    }

}
