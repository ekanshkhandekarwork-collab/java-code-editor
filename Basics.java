import java.util.Scanner;

public class Basics {
    public void displayArray() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i = 0; i<size; i++) {
            array[i] = sc.nextInt();    
        }
        for(int num: array) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Basics obj = new Basics();
        obj.displayArray();
    }
    
}
