//import java.util.*;
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

    public static float getShortestPath(String path){
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

            // south...
            if(dir == 'S'){
                y--;
            }
            // west...
            else if(dir == 'W'){
                x--;
            }
            // north...
            else if(dir == 'N'){
                y++;
            }
            // east...
            else{
                x++;
            }
        } 
        int X2= x*x;
        int Y2= y*y;
        return (float)Math.sqrt(X2 + Y2);
        
    }

    public static void main(String args[]){

        String s1 = "Great";
        String s2 = "Great";
        String s3 = new String("Great");

        if (s1 == s2){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
        if (s1 == s3){  
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }

        // Compare method in string....
        if(s1.equals(s2)){
        System.out.println("strings are equal");
    }else{
        System.out.println("strings are not equal");
    }
    if (s2.equals(s3)){
        System.out.println("strings are equal");
    }else{
        System.out.println("strings are not equal");
    }


        // String path = "WNEENESENNNSSS";
        // System.out.println(getShortestPath(path));

        // String str = "racectcar";
        // System.out.println(ispallindrome(str));
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
    // // System.out.println(Fullname.charAt(14)); // search element from string.....
    // printletter(Fullname);

    }
}
