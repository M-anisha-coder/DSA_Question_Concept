import java.util.Scanner;
class Array_2D{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col =sc.nextInt();
        //Declaring 2D array
        // type [][] arrayname= new type [row][col];
        int array [][]= new int [row][col];
        //input
        for(int i=0;i<row;i++){

            for(int j=0;j<col;j++){
                array[i][j]=sc.nextInt();
            }
           
        }

        //output
        for(int i=0;i<row;i++){

            for(int j=0;j<col;j++){
                //System.out.println("array element "+ i+ " "+j+ " "+array[i][j]);
                System.out.print(array[i][j]+" ");
            }
           System.out.println();
        }
        //linear Search
        System.out.print("Enter number for search : ");
        int number = sc.nextInt();
        
        for(int i =0; i<row ;i++){
            for(int j =0;j<col;j++){
                if(array[i][j]==number){
                    System.out.println("element found at row : "+i +" and column "+ j);
                }
            }
        }

        sc.close(); // used to close scanner object

    }
    
}