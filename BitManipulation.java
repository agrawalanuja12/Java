public class BitManipulation {
    
    public static void Oddeven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String args[]){

        Oddeven(5);
        Oddeven(12);
        Oddeven(14);
        Oddeven(17);

    //     System.out.println(5 & 6);// 5=101 , 6=110.. AND binary operator
    //     System.out.println(5 | 6);// OR B.operator
    //     System.out.println(5 ^ 6);// NOT op..
    //     System.out.println(~ 0);// complement op..
    //     System.out.println(~ 5);
    //     System.out.println((5<<2));// Leftshift op.. formula = a * (2^b)
    //     System.out.println((6>>1));// Rightshift op.. formula = a / (2^b)

    }
}
