package Sorting;

public class MergeSort {
    public static void main(String[]args){
        int arr[] = {2, 5, 7, 4, 6, 3, 1};
        MergeSort ms = new MergeSort();
        ms.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void sort(int[] arr){
        int n = arr.length;
        if(n < 2){
            return;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for(int i = 0; i < mid; i++){
            left[i] = arr[i]; 
        }
        for(int j = mid; j < n; j++){
            right[j-mid] = arr[j]; 
        }
        sort(left);
        sort(right);
        merge(left, right, arr);
    }
    public void merge(int[] left, int[] right, int[] arr){
        int nl = left.length;
        int nr = right.length;
        int i, j, k;
        i = j = k = 0;
        while(i < nl && j < nr){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        } 
        while(i < nl){
            arr[k] = left[i];
            i++;
            k++;
        } 
        while(j < nr){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
