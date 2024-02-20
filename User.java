import java.util.*;
class First
{
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    First()
    {
        for(int i=1; i<a.length; i++)
        {
            System.out.println("Enter a numbers: ");
            a[i] = sc.nextInt();
        }
    }
}
class Second extends First
{   
    Second()
    {
       for(int i=1; i<a.length; i++)
    {
       if(a[i]%2==0)
      {
        System.out.println("the number is " + a[i] + "is even");
      }
    else
    {
        System.out.println("the number is " + a[i] + "is odd");
    }
  }
}  
}
public class User {

    public static void main(String[] args){
        Second s= new Second();
    }
    
}
