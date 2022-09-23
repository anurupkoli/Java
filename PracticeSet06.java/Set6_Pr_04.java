import java.util.Scanner;
public class Set6_Pr_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [][]matrix1 = new int[2][3];
        int [][]matrix2 = new int[2][3];
        int [][]matrixSum = new int[2][3];

        System.out.println("Enter the elements of 1st matrix: ");
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[i].length; j++){
                matrix1[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd matrix: ");
        for(int i=0; i<matrix2.length; i++){
            for(int j=0; j<matrix2[i].length; j++){
                matrix2[i][j] = s.nextInt();
            }
        }

        for(int i=0; i<matrixSum.length; i++){
            for(int j=0; j<matrixSum[i].length; j++){
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[i].length; j++){
                System.out.printf("%d ", matrix1[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("   +   ");
        
        for(int i=0; i<matrix2.length; i++){
            for(int j=0; j<matrix2[i].length; j++){
                System.out.printf("%d ", matrix2[i][j]);
            }
            System.out.println("");
        }

        System.out.println("   =   ");

        for(int i=0; i<matrixSum.length; i++){
            for(int j=0; j<matrixSum[i].length; j++){
                System.out.printf("%d ", matrixSum[i][j]);
            }
            System.out.println("");
        }
        s.close();
    }
}
