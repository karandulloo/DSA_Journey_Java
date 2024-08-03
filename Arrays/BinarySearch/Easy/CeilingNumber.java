package Arrays.BinarySearch.Easy;

public class CeilingNumber {

  public static void main(String[] args) {
//    int[] array = {2, 3, 5, 9, 14, 16, 18};
    int[] array = {18, 16, 14, 9, 5, 3, 2};
    int target = 15;

    int ans = findCeilingNumber(array, target);
    System.out.println(array[ans]);
  }

  static int findCeilingNumber(int[] array, int target) {
    int start = 0;
    int end = array.length - 1;
    int medium;
    boolean isAsc = array[start] < array[end];

    while (start <= end) {
      medium = start + (end - start) / 2;

      if (array[medium] == target) {
        return medium;
      }

      if (array[medium] > target) {
        start = medium + 1;
      } else {
        end = medium - 1;
      }
    }
    //usually the return statement should work in the case of ascending order
    // for example in asc order 14,16,18
    // the violation of rule will give me the result(ceiling) as start = 16 (target is 15)
    // but if the order is descending now 18,16,14 the start will be 14 which is wrong
    // hence before returning statement we again need to check the order and if th
    //
    //
    //
    if (isAsc) {
      return start; // or handle it differently if no ceiling exists
    } else {
      return end; // or handle it differently if no ceiling exists
    }
  }


}
