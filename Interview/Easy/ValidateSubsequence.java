/**
 * @author Loisjersong
 */
package Interview.Easy;

import java.util.List;
import java.util.Arrays;

/**
 * This method checks wether a given sequence is the subsequence of the given array
 * @param array 1st array, will be the base of checking for the sequence argument
 * @param sequence 2nd array, will be checked if it is the subsequence of the first array argument
 */
public class ValidateSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int count = 0;
        for(int i = 0; i < array.size(); i++) {
            for(int j = count; j < sequence.size(); j++) {
                //increments count if sequence has a same value in array
                if(sequence.get(j) == array.get(i)) {
                    count += 1;
                    break;
                }
            }
            // return true if count is the same size as sequence list
            if(count == sequence.size()) 
                    return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ValidateSubsequence obj = new ValidateSubsequence();

        // initialized array1, and sequence 1 using asList() method
        List<Integer> array1 = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence1 = Arrays.asList(5, 1, 22, 10);

        // Displays to the console the values of array1 and sequence1
        System.out.print("Array 1: ");
        array1.forEach(number -> System.out.print(number + ", "));
        System.out.print("\nSequence 1: ");
        sequence1.forEach(number -> System.out.print(number + ", "));

        // invoked the isValidSubsequence() to check wether sequence1 is a subsequence or array1
        System.out.println("\nIs Sequence 1 form the subsequence of Array 1?: " + obj.isValidSubsequence(array1, sequence1));
        
    }
}