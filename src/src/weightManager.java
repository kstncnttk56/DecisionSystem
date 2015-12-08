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
public class weightManager {

    String[] impWeiString;
    String[] impStaString;
    float[] importancePoint;

    String[] preWeiString;
    String[] preStaString;
    float[] preferPoint;

    public weightManager(String[] importanceWeightString, String[] importanceStandardString,
            float[] importancePoint, String[] preferWeightString, String[] preferStandardString,
            float[] preferPoint) {
        this.impWeiString = importanceWeightString;
        this.impStaString = importanceStandardString;
        this.importancePoint = importancePoint;

        this.preWeiString = preferWeightString;
        this.preStaString = preferStandardString;
        this.preferPoint = preferPoint;
    }

    //Xay dung bo trong so chia co tong tat ca
    public float[] getPreferWeight() {
        int M = preWeiString.length;
        int N = preStaString.length;
        float[] weight = new float[M];  //Mang luu tru bo trong so 
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (preWeiString[i].equals(preStaString[j])) {
                    weight[i] = preferPoint[j];
                    break;
                }
            }
        }

        float sum = 0;
        for (int i = 0; i < M; i++) {
            sum += weight[i];
        }
        for (int i = 0; i < M; i++) {
            weight[i] = weight[i] / sum;
        }

        return weight;
    }

    //Xay dung bo trong so chia co tong tat ca
    public float[] getImportanceWeight() {
        int M = impWeiString.length;
        int N = impStaString.length;
        float[] weight = new float[M];  //Mang luu tru bo trong so 
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (impWeiString[i].equals(impStaString[j])) {
                    weight[i] = importancePoint[j];
                    break;
                }
            }
        }

        float sum = 0;
        for (int i = 0; i < M; i++) {
            sum += weight[i];
        }
        for (int i = 0; i < M; i++) {
            weight[i] = weight[i] / sum;
        }

        return weight;
    }

//    public static void main(String[] args) {
//        String[] importance = AssignmentManager.importance;
//        String[] prefer = AssignmentManager.loveLevel;
//
//        weightManager manager = new weightManager(importance, AssignmentManager.importance, AssignmentManager.importance_value, prefer, AssignmentManager.loveLevel, AssignmentManager.lovelevel_value);
//        float[] A = manager.getImportanceWeight();
//        float[] B = manager.getPreferWeight();
//        float sum = 0;
//        for (int i = 0; i < A.length; i++) {
//            sum += A[i];
//            System.out.print(A[i] + "   ");
//        }
//        System.out.println(sum);
//        System.out.println("");
//        float tong = 0;
//        for (int i = 0; i < B.length; i++) {
//            tong += B[i];
//            System.out.print(B[i] + "   ");
//        }
//        System.out.println(tong);
//    }

}
