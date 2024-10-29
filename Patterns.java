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
    public static void main(String args[]){
       // hollow_rect(5,10);
       mirr_half_pyramid(5);
    }
    
}
