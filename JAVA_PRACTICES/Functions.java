class Functions {

    // function : block of code we can direct use.
    //method: block of code that can be used after creating an object . as function is called method when called from a object.

    public static void main (String []args){
       System.out.println(Calculate(2,3));   
       System.out.println(factorial(5));  
    }

    public static int Calculate(int n,int m)
    {
        int sum =n+m;
        return sum;
    }
    public static int factorial(int n){
        int fact =1;
        for(int i =n;i>=1;i--){
            fact=fact *i;
        }
        return fact;
    }
}
