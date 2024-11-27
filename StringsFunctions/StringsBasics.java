package StringsFunctions;
import java.util.*;
public class StringsBasics {

    /*strings are immutable....
     because of time complexity O(n^2)
     for printing large numbers of strings */
     
    public static void printletter(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");

        }
        System.out.println();
    }

    public static void main(String args[]){

        
        // char arr[] = {'a','b','c','d','e'};
        // String str1 = "abcde";
        // String str2 = new String("xyz");

        // Strings are IMMUTABLE in java.....
        
        //for input...
        Scanner sc = new Scanner(System.in);
        String name;
       name = sc.next();
       name = sc.nextLine();
       System.out.println(name);
        sc.close();

    String fullname = "Anuja Agrawal";
    System.out.println(fullname.length());

    String Firstname = "Anuja";
    String Lastname = "Agrawal";
    String Fullname = Firstname + " " + Lastname; // Concatenation method.....
    System.out.println(Fullname);
    System.out.println(Fullname.charAt(14)); // search element from string.....
    printletter(Fullname);

    }
}
