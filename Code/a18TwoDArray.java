import java.util.*;

public class a18TwoDArray {
    public static void main(String[] args){
        // int[][] mat = new int[4][5];
        // // System.out.println(mat[0][0]);
        // for(int row = 0; row < 4; row++){
        //     for(int col = 0; col < 5; col++){
        //         System.out.print(mat[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
