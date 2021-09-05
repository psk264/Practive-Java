import java.util.ArrayList;
import java.util.ListIterator;

public class Solution {

    public static int reverse(int x) {
        //given contrain : If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
        if(x <= -2147483648 || x> 2147483646) return  0;
        boolean isNegative = x <0;
        x=Math.abs(x);
        boolean quit = false;
        int power = 1;
        ArrayList<Integer> output = new ArrayList<>();
        while(!quit){
            if(!(x>=10)){
                quit=true;
            }
            int n = x % (int) 10;
            x = x / 10;
            output.add(n);
            power++;
            //   x = x - n;

        }
        int returnValue =0;
        int len = output.size();
        ListIterator<Integer> it = output.listIterator();
        for (int i=len-1; i>=0;i--){

            if(it.hasNext()) {
                returnValue += Math.pow(10, i) * it.next();
            }

        }
        if(returnValue < -2147483648 || returnValue> 2147483646) return  0;

        if(isNegative) {
            returnValue = Math.negateExact(returnValue);
        }
        return returnValue;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(10));
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-1563847412));
        System.out.println(reverse(-2147483648));
    }
}
