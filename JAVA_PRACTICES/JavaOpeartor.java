
class JavaOpeartor {
    
    public static void main(String args []){
        int a=2; 
        int b=5;
        double c=5.0;
        //Arithmetic Operator
        //binary operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a); // Result 2 as b & a both are int.
        System.out.println(c/a); // Result 2.5 as c is double.
        System.out.println(b%a); // Give reminder 1
        System.out.println(c%a); // Give reminder 1.0

        //unary operator 
        System.out.println(a++); // first assign then increment that why a=2
        //a=3 after above statement
        System.out.println(++a); //first increament then assign that why a=4 
        System.out.println(b--);  // first assign then decreament that why b=5
         //b=4 after above statement
        System.out.println(--b); //first increament then assign that why b=3


        // Relation operator or Comparision operators
        // they always return boolean value
        System.out.println(3>2); 
        System.out.println(3<2);
        System.out.println(2<=3);
        System.out.println(3>=3);
      //  System.out.println(3==3.0); //this is returning true.
      //  System.out.println(3!=3.0);

        // logical Opearators
        // && return true if all are true
        System.out.println(true && true);
        // || return true if any one is true.
        System.out.println(false || true);
        // ! return reverse 
        System.out.println(!(true));
        

        //Assigment Operators
        int x=2; 
        System.out.println(x+=2);
        System.out.println(x-=2);
        System.out.println(x*=2);
        System.out.println(x/=2);
        System.out.println(x%=2);

        //bitwise operator 
        // perform operator in binary wher t=1 ,f=0
        int n =5;
        int m=6;
        System.out.println(n & m); // if all t then t
        System.out.println(n | m); // if any t then t
        System.out.println(n ^ m); // if all differnt than t same f
        System.out.println(~n); // invert all bits return value in 2's complemnt (-(n+1))
        System.out.println(n<<2); // return n* (2 power 2)
        System.out.println(n>>1); // return n/(2 power 2)
       

        
    
    }
}
