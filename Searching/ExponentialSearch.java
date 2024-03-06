package Searching;

public class ExponentialSearch {
    public static void main(String[]args){
        int[] arr = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int key = 18;
        ExponentialSearch es = new ExponentialSearch();
        int position = es.search(arr, key);
        System.out.println(position);
        
    }
    public int search(int[]arr, int key){
        int start = 0;
        if(arr[start] == key){
            return 0;
        }
        int i = 1;
        int n = arr.length;
        while(i < n && arr[i] <= key){
            i = i * 2;
        }
        return binarySearch(arr, i/2, Math.min(i, n - 1), key); 

    }
    public int binarySearch(int[] arr, int start, int end, int key){
        int mid = (start + end)/2;
        if(arr[mid] == key){
            return mid;
        }else if(key < arr[mid]){
            return binarySearch(arr, start, mid - 1, key);
        }else if(key > arr[mid]){
            return binarySearch(arr, mid - 1, end, key);
        }
        return -1;
    }
}
