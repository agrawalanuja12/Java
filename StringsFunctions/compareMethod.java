package StringsFunctions;

public class compareMethod {
    
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

    }
}
