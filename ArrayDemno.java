public class ArrayDemno {
    public static void main(String[] args) {
        //Array is a collection of homogenous items.
        //memory: continous
        //size : fixed size
        //in java : memory is been allocated dynamically.
        //syntex: data_type[] variable_name={};
//        long[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        long[][] arr = new long[3][2];
        //[[1,1],[1,1],[1,1]]
        //multidimentional array is a collection of multiple arrays
        //syntex dt[][] array_name = new dt[(rows)compulsory][(columns)optional]
        //itterating array
        //1.
        //System.out.println(arr[3].length);
        //inserting the array data
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j< arr[i].length; j++) {
//                if(j%2==0){
//                    arr[i][j] = 1;
//                }else{
//                    arr[i][j] = 0;
//                }
//            }
//        }//[[1,0],[1,0],[1,0]]
        // i=0    true    i++
               // j=0  j<2 true   j++
               // 0%2 == 0 true
               //arr[0][0] = 1;
               //j = 1 j<2 true j++
               //1%2 == 0 false
               //arr[0][1] = 0;
              //j=2  j<2 false
        //i=1  true   i++
              //j=0 j<2 true  j++
              //0%2 ==0  true
              //arr[1][0] = 1;
             //j=1 j<2 true  j++
             //1%2 == 0 false
             //arr[1][1] = 0;
             //j=2 j<2 false
        //i = 2 true   i++
             //j=0  j<2 true  j++
             //0%2 = 0 true
             //arr[2][0] = 1;
             //j=1 j<2 true j++
             //1%2 == 0 false
            //arr[2][1] = 0;
            //j=2 j<2 false
        //i=3 false

        //2.
//        int i = 0;
//        while (i < arr.length) {
//            i++;
//        }
        //displaing the array data
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j< arr[i].length; j++) {
//                System.out.print(arr[i][j]+",");
//            }
//            System.out.println();
//        }

        //variable [];
        //i = 0;    true    arr[0]=1;   i++;
        //i = 1;    true    arr[1]=1;   i++;
        //i = 2;    true    arr[2]=1;   i++;
        //i = 3;    false

//        int x = 3;
//        System.out.println(++x * 8);

        /*
        * Operator Precedence
Operators	    Precedence
postfix	    	expr++ expr--
unary	    	++expr --expr +expr -expr ~ !
multiplicative	 * / %
additive	    	+ -
shift		    << >> >>>
relational		< > <= >= instanceof
equality		  == !=
bitwise 	    AND	&
bitwise 	    exclusive OR	^
bitwise 	    inclusive OR	|
logical 	    AND	&&
logical 	    OR	||
ternary		    ? :
assignment		    = += -= *= /= %= &= ^= |= <<= >>= >>>=

        * */
    }
}
