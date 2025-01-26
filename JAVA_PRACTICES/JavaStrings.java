import java.util.Scanner;
class JavaStrings {
    
    public static void main(String args []){
        //Strings are immutable.
        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // take only first word
        String Firstname = sc.nextLine();
        String lastname = sc.nextLine(); // take full sentence

        //Concatenation
        String Fullname =Firstname+ " "+lastname;
        System.out.println( "your name is "+Fullname);

        //length Method
        System.out.println(Fullname.length());

        //charAt Method
       for(int i =0; i<Fullname.length(); i++){
        System.out.println(Fullname.charAt(i));
       }

       //Compare string
       String s1 ="Mani";
       String s2 ="Mani";

        // Cases to comapare
        // 1. s1 >s2 : +ve
        // 2. s1=s2 : 0
        // 3. s2 >s1 : -ve

       if(s1.compareTo(s2)==0){ //why we have not use s1 == s2
        System.out.println("equal");

       }
       else{
        System.out.println("not equal");
       }

       // because some times it give wrong answere as shown below
       if (new String("Mani")==new String("Mani")){
        System.out.println("equal");
       }
       else{
        System.out.println("not equal ");
       }

       //Substrings
       //substring[beg index,end index] end index is exclusive.
       String sentence ="I will join Google";
       String substringsentence = sentence.substring(12, sentence.length());
       System.out.println(substringsentence);
       




    }
}
