package StringsFunctions;

public class LargestStr {
    // time complexity O(x * n)
    // where n = number of strings
    // and x = length of string
    public static void main(String args[]){
        String fruits[] = {"apple", "banana", "mango", "grapes", "orange","papaya"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
        if (largest.compareTo(fruits[i]) < 0){
          largest = fruits[i];
        }
        }
        System.out.println(largest); // Lexico graphically comparision....

    }
}
