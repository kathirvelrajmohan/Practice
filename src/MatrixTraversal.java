import java.util.Scanner;

public class MatrixTraversal {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,5},{2,4,5,6}};
        int x = 0;
        int y = 2;
        int ways = findWays(arr,x,y);
        System.out.println("Ways = "+ways);
    }
    static int findWays(int[][] arr,int x,int y){
        int row = arr.length;
        int column = arr[0].length;
        int[][] ways = new int[row][column];
        ways[row-1][column-1] = 1;
        for(int i = row-1;i>=x;i--){
            for(int j = column-1;j>=y;j--){
                if(i<row-1){
                    ways[i][j] += ways[i+1][j];
                }
                if(j<column-1){
                    ways[i][j] += ways[i][j+1];
                }
            }
        }
        return ways[x][y];
    }


}
