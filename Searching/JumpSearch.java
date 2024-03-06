package Searching;

public class JumpSearch {
    public static void main(String[]args){
        int[] arr = {21, 27, 32, 41, 52, 68, 71, 89, 95};
        int key = 89;
        JumpSearch js = new JumpSearch();
        int position = js.search(arr, key);
        System.out.println(position);
    }
    public int search(int[] arr, int key){
        int position = -1;
        int block_size = 3;
        int start = 0;
        int end = start + block_size;
        while(position == -1){
            if(arr[start] > key){
               return -1;
            }else if(end <= arr.length-1){
                if(arr[start] == key){
                    return start;
                }else if(arr[end] == key){
                    return end;
                }else if(key < arr[end] && key > arr[start]){
                    return binarySearch(arr, start, end, key);
                }else{
                    start = end + 1;
                    end = start + block_size;
                }
            }else{
                return -1;
            }
        }

        return position;

    }

    public int binarySearch(int[] arr, int start, int end, int key){
        int mid =(start + end) / 2;
        if(arr[mid] == key){
            return mid;
        }else if(key < arr[mid]){
            return binarySearch(arr, start,  mid - 1, key);
        }else if(key > arr[mid]){
            return binarySearch(arr, end, mid + 1, key);
        }
        return -1;
    }
}
 