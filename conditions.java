import java.util.*;
public class conditions{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       // use of simple if_else statement...

       int age = sc.nextInt();
        if(age > 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not adult");
        }

        // use of repeative if_else statment....

        if(age>=18){
            System.out.println("Adult");
        }
        else if(age>=13 && age < 18){
            System.out.println("Teenager");
        }
        else {
            System.out.println("Child");
        }

        // find largest of two numbers....
        
        int A = 20;
        int B = 30;

        if (A>B){
            System.out.println("A is the largest");
        }
        else{
            System.out.println("B is the largest");
        }
       sc.close();
       

    }
}
