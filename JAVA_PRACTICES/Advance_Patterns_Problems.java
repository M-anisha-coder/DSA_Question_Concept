// TIP: for pattern question take outer loop as row & inner loop as column.
import java.util.Scanner;
class Advance_Patterns_Problems {
    public static void main(String [] args){
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();

    //1. Butterfly pattern 
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
    //Upper Half
    for(int i=1;i<=n;i++){
        //star print
        for(int j=1 ;j<=i;j++){
            System.out.print("*");
        }
        //Space print
        int space= 2*(n-i);
        for(int j =1;j<=space;j++){
            System.out.print(" ");
        }

        //star print
        for(int j=1 ;j<=i;j++){
            System.out.print("*");
        }
        
        //next line
        System.out.println();

    }
    // lower half
    for(int i=n;i>=1;i--){
        //star print
        for(int j=1 ;j<=i;j++){
            System.out.print("*");
        }
        //Space print
        int space= 2*(n-i);
        for(int j =1;j<=space;j++){
            System.out.print(" ");
        }

        //star print
        for(int j=1 ;j<=i;j++){
            System.out.print("*");
        }
        
        //next line
        System.out.println();

    }



    //2. Hollow butterfly
    // *        *
    // **      **
    // * *    * *
    // *  *  *  *
    // *   **   *
    // *   **   *
    // *  *  *  *
    // * *    * *
    // **      **
    // *        *
    //Upper Half
    for(int i=1;i<=n;i++){
        //star loop
        for(int j =1;j<=i;j++){
            if(i==1||j==1||j==i){
                System.out.print("*");   
            }
            else{
                System.out.print(" ");
            }
        }
        //space loop
        int space = 2*(n-i);
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }

        for(int j =1;j<=i;j++){
            if(i==1||j==1||j==i){
                System.out.print("*");   
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();


    }

    for(int i=n;i>=1;i--){
        //star loop
        for(int j =1;j<=i;j++){
            if(i==1||j==1||j==i){
                System.out.print("*");   
            }
            else{
                System.out.print(" ");
            }
        }
        //space loop
        int space = 2*(n-i);
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }

        for(int j =1;j<=i;j++){
            if(i==1||j==1||j==i){
                System.out.print("*");   
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();


    }

    // 3.Parallelogram
//      *****
//     *****
//    *****
//   *****
//  *****
    for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    //4.Hollow Parallelogram
    for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n){
                System.out.print("*");

            }
            else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }

    //5.Reactangle
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    //6.Hollow Reactangle
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }
    //7. Number Pyramid
//      1 
//     2 2 
//    3 3 3 
//   4 4 4 4 
//  5 5 5 5 5 
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    //8. Palindromic pattern
//      1
//     212
//    32123
//   4321234
//  543212345
// 65432123456
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
       for(int j=2;j<=i;j++){
          System.out.print(j);
       }
        System.out.println();
    }
    //9.Diamond Pattern
//      *
//     ***
//    *****
//   *******
//   *******
//    *****
//     ***
//      *
    for(int i=1;i<=n;i++){
        //space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        int space =2*i-1;
        for(int j=1;j<=space;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        //space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        int space =2*i-1;
        for(int j=1;j<=space;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    //10. Hollow Diamond
//      *
//     * *
//    *   *
//   *     *
//  *       *
//  *       *
//   *     *
//    *   *
//     * *
//      *
    for(int i=1;i<=n;i++){
        //space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        int space =2*i-1;
        for(int j=1;j<=space;j++){
            if(i==1||j==1||j==space){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        //space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        int space =2*i-1;
        for(int j=1;j<=space;j++){
            if(i==1||j==1||j==space){
            System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }










   //11. Pascal’s Triangle.
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1
   for(int i=1;i<=n;i++){
    for(int j=1; j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
      //logic
      if(j==1||j==i){
        System.out.print(1+" ");
      }
      else{
        System.out.print("* ");
      }
    }
    System.out.println();
   }















   //12. Print half Pyramid.
//     1 
//    1 2 
//   1 2 3 
//  1 2 3 4 
// 1 2 3 4 5 
    for (int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    //13.Inverted Half Pyramid.
// 1 1 1 1 
//  2 2 2 
//   3 3 
//    4 
    for (int i=1;i<=n;i++){
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }
        for(int j=n ;j>=i;j--){
           System.out.print(i+" ");
        }
       System.out.println();
    }




}
}
