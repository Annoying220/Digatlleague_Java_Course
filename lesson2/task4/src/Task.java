public class Task {
    public static void main(String[] args) {
       int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sum(matrix));
    }

    public static int sum(int [][] arr) {

        int res;
res=arr[0][0]+arr[1][1]+arr[2][2];
return res;
    }
}