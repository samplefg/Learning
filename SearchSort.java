public class SearchSort {
    public static void main(String[]args){
        int[] arr = new int[50];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*(500 - 100 + 1)+100);
        }
        //Call the method to sort the array
        

        
        
        //array print after sorting
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        //Call the method to search the elements present in the array bellow
        int[] searchData = {104,121,250,290,340,370,441,447,289,arr[12],arr[39],arr[42]};
        // search these elements in the array 'arr' if the element is present then return an array with the
        //positions of these elements in the array 'arr'. if the element is not in the array then position
        //is -1.
        
        
        //positions of the element are printed after the search
        for (int i = 0; i < searchData.length; i++) {
            System.out.print(searchData[i]+" ");
        }
    }
    
}

