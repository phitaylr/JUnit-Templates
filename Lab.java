public class Lab{
   public static void main(String[] args){
      System.out.println("Hello, world!");
   }
   
   public static int getMax(int a, int b){
      if(a>b)
         return a;
      return b;
   }
   
   public static int getMax(int[] arr){
      int max=arr[0];
      for(int a : arr)
         if(a > max)
            max = a;
      return max;
   }
   
   public static void printHello(String name){
      System.out.println("Hello, "+name+"!");
   }
   
   public static String getGreeting(String name){
      return "Hello, "+name+"!";
   }
   
   public static String zipString(String a, String b){
      String out="";
      for(int i=0;i<a.length()-1; i++){
         out += a.substring(i,i+1)+b.substring(i,i+1);
      }
      return out;
   }
}