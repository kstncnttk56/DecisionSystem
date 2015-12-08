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
public class AssignmentManager {
    //Khai báo các bộ từ và các bộ giá trị tại đây

    public static final String[] job = {"rất cao", "cao", "trung bình", "thấp", "rất thấp"};
    public static final float[] job_value = {(float) 10, (float) 8, (float) 5, (float) 3, (float) 2};

    public static final String[] promotion = {"rất cao", "cao", "trung bình", "thấp", "rất thấp"};
    public static final float[] promotion_value = {(float) 10, (float) 8, (float) 6, (float) 4, (float) 2};

    public static final String[] language = {"thành thạo", "giỏi", "khá", "sử dụng được", "cơ bản", "không yêu cầu"};
    public static final float[] language_value = {(float) 10, (float) 8, (float) 6, (float) 4, (float) 2, (float) 1};

    public static final String[] importance = {"Quyết định", "Cực kì quan trọng", "Rất quan trọng", "Quan trọng", "Không quan trọng", "Không quan trọng lắm", "Không ảnh hưởng"};
    public static final float[] importance_value = {(float) 100, (float) 8.5, (float) 7, (float) 5.5, (float) 4, (float) 2.5, (float) 0};

    public static final String[] loveLevel = {"Rất rất thích", "Rất thích", "Thích", "Không thích lắm", "Không thích", "Ghét"};
    public static final float[] lovelevel_value = {(float) 100, (float) 8, (float) 6, (float) 4, (float) 2, (float) 0};

    //Khai báo các bộ gán tại đây..Có thể mở rộng tùy ý
    public static float Assign(String type, String value) {
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
        
        if (type.compareTo("importance") == 0) {
            for (int i = 0; i < importance.length; i++) {
                if (importance[i].compareTo(value) == 0) {
                    return importance_value[i];
                }
            }
        }
        
        if (type.compareTo("lovelevel") == 0) {
            for (int i = 0; i < loveLevel.length; i++) {
                if (loveLevel[i].compareTo(value) == 0) {
                    return lovelevel_value[i];
                }
            }
        }
        

        return 0;
    }

}
