public class MaxMin {
    public static void main(String[] args) {
        long n = 6;
        long[] arr = {3, 2, 1, 56, 10000, 167};

        //Calling getMinMax method
        pair product = getMinMax(arr, n);

        //Printing the result
        System.out.println("min = " + product.first + " " + "max = " + product.second); //Output- {5 ,1, 2, 3, 4}
    }

    //Find minimum and maximum element in an array
    static pair getMinMax(long[] a, long n) {
        pair data = new pair(a[0], a[0]);
        for(int i = 1; i < n; i++) {
            if(a[i]< data.first) {
                data.first = a[i];
            }
            if(a[i]> data.second) {
                data.second = a[i];
            }
        }
        return data;
    }
}

//User function Template for Java

 class pair
{
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}

