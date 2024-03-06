package Sorting;

public class BubbleSort {
    public static void main(String[]args){
         int arr[] = {5, 2, 8, 3, 10};
         BubbleSort bs = new BubbleSort();
         bs.sort(arr);
         for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
         }
    }

    public void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    
}
