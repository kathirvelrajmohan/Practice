public class Matrix1 {
    public static void main(String[] args){
        int[][] arr = new int[][]{{5,7,8},{6,10,20},{8,7,3}};
        int x = 1;
        int y = 1;
        int[][] ans = maxvalue(arr,x,y);
        System.out.println(ans[x][y]);
    }
    static int[][] maxvalue(int[][] arr,int x,int y) {
        int max = arr[x][y];
        if(x-1>=0 && max < arr[x-1][y]){
            max = arr[x-1][y];
        }
        if (x+1 < arr.length && max<arr[x+1][y]) {
            max = arr[x+1][y];
        }
        if(y-1>=0 && max<arr[x][y-1]){
            max = arr[x][y-1];
        }
        if(y+1 < arr.length && max<arr[x][y+1]){
            max = arr[x][y+1];
        }

        arr[x][y] = max;
        return arr;
    }
}

