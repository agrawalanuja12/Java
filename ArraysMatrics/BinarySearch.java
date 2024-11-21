package ArraysMatrics;
public class BinarySearch {
    
    public static int Bin_Search(int numbers[], int key){

        int start=0, end = numbers.length-1;
        while(start <= end){
            int mid = (start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid +1 ;
            }else{
                 end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String args[]){

        int numbers[]= {2,3,5,11,19,20,23,25,26};
        int key = 23;
        System.out.println("key is at index: " + Bin_Search(numbers, key));
    }
}
