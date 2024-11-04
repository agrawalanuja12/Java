public class Patterns {
    public static void hollow_rect(int totrows , int totcols){

        for(int i=1; i<=totrows;i++){
            for(int j=1; j<=totcols; j++){
                
                if(i==1 || i==totrows || j==1 || j==totcols){

                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    }
    public static void mirr_half_pyramid(int n){

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void num_invhalf_pyramid(int n){
      
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void floyds_tri(int n){
        int counter = 1;

        for(int i=1; i<=n; i++){
         
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
        
    }
    public static void zero_one_tri(int n){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++ ){
                if( (i+j) % 2 ==0 ){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        
        for(int i=1; i<=n; i++){

            //stars.....
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //space.....
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars.....
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for inverted loop.....
        for(int i=n; i>=1; i--){

            //stars.....
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            //space.....
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            
            //stars.....
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void solid_rhombus(int n){
        // out loop.....
        for(int i=1; i<=n; i++){
        // inner loop....
        for(int j=1; j<=(n-i); j++){
            //spaces...
            System.out.print(" ");
        }
        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();

        }
    }
    public static void hollow_rhombus(int n){

        for(int i=1; i<=n; i++){

            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
            if( i ==1 || i == n || j== 1 || j == n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
    public static void daimond(int n){

        for(int i=1; i<=n; i++){

            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
              System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
       // hollow_rect(5,10);
       // mirr_half_pyramid(5);
       //num_invhalf_pyramid(5);
       // floyds_tri(5);
       // zero_one_tri(5);
       // butterfly(5);
       //solid_rhombus(5);
       // hollow_rhombus(6);
       daimond(5);
    }
    
}
