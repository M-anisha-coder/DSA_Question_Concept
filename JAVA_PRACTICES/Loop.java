import java.util.Scanner;
class  Loop {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //for loop
        for(int i =1;i<=10;i++){
            System.out.println(n+"x"+i+"="+ n*i);
        }

        //Nested for loop
        for(int i=1;i<=n;i++){
            for(int j =1 ;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //While loop
        int i=1; 
        while(i<=n){
            System.out.println(i);
            i++;
        }

        //do While loop
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<=n);

        sc.close(); // used to close scanner object
   
    }
}
