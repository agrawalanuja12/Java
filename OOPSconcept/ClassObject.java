package OOPSconcept;
public class ClassObject {
    
    public static void main(String args[]){
        Pen p1 = new Pen();// created object of pen called p1
        p1.setcolor("Black");
        p1.settip(10);
        System.out.println("the color and tip of the pen is "+p1.color+" and "+p1.tip);
        p1.color="White";
        p1.tip=5;
        System.out.println("the color and tip of the pen is "+p1.color+" and "+p1.tip);

       
    }
}

 class Pen{
    String color;
    int tip;

    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}
 class Student{
    String name;
    int age;
    float percentage; // cgpa...
    void calcPercentage(int phy, int chem, int math ){
        percentage = (phy+chem+math)/3;

    }
 }
