
public class typePromotion {
    public static void main(String args[]){
        
        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte) (a+b+c);

        System.out.println(bt);
    }
}
