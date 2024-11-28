package OOPSconcept;

public class Constructor {
    public static void main(String args[]){
        Install Ins1 = new Install();
        // Install Ins2 = new Install("Crokery");
        // System.out.println(Ins2.app);
        // Install Ins3 = new Install(50000);
        // System.out.println(Ins3.quantity);
        Ins1.app="My app";
        Ins1.downloads=15000;
        Ins1.ratings=4.5f;
        Ins1.reviews[0]=100;
        Ins1.reviews[1]=90;
        Ins1.reviews[2]=80;
        Ins1.reviews[3]=70;

       
        Install Ins2 = new Install(Ins1);
        Ins2.ratings=4.9f;
        System.out.println(Ins2.app);
        System.out.println(Ins2.downloads);
        System.out.println(Ins2.ratings);

        for(int i=0;i<5;i++){
            System.out.println(Ins2.reviews[i]);
        }
    }
}

class Install{
    String app;
    int downloads;
    float ratings;
    int reviews[];
    Install(){
        reviews=new int[5];
        System.out.println("my default constructor");
    }

    Install(String app){ // initialized constructor....
        reviews=new int[5];
        this.app=app;
    }

    Install(int quantity){
        reviews=new int[5];
        this.downloads=quantity;
    }
    Install(Install Ins1){
        reviews=new int[5];
        this.app=Ins1.app;
        this.downloads=Ins1.downloads;//copy cnstructor
        this.reviews=Ins1.reviews;
    }

}
