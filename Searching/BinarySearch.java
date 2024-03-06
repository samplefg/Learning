package Searching;

public class BinarySearch {
    public static void main(String[]args){
        int[] arr = {6, 10, 15, 25, 31, 55, 65, 70, 89};
        int start = 0;
        int end = arr.length-1;
        int key = 70;
        BinarySearch bs = new BinarySearch();
       int position = bs.search(arr, start, end, key);
       System.out.println(position);  
    }
    //Binary search using Recursion 
    public int search(int[] arr, int start, int end, int key){
        int mid = (start + end)/2;
        if(arr[mid] == key){
            return mid;
        }else if(key < arr[mid]){
            return search(arr, start, mid - 1, key);
        }else if(key > arr[mid]){
            return search(arr, mid + 1, end, key);
        }
        return -1;

    }
}
