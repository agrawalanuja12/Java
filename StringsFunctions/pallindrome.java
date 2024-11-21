package StringsFunctions;

public class pallindrome {
      // to find a string is pallindrome or not..
public static boolean ispallindrome(String str){

    for(int i=0;i<str.length    ()/2; i++){
      int n= str.length();
      if(str.charAt(i) != str.charAt(n-1-i)){
      // not a palindrome...
      return false;
      }
    }
    return true;
}

public static void main (String args[]){

    String str = "racecar";
    System.out.println(ispallindrome(str)); // calling pallindrome method...
}
}
