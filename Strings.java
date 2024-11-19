import java.util.*;
public class Strings {
    public static void printletter(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");

        }
        System.out.println();
    }

    public static boolean ispallindrome(String str){

        for(int i=0;i<str.length()/2; i++){
          int n= str.length();
          if(str.charAt(i) != str.charAt(n-1-i)){
          // not a palindrome...
          return false;
          }
        }
        return true;
    }
    
    public static void main(String args[]){

        String str = "racectcar";
        System.out.println(ispallindrome(str));
    //     // char arr[] = {'a','b','c','d','e'};
    //     // String str1 = "abcde";
    //     // String str2 = new String("xyz");

    //     // Strings are IMMUTABLE in java.....
        
    //     //for input...
    //     Scanner sc = new Scanner(System.in);
    //     String name;
    //   // name = sc.next();
    //    name = sc.nextLine();
    //    System.out.println(name);
    //     sc.close();

    // // String fullname = "Anuja Agrawal";
    // // System.out.println(fullname.length());

    // String Firstname = "Anuja";
    // String Lastname = "Agrawal";
    // String Fullname = Firstname + " " + Lastname; // Concatenation method.....
    // // System.out.println(Fullname);
    // // System.out.println(Fullname.charAt(14));
    // printletter(Fullname);

    }
}
