package st;

import java.util.Arrays;
import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,5,6,3,2,45};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, 2);
        System.out.println(index+" : "+arr[index]);




    }



}
