public class RotateArray {
    public static void main(String[] args) {
        //Assigning elements
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};

        //Calling rotate method
        RotateArray obj = new RotateArray();
        obj.rotate(arr, n);

        //Printing the result
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n;i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb); //Output- {5 ,1, 2, 3, 4}
    }

    //Cyclically rotate an array by one
    void rotate(int[] arr, int n)
    {
        int i, temp = arr[n - 1];
        for(i = n -1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}
