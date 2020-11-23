public class Task {
    public static void main(String[] args) {
        int[][] matrix={{1,8,33},{4,50,6},{7,8,90},{110,12,13},{111,11,12,13}};
        System.out.println(maxValue(matrix));


    }

    public static int maxValue(int [][] arr) {
        int max=0;
        int second [];
    for (int i=0;i<arr.length;i++){
        second = arr[i];
        for (int j=0;j<second.length;j++){
        if (max<arr[i][j])
        {
            max=arr[i][j];
        }


        }

    }
        return max;

    }
}