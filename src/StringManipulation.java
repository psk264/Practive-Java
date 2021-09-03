import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StringManipulation {
    public static void main(String[] args){

//        List<Integer> subarray= getSubArray(new int[]{1,5,8,2,9,2,3,5,8,0}, 5);
//        int n= subarray.size();
//        System.out.println((int)Math.pow(2,n)-1);
//        for(int n1:subarray){
//            System.out.println(n1);
//        }
        System.out.println("------Test reverseString() function-------");
        System.out.println(reverseString("Hello World!"));

//        DVD[] dvdCollections = new DVD[5];
//        dvdCollections[0] = new DVD("Star wars", 1960, "war in the galaxy");
        System.out.println("------Test isUnique() function-------");
        System.out.println(isUnique("Priya"));
        System.out.println(isUnique("Hello World"));

        System.out.println("------Test URLify() function-------");
        System.out.println(URLify("Mr John Smith   ", 13));

        System.out.println("------Test compressedString() function-------");
        System.out.println(compressedString("Priya"));
        System.out.println(compressedString("aaabbcbbbaa"));

        System.out.println("------Test findSubsetEqualstoN() function-------");
        int[] output =  findSubsetEqualstoN(new int[] {6,1,3,4}, 7);
        for(int n : output) {
            System.out.println(n);
        }

        System.out.println("------Test isRotationString() function-------");
        System.out.println(isRotationString("waterbottle", "erbottlewat"));

        System.out.println("------Test joinStrings() function-------");
        String[] input = {"Hello", "World!", "from", "NYC"};
        System.out.println(joinStrings(input, false));
        System.out.println(joinStrings(input, true));

    }

    //return reverse string.  Another approach is to use Stringbuilder.reverse()
    public static String reverseString(String input){
        int n= input.length();
        if(n<=1) return input;
        char[] output = new char[n];
        char[] char_arr = input.toCharArray();

        for (char ch:char_arr
             ) {
            output[n-1]=ch;
            n--;
        }
        return String.copyValueOf(output);
    }

    /** Get subarray from given array **/
    public static List<Integer> getSubArray(int[] numbers, int k){
        List<Integer> result = new ArrayList<Integer>();

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<k){
                result.add(numbers[i]) ;
            }
        }
        return result;

    }


    /** Check if a string has all unique chars **/

    public static boolean isUniqueString(String s){
        if(s.length()<=1) return true;
        int n=s.length();
        for (char ch : s.toCharArray()){
            for(int i=0; i<n; i++){
                if(s.indexOf(ch) == i) continue;
                if(ch == s.toCharArray()[i]) return false;
            }
        }
        return true;
    }

    public static boolean isUnique(String s){
        int checker=0;
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i) - 'a';
//            System.out.println(val);
            if((checker & (1 << val)) >0 ){
//                System.out.println(1 << val);
                return  false;
            }
          checker |= (1<<val);
//            System.out.println(checker);
        }
        return true;
    }

   public static String URLify(String s, int len){
        if(s.indexOf(' ')  == -1) return s;
        if(s.length() !=len) {
            s= s.trim();
        }
       StringBuilder output = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch!=' ') {
                output.append(ch);
            }
            else {
                output.append("%20");
            }

        }
        return String.valueOf(output);
   }

   public static String compressedString(String s){
        if(s.length()<=1) return s;
        int n= s.length();
        StringBuilder output = new StringBuilder();
        int count = 0;
        for( int i=0; i<n;i++){
            count++;

            if (i+1<n && s.charAt(i) != s.charAt(i+1)){
                output.append(s.charAt(i));
                output.append(count);
                count=0;
            }
        }
        return String.valueOf(output);
   }

   public static int[] findSubsetEqualstoN ( int[] arr, int n){
       int[] output = new int[2];
       if(arr.length == 1) {
           if(arr[0] == n) {
               return arr;
           }
           else if (arr[0]!=n) return output;
       }
       for(int i=0;i<arr.length-1;i++){
           int diff = n-arr[i];
           if(diff == arr[i+1]){
               output[1]=diff;
               output[0]=arr[i];
               return output;
           }

       }
       return output;
   }

   /*INCOMPLETE**/
//   public static void printAllPermutation(String s){
//        if(s.length()==1){
//            System.out.println(s);
//            return;
//        }
//       char[] charArr = s.toCharArray();
//       int n = s.length();
//       int[] perm_group = IntStream.range(1,n).toArray();
//       int counter=1;
//       for(int i=1;i<n;i++){
//           for(int j=0;j<n;j++){
//               if(i==1){
//                   System.out.println(s.substring(j,i));
//               }
//               if(i==2){
//                   System.out.println(s.substring(j,i));
//               }
//           }
//
//       }
//
//
//   }

   public static boolean isRotationString(String s1, String s2){
       if(s1.length() == 0 || s2.length() == 0) return false;
       if(s1.length() == s2.length() & s1.length() >0){
           String s1s1 = s1 + s1;
           return isSubstring(s1s1,s2);
       }
       return false;
   }

   public static boolean isSubstring(String s1, String s2){
       return s1.contains(s2);
   }

   public static String joinStrings(String[] str_arr, boolean withSpace){
       StringBuilder output = new StringBuilder();
       for(String s : str_arr){
           if(withSpace) output.append(s + " ");
           else output.append(s);
       }
       return  output.toString();
   }
}
