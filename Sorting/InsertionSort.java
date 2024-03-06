package Sorting;

public class InsertionSort {
    public static void main(String[]args){
        int arr[] = {800, 519, 524, 694, 908, 920, 330, 896};
        InsertionSort is = new InsertionSort();
        is.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public void sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && key < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
