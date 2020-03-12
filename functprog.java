
import java.util.*;
interface predicate
{
boolean test(String t);
}
class Demo
{
public static void main(String arg[])

{

Scanner scan=new Scanner(System.in); 
ArrayList<String> arr =new ArrayList<>();
 predicate obj=(String t)->{
           if(t.charAt(t.length()-1)=='o')
              return true;
           else
              return false;
               };
     

   while(true)
  {
    System.out.println("1.Enter the string \n 2. Filter the string \n 3. exit");
    int n=scan.nextInt();
    scan.nextLine();
    switch(n)
     {
       case 1:
        System.out.println("enter the string");
        arr.add(scan.nextLine());
       
       break;
       case 2:
       System.out.println("STRING WITH ENNDING O ARE:-");
        for (String s:arr)
         { 
           if(obj.test(s))
          System.out.println(s);
         }
          
         
    
      System.exit(0);
      default:
      System.exit(0);
          
          

      }

     }

   
 }
}

     
