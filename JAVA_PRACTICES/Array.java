import java.util.Scanner;
class Array {
    
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        //Defining Array (array has same type of elements)
        //type [] arrayName = new type[size];
        //type  arrayName [] = new type[size];
        //type [] arrayName ={value 1,value 2,value 3......value arraysize};
        // In java if we don't initialize array or variable it will store default value like for object it will store null, for int it will store 0. 
        // to find the size of array we can use length method "arrayName.lenghth".
        int [] marks  = new int[arraySize];
        for(int i =0;i<arraySize; i++){
            marks[i]=sc.nextInt();
            System.out.println("Array elements "+i+" "+marks[i]);
        }
        System.out.println(marks); // this will give you garbage value.

        // Linear Search
        System.out.print("Enter number to search in Array: ");
        int number = sc.nextInt();
        int index =-1;
        for(int i=0;i<arraySize;i++){
            if(number == marks[i]){
                index=i;
            }
        }

         System.out.println("Number found at index "+ index);

       sc.close();
    }
}
