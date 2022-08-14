import java.io.*;

import java.util.*;

public class maxofnarray {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int []a = new int[n];

        for (int i = 0; i < n; i++)
        {
            a[i] = scn.nextInt();
        }
        int max = maxOfArray(a, 0);
        System.out.println(max);

    }

    public static int maxOfArray(int[] arr, int idx) {

        if (idx >= arr.length)
        {
            return Integer.MIN_VALUE;
        }

        int misa = maxOfArray(arr, idx + 1); 
        if (arr[idx] > misa)
        {
            return arr[idx];
        }
        return misa;

    }

}