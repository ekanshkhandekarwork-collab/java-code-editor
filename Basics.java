import java.util.Scanner;

public class Basics {
    public void displayArray() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        for(int i = 0; i<size; i++) {
            nums[i] = sc.nextInt();    
        }
        for(int num: nums) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Basics obj = new Basics();
        obj.displayArray();
    }
    
}
