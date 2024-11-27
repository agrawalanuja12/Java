package StringsFunctions;

public class StringBuild {

    public static String toUpperCase(String str1){

      // time complexity O(n)....

        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str1.charAt(0));
        sb.append(ch);

        for(int i=1; i<str1.length();i++){
            if(str1.charAt(i) == ' ' && i<str1.length()-1){
                sb.append(str1.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str1.charAt(i)));
            }else{
                sb.append(str1.charAt(i));
            }

        }
        return sb.toString();

    }
    public static String Compress(String str){

        // time complexity O(n)...
        
        String newStr = "";
        for(int i=0; i<str.length();i++){
          Integer count = 1;
          while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
          }
          newStr += str.charAt(i);
          if(count > 1){
            newStr += count.toString();
          }
        }
        return newStr;
    }
    
    public static void main(String args[]){
        String str = "aaaaabbbbcccddddddd";
        System.out.println(Compress(str));

        String str1 = "hii , i am anuja";
        System.out.println(toUpperCase(str1));

        StringBuilder sb = new StringBuilder("");
        for (char ch='a'; ch<='z';ch++){
        sb.append(ch);// string ke pichhe jodne ke liye append ka use
        }
        // abcdefghijklmnop......
        // time complexity O(26)....bcz this loop runs 26 times
        
        System.out.println(sb);

    }
   
}
