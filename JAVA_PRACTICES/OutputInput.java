import java.util.Scanner;

class OutputInput{
    public static void main(String [] args){
        //Input  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Output
        System.out.print("Hello World!\n");
        System.out.print(n);
        System.out.println("End of World!");
        
        sc.close(); // used to close scanner object
    } 

}