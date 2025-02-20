package module01.lesson01;
import java.util.Scanner;

public class MatrixMaxFinder {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a:");
        int a=scanner.nextInt();

        System.out.println("Enter b:");
        int b=scanner.nextInt();

        int[][]matrix=new int[a][b];

        System.out.println("Enter the matrix elements:");
        for(int i=0;i<a;i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("[" +i +"]["+ j +"]");
                matrix[i][j] = scanner.nextInt();

            }

        }
        int maxElement=matrix[0][0];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if (matrix[i][j]>maxElement){
                    maxElement=matrix[i][j];

                }
            }
        }
        System.out.println("The largest number is:" +maxElement);





    }
}
