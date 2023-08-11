public class RotateImage {
    static void rotate(int[][] ar){
        for (int i = 0; i<ar.length-1; i++){
            for (int j = i+1; j<ar.length; j++){
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }
        //reverse the matrix
        for (int i =0; i< ar.length; i++) {
            int left = 0;
            int right = ar[0].length-1;
            while (left < right){
                int temp = ar[i][left];
                ar[i][left] = ar[i][right];
                ar[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    static void printMatrix(int[][] ar){
        for (int[] row : ar) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
            int [][] ar = {{1,6,11,16,21},
                    {2,7,12,17,22},
                    {3,8,13,18,23},
                    {4,9,14,19,24},
                    {5,10,15,20,25}

            };
            printMatrix(ar);
            System.out.println();
            rotate(ar);
            printMatrix(ar);

        }
    }

