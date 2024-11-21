package ArraysMatrics;
public class ReverseArray {
    
    public static void rev_Array(int numbers[]){
        int first=0, last=numbers.length - 1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }
    public static void printpairs(int array[]){
        int tp=0;

        for(int i=0; i<array.length; i++){
            int curr = array[i];
            for(int j=i+1; j<array.length;j++){
                System.out.print("(" +curr + "," +array[j]+ ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs: "+tp );
        System.out.println();
    }

    public static void subarrays(int numbers[]){
        int ts=0;

        for(int i=0; i<numbers.length; i++){
            int start= i;
            for(int j=i; j<numbers.length; j++){
                int end=j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
       System.out.println("total sub arrays: "+ts);
    }
    public static void main(String args[]){
        int numbers[] = {4,5,7,8,12,14,15,16,18};
       // int array[] = {2,3,4,5,6,7,8,9};
      //  rev_Array(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ ",");
        }
        System.out.println();

      //  printpairs(array);

        subarrays(numbers);

    }
}
