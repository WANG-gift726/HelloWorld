package Loop;

public class Triangle2 {
    public static void main(String[] args){
        int rows = 9;
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("i");
            }
            System.out.println();
        }
    }
}
