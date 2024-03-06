package Sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[]args){
        int [] arr = {1, 2, 5, 3, 1, 4, 7, 2, 4, 7};
        CountSort cs = new CountSort();
        cs.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void sort(int[] arr){
        int find = Arrays.stream(arr).max().getAsInt();
        int size = find + 1;
        int[] count = new int[size]; 
        for(int i: arr){
            count[i]++;
        }
        int k = 0;
        for(int i = 0; i < count.length; i++){
            int c = count[i];
            for(int j = 0; j < c; j++){
                arr[k] = i;
                k++;
            }
        }

    }
}
