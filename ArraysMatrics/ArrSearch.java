package ArraysMatrics;

public class ArrSearch {
    public static int linearSearch(int array[] , int key){
    
        for(int i=0; i<array.length; i++){
          if(array[i] == key){
             return i;
    }
  }
              return -1;
    }
    public static int linearSearch2(String food[], String key2){
        for(int j=0; j<food.length; j++){
            if(food[j] == key2){
                return j;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int array[] = {1,12,15,46,23,10,32,42,50};
        String food[] = {"samosa","pavbhaji","chaumin","frankie","manchurian","pasta","dosa"};
        int key = 50;
        String key2 = "dosa";
        int index = linearSearch(array, key);
        int index2 = linearSearch2(food , key2);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("key is at index: "+index);

        }
        if(index2 == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("key2 is at index2: "+index2);
        }
    }
}
