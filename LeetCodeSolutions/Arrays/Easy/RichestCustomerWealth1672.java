package LeetCodeSolutions.Arrays.Easy;

import java.util.ArrayList;

public class RichestCustomerWealth1672 {

  public static void main(String[] args) {
    int[][] array = {{1, 2, 3},
        {3, 2, 3}};
    maximumWealth(array);

  }

  static void maximumWealth(int[][] accounts) {
    int wealth = 0;
    ArrayList<Integer> wealthArray = new ArrayList<>();
    for (int i = 0; i < accounts.length; i++) {
      for (int j = 0; j < accounts[i].length; j++) {
        wealth += accounts[i][j];
      }
      wealthArray.add(i, wealth);
      wealth = 0;
    }
    System.out.println(wealthArray);
//    findMaxWealth(wealthArray);
  }

//  static int findMaxWealth(ArrayList<Integer> wealth) {
//    int maxVal = wealth.get(0);
//    for (int i = 1; i < wealth.size(); i++) {
//      if (maxVal < wealth.get(i)) {
//        maxVal = wealth.get(i);
//      }
//    }
//    return maxVal;
//  }

}
