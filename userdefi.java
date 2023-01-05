import java.util.*;
 public class userdefi{
    public static void something(int a, int b){
        if(a>b){
            System.out.println("a > b");
        }
        else if(a == b){
            System.out.println("a = b");
        }
        else{
            System.out.println("a < b");
        }
    }
   public static void main (String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("enter A and B");
    int num1= scan.nextInt();
    int num2= scan.nextInt();
    something(10,12);
    }
 }