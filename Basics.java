import java.util.Scanner;

public class Basics {
    public void displayArray() {
        Scanner sc = new Scanner(System.in);
        //Input size of array
        int size = sc.nextInt();
        int[] array = new int[size];
        
        //Input array elements
        for(int i = 0; i<size; i++) {
            array[i] = sc.nextInt();    
        }

        //Display array elements
        for(int num: array) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Basics basics = new Basics();
        basics.displayArray();
    }
    
}
