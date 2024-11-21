package StringsFunctions;

public class Shortestpath {
    
     // to find the shortestest path to reach the destination....
     public static float getShortestPath(String path){
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

            // south...
            if(dir == 'S'){
                y--;
            }
            // west...
            else if(dir == 'W'){
                x--;
            }
            // north...
            else if(dir == 'N'){
                y++;
            }
            // east...
            else{
                x++;
            }
        } 
        int X2= x*x;
        int Y2= y*y;
        return (float)Math.sqrt(X2 + Y2);
        
    }
    public static void main(String args[]){

        String path = "WNEENESENNNSSS";
        System.out.println(getShortestPath(path)); //  calling shortest path method....


    }
}
