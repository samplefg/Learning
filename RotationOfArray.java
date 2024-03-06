public class RotationOfArray {
    private int[] array;

    RotationOfArray(int size){
        array = new int[size];
    } 
    
    //Right Rotation
    public void rotate(int pos){
        //code goes here
        
        int temp = array [ array.length-1];
        for(int i = array.length-1; i > pos; i--){
           array[i] = array[i-1];    
        }
        array[pos] = temp;
    }
    public static void main(String[] args) {
        RotationOfArray r = new RotationOfArray(5);
        r.array[0]=3;
        r.array[1]=2;
        r.array[2]=8;
        r.array[3]=5;
        r.array[4]=9;

        r.rotate(2);
        for(int i=0; i<r.array.length; i++){
            System.out.println(r.array[i]);
        }
    }
}
