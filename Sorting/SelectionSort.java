package Sorting;

public class SelectionSort {
    public static void main(String[]args){
        int arr[] = {5, 2, 8, 3, 10};
        SelectionSort ss = new SelectionSort();
        ss.sort(arr); 
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minimum = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minimum]){
                    minimum = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
        }
    }
}
