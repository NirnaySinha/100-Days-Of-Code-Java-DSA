import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the no. of rows: ");
      int rows = sc.nextInt();
      System.out.println("Enter the no. of columns: ");
      int cols = sc.nextInt();

      for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols; j++){
            if(i == 0 || i == rows - 1 || j == 0 || j == cols - 1){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
      }
        sc.close();
    }
}
