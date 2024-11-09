public class SubarraysSum {

    public static void Max_sum(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length];

        prefix[0]= numbers[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i]= prefix[i-1]+numbers[i];

        }


        for(int i=0; i<numbers.length; i++){
            int start= i;
            for(int j=i; j<numbers.length; j++){
                int end=j;

                currsum= start == 0 ? prefix[end] : prefix[end] - prefix[start-1];// Prefix sum.........

                // // currsum = 0;
                // // for(int k=start; k<=end; k++){
                // //     System.out.print(numbers[k]+" "); //Brute force..........
                // //     currsum += numbers[k];
                // // }
                // System.out.println("=>"+currsum);

                if(maxsum < currsum){
                    maxsum=currsum;
                }
            }
        }
       System.out.println("Max sum of subarrays: "+maxsum);
    }
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i= 0;i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Our max subarray sum is: "+ms);

    }

    public static void main(String args[]){
    //    // int numbers[]={2,4,6,8,9};
    //    int numbers[] = {1,-9,7,8,-3,8};
    //     Max_sum(numbers);
     int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
   // int numbers[] = {-2,-1,-3,-5,-6};

    kadanes(numbers);
    }

}
