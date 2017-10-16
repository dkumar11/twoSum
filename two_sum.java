import java.io.*;
import java.util.*;

/*
 * two_sum(5, [1,2,3,4,5]) => [[1,4], [2,3]]
 * 
 * Given a target number and a list of numbers, return all of the pairs
 * of numbers from the list that add up to the target number.
 *
 * Args:
 *   int: target number
 *   list: the input numbers
 *
 * Returns:
 *   a list, of all the pairs in the list that add to the target
 */

class Solution {
  public static ArrayList<ArrayList<Integer>> two_sum(int target, ArrayList<Integer> lst ) {
    // Initalize an arrayList of arrayLists which we will return
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    int size = lst.size();
    for (int i = 0; i < size; i += 1) {
      // Make sure that j does not go out of bounds  
      for (int j = i + 1; j < size; j += 1) {
        int value1 = lst.get(i);
        int value2 = lst.get(j);
        int sum = value1 + value2;
        if (sum == target) {
          ArrayList<Integer> pair = new ArrayList<Integer>();
          pair.add(value1);
          pair.add(value2);
          result.add(pair);
        }
      } 
    }
    return result;
  }
  
  public static void printArrayList(ArrayList<ArrayList<Integer>> lst) {
    for (int i = 0; i < lst.size();i += 1) {
      ArrayList<Integer> currentLst = lst.get(i);
      int size = currentLst.size();
      System.out.println("Pair " + i);
      for (int j = 0; j < size; j += 1) {
          System.out.print(currentLst.get(j) + " ");
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    // Test 1: empty list (5, [])
    System.out.println("Test 1 Result");
    ArrayList<ArrayList<Integer>> result;
    result = Solution.two_sum(5, new ArrayList<Integer>());
    Solution.printArrayList(result);
    
    // Test 2: < 2 element list (5, [5])
    System.out.println("Test 2 Result");
    ArrayList<ArrayList<Integer>> result_1;
    ArrayList<Integer> lst_one = new ArrayList<>();
    lst_one.add(5);
    result_1 = Solution.two_sum(5, lst_one);
    Solution.printArrayList(result_1);
    
    // Test 3: unsorted list (5, [2,1,4,5,3])
    System.out.println("Test 3 Result");
    ArrayList<ArrayList<Integer>> result_2;
    ArrayList<Integer> lst_two = new ArrayList<>();
    lst_two.add(2);
    lst_two.add(1);
    lst_two.add(4);
    lst_two.add(5);
    lst_two.add(3);
    result_2 = Solution.two_sum(5, lst_two);
    Solution.printArrayList(result_2);    
    
    // Test4: sorted list (5, [1,2,3,4,5])
    System.out.println("Test 4 Result");
    ArrayList<ArrayList<Integer>> result_3;
    ArrayList<Integer> lst_three = new ArrayList<>();
    lst_three.add(1);
    lst_three.add(2);
    lst_three.add(3);
    lst_three.add(4);
    lst_three.add(5);
    result_3 = Solution.two_sum(5, lst_three);
    Solution.printArrayList(result_2);
  }
}