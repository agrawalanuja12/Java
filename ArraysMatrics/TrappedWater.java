package ArraysMatrics;
public class TrappedWater {
    public static int trap_Rainwater(int height[]){
        int n = height.length;

        // calculate left max boundry
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for(int i=1; i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        // calculate right max boundry
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater = 0;

        //loop
        for(int i=0; i<n; i++){

            // waterlevel= min(leftMax boundry , right max boundry)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Trappedrainwater= waterlevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
        
    } 

    public static void main(String args[]){

        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Total rain water trapped b/w heights: " +trap_Rainwater(height));
    }
}
//Project Name: Rainwater Trapping Simulation

// Project Description:
// Implemented a Java program to calculate rainwater trapped between bar heights using efficient array-based algorithms.

// Key Features:
// Precomputed left and right boundaries for optimized calculations.
// Calculated total trapped water using boundary comparisons.

// Technologies Used:
// Java, Arrays, Algorithm Design.