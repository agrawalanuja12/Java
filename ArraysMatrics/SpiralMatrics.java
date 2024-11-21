package ArraysMatrics;
public class SpiralMatrics {

    public static void printSpiral(int matrix[][]){

        int startRow=0;
        int endRow=matrix.length - 1;
        int startColumn=0;
        int endColumn=matrix[0].length - 1;

        while(startRow <= endRow && startColumn <= endColumn){
            //top boundry.....
            for(int j=startColumn; j<=endColumn;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right boundry.....
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endColumn]+" ");
            }
            //bottom boundry....
            for(int j=endColumn-1;j>=startColumn;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left boundry.....
            for(int i=endRow-1;i>=startRow+1;i--){
                if( startColumn == endColumn){
                    break;
                }
                System.out.print(matrix[i][startColumn]+" ");
            }
            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
        System.out.println();
    }

    public static int diagonalSum(int matrix[][]){

        int sum = 0;

        // for(int i=0; i<matrix.length;i++){
        //     for(int j=0; j<matrix[0].length; j++){

        //         //primary diagonal....
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         //secondry diagonal....
        //         else if(i + j == matrix.length -1){
        //             sum += matrix[i][j];
        //         }
        //     }
        //  }
        for(int i=0; i<matrix.length;i++){
            // primary...
            sum += matrix[i][i];
            //secondry....
            if(i != matrix.length-i-1){
                sum += matrix[i][matrix.length-1-i];
            }
        }
    
        return sum;
    }

    public static boolean sortmatrixSearch(int matrix[][] , int key){

        int row = 0 , col = matrix[0].length -1;
        while( row < matrix.length && col>=0 ){
            if(matrix[row][col] == key){
                System.out.println("key found at (" +row + ","+col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
            
        }
        System.out.println("key not found");
        return false;
    }
    public static void main (String args[]){
    //     int matrix[][]= {{1,2,3,4},     // [ 1   2  3  4 ]
    //                      {5,6,7,8},     // [ 5   6  7  8 ]
    //                      {9,10,11,12},  // [ 9  10 11 12 ]
    //                      {13,14,15,16}};// [ 13 14 15 16 ]
    //    // printSpiral(matrix);     
    //     System.out.println(diagonalSum(matrix));    
    int matrix[][] = {{10, 20, 30, 40},
                      {15, 25, 35, 45},
                      {27, 29, 37, 48},
                      {32, 33, 39, 50}};      
        int key = 33;   
        sortmatrixSearch(matrix,key);           
    }
}
