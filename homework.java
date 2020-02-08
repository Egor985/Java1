package homework;

import java.util.Arrays;
import java.util.Random;

public class homework {

    static void f(int n){
        int counter = 0;
        for (int i = 1; i <=n; i++){
            for (int j = 0; j < i; j++){
                System.out.print("(");
            }
            for (int j = 0; j < i; j++){
                System.out.print(")");
            }
        }
    }

    //0 0 1 0 0
    //0 1 1 1 0
    //1 1 1 1 1
    //0 1 1 1 0
    //0 0 1 0 0
    static void fillDiag(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length-i-1] = 1;
        }
    }

    public static void main(String[] args) {



//        int [][] m = new int[5][5];
//        fillDiag(m);
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < 5; j++){
//                System.out.print(m[i][j] + " ");
//            }
//            System.out.println();
//        }

    }

}
