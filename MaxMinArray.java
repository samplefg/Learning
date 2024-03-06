public class MaxMinArray {
    public static void main (String[]args){
        int [] array = {2, 4, 3, 1, 5};
        int max = getMax(array);

        int min = getMin(array);

        System.out.println(max);
        System.out.println(min);
    }

    public  static int getMax(int[]arr){
        int max = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max; 
    }

    public static int getMin(int[]arr){
        int min = 1;

        for(int i = 0; i > arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

}
