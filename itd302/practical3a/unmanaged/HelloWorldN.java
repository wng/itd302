public class HelloWorldN 
{
   public static void main(String[] args) 
   {
       if (args.length > 0) 
       {
           int n = Integer.parseInt(args[0]);
           for (int i=0; i<n; i++) 
           { 
              for (int j=0; j<=i; j++) {
                 System.out.print("Hello World! "); 
              }
              System.out.println();
           }
       } 
       else { System.out.println("Hello World!");  }
   }
}

