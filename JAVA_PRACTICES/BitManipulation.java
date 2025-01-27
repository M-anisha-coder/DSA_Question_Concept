import java.util.Scanner ;
class BitManipulation {
    
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        // Get bit 
        int a=5; //0101
        int pos =3; // postion start from 0 not 1
        int bitmask= 1<<pos;
        if((bitmask & a )== 0){
            System.out.println(pos+" position bit is 0");
        }
        else{
            System.out.println(pos +" position bit is 1");
        }

        //Set bit
        int newNumber = bitmask | a;
        System.out.println(newNumber);

        //clear bit 
        int notbitmask = ~(bitmask);
         newNumber = notbitmask & a;
        System.out.println(newNumber);

       //update bit 
       int updatebit = sc.nextInt();
       if(updatebit ==1){
         newNumber = bitmask | a;
        System.out.println(newNumber);
       }
       else{
         notbitmask = ~(bitmask);
         newNumber = notbitmask & a;
        System.out.println(newNumber);
       }

       sc.close();
    }
}
