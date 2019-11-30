public class Matrix {

    public static void main(String[] args) {
        double[][] m1 = generateIdentityMatrix(4);
        double[][]m2 = generateIdentityMatrix(8);

        printMatrix(m1);
        System.out.println();
        printMatrix(m2);

        double[][] m3 = {{1,2,4,5,10} , {0,1,0,2,1}};
        System.out.println();
        printMatrix(m3);
    }

    public static double [][] generateIdentityMatrix(int size){             // weil quadratisch nur eine Variable

        double[][] id = new double[size][size];                             //ab hier default wert 0.0

        for(int p = 0; p < size; p++){
            id[p][p] = 1.0;
        }
        return  id;
    }

    public static void printMatrix(double[][] matrix) {

        for(int z = 0; z < matrix.length; z++){
            for(int s = 0; s < matrix[z].length; s++ ){
                System.out.print(matrix[z][s] + "\t");
            }
            System.out.println();
        }

    }



}
