import java.util.Scanner;
class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        // Conditional Statement
        if (n > 0) {
            System.out.println("n is lesser");
        } else if (n == 0) {
            System.out.println("n is zero");
        } else {
            System.out.println("n is bigger");
        }
        // Switch Cases12
        switch (n) {
            case 1:
                System.out.println("n is 1");
                break;
            case 2:
                System.out.println("n is 2");
                break;
            default:
               System.out.println("default case");
                break;
        }
        sc.close(); // used to close scanner object
    }
}
