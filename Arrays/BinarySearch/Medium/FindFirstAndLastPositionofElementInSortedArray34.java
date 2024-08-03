package Arrays.BinarySearch.Medium;

public class FindFirstAndLastPositionofElementInSortedArray34 {

  public static void main(String[] args) {
    int[] array = {5, 7, 7, 7, 7, 8, 8, 10};
    int target = 17;
    int positon[] = findFirstAndLastPositionofElementInSortedArray(array, target);
//    findFirstAndLastPositionofElementInSortedArray(array, target);
    for (int num : positon) {
      System.out.print(num + " ");
    }

  }

  static int[] findFirstAndLastPositionofElementInSortedArray(int[] nums, int target) {
    int[] ans = new int[2];

    ans[0] = findPosition(nums, target, true);
    ans[1] = findPosition(nums, target, false);
    return ans;
  }

  static int findPosition(int[] array, int target, boolean findStartIndex) {
    int start = 0;
    int end = array.length - 1;
    int medium;
    int ans = -1;

    while (start <= end) {
      medium = start + (end - start) / 2;

      if (array[medium] > target) {
        end = medium - 1;
      } else if (array[medium] < target) {
        start = medium + 1;
      } else {
        ans = medium;
        if (findStartIndex) {
          end = medium - 1;
        } else {
          start = medium + 1;
        }
      }
    }
    return ans;
  }
}
