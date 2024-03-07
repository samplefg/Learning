package HackerRankQuestionPrac;

public class JavaSubstringsComparisons {
    public static void main(String[]args){
        int k = 3;
        String s = "welcometojava";
        int heighestAlphabateposition = 0;
        int lowestAlphabateposition = 0;
        char[] str = s.toCharArray();
        char  heighestAlphabate = str[0];
        char lowestAlphabate = str[0];
        for(int i = 0; i < str.length; i++){
           int c1 = Character.compare(str[i], lowestAlphabate);
           int c2 = Character.compare(str[i], heighestAlphabate);
           if(c1 < 0){
            lowestAlphabate = str[i];
            lowestAlphabateposition = i;
           }
           if(c2 > 0){
            heighestAlphabate = str[i];
            heighestAlphabateposition = i;
           }
        } 
        char[] small = new char[k];
        for(int i = 0; i < small.length; i++){
            small[i] = str[lowestAlphabateposition + i];
        }
        char[] large = new char[k];
        for(int i = 0; i < large.length; i++){
            large[i] = str[heighestAlphabateposition + i];
        }
        String smallest = new String(small);
        String largest = new String(large);
        System.out.println(smallest);
        System.out.println(largest);
    }
}
