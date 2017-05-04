package com.prashant.experiments;

/**
 * Determining whether a given array is toeplitz matrix or not.
 *
 * https://en.wikipedia.org/wiki/Toeplitz_matrix
 *
 * @author prgupta
 *
 */
public class ToeplitzMatrixCheck {

        public static void main(String[] args) {

                /*
                 * 0,0 == 1,1 --> 2==2
                 * 0,1 == 1,2 --> 3==3
                 * 0,2 == 1,3 --> 4==4
                 * 1,0 == 2,1 --> 6==6
                 * 1,1 == 2,2 --> 2==2
                 * .....
                 */
        int [][] arr2d = {
                                  {2,3,4,5},
                                  {6,2,3,4},
                                  {8,6,2,3},
                                  {9,8,6,2}
                                 };

        boolean isToeplitz = checkToeplitz(arr2d);
        System.out.println("Is it toeplitz matrix [" + isToeplitz + "]");
        }

        private static boolean checkToeplitz(int[][] arr2d) {

                boolean isToeplitz = true;
        for(int i=0; i<arr2d.length-1; i++ ) {
                for(int j=0; j<arr2d[i].length-1; j++) {
                        if (arr2d[i][j] != arr2d[i+1][j+1]) {
                                isToeplitz = false;
                                break;
                        }
                }

                  // Short Circuit
                if (!isToeplitz) break;
        }

        return isToeplitz;
        }
}
