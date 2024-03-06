package Searching;

public class InterpolationSearch {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 0;
        int key = 9;
        int end = arr.length - 1;
        int position = -1;
        if(arr[start] > key || arr[end] < key){
            System.out.println("key is not present in array");
        }
        while(position == -1){
            int x = key - arr[start];
            int y = arr[end] - arr[start];
            int z = end - start;
            float k = ((float)x/y) * z;//typecast
            int pos = start + (int)k;
            if(arr[pos] == key){
                position = pos;
                System.out.println(position);
            }else if(arr[pos] < key){
                start = pos + 1;
            }else if(arr[pos] > key){
                end = pos - 1;
            }
        }
    }
}
