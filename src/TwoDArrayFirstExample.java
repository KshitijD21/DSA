import java.util.Scanner;

public class TwoDArrayFirstExample {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextByte();
        int cols = sc.nextByte();
        int search = 11;

        int[][] nums = new int[rows][cols];
        for(int i=0; i<rows ; i++) {
            for (int j=0; j< cols; j++){
                nums[i][j]= sc.nextInt();
            }
         }

        for(int i=0; i<rows ; i++) {
            for (int j=0; j< cols; j++){
                if (nums[i][j] == search) {
                    System.out.println("number is in position of " + i + " " + j);
                }
            }
            System.out.println();
        }
    }
}
