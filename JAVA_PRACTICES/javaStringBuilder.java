//import java.util.scanner;

class javaStringBuilder {
   public static void main(String[] args) {
    StringBuilder sb= new StringBuilder("Mani");
    
      //find  character present at any index
      System.out.println(sb.charAt(0));

      //Set character at any index
      sb.setCharAt(2, 'h');
      System.out.println(sb);

      // insert 
      sb.insert(0,"hello");
      System.out.println(sb);

      //delete 
      sb.delete(0,5);
      System.out.println(sb);

      //append (adding at end)
      sb.append("sha");
      System.out.println(sb);

      //length
      System.out.println(sb.length());



      //reverse the string: by Storing char value
      // we have use sb.length ()/2 as are replace the two value at once.
      for (int i=0 ;i<sb.length()/2;i++){
         int ifront =i;
         int iback = sb.length()-1-i;
         char frontchar =sb.charAt(ifront);
         char backchar =sb .charAt(iback);

         sb.setCharAt(ifront, backchar);
         sb.setCharAt(iback, frontchar);
      }
      System.out.println(sb);

   

   } 
}

