import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Basics {
   public int[] plusOne(int[] digits) {
    int n = digits.length;
    for(int i = n-1; i >= 0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }

        // digits[i] = 0;
    }

    int[] result = new int[n+1];
    result[0] = 1;


    return result;
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        int[] nums = {1,2,3,4};


        Basics obj = new Basics();
        // List<Integer> li = obj.spiralOrder(nums1);
        int[] k = obj.plusOne(nums);
        System.out.println("result :" + Arrays.toString(k));
    }
    
}
