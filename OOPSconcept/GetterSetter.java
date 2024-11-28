package OOPSconcept;
public class GetterSetter {
   public static void main(String args[]){
    Pen1 p1=new Pen1();

    p1.setColor("Black");
    System.out.println(p1.getColor());
    p1.setTip(100);
    System.out.println(p1.getTip());
   }
}
class Pen1{
   private String color;
   private int tip;

   String getColor(){
    return this.color;
   }
   int getTip(){
    return this.tip;
   }
    void setColor(String color){
        this.color = color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}
