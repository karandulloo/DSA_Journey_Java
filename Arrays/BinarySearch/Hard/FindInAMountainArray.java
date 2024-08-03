package Arrays.BinarySearch.Hard;

public class FindInAMountainArray {

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 2, 1, 0};
    int target = 1;

    System.out.println(findInMountainArray(target, array));
  }


  /**
   * This interface is provided by the problem and is not given in the code. It represents the MountainArray object. You can assume it has the following
   * methods: int get(int index) - Returns the element of the mountain array at index. int length() - Returns the length of the mountain array.
   */

  static int findInMountainArray(int target, int[] mountainArr) {
    // Step 1: Find the peak of the mountain array
    int left = 0;
    int right = mountainArr.length - 1;

    while (left < right) {
      int mid = left + (right - left) / 2;
//      int midValue = mountainArr.get(mid);
//      int midNextValue = mountainArr.get(mid + 1);

      // Compare the current element with the next element
      if (mountainArr[mid] < mountainArr[mid + 1]) {
        // If the current element is less than the next element, move to the right
        left = mid + 1;
      } else {
        // Otherwise, move to the left
        right = mid;
      }
    }

    // The left pointer will be at the peak element's index
    int peakIndex = left;

    // Step 2: Search for the target in the ascending part of the mountain
    int leftResult = binarySearch(mountainArr, target, 0, peakIndex, true);

    // If the target is found in the ascending part, return its index
    if (leftResult != -1) {
      return leftResult;
    }

    // Step 3: Search for the target in the descending part of the mountain
    int rightResult = binarySearch(mountainArr, target, peakIndex, mountainArr.length - 1, false);

    // Return the index where the target is found in the descending part
    return rightResult;
  }

  // Helper function for binary search on the mountain array
  static int binarySearch(int[] mountainArr, int target, int left, int right, boolean ascending) {
    while (left <= right) {
      int mid = left + (right - left) / 2;
//      int midValue = mountainArr.get(mid);

      if (mountainArr[mid] == target) {
        // If the current element is the target, return its index
        return mid;
      }

      if (ascending) {
        if (mountainArr[mid] < target) {
          // If the current element is less than the target, move to the right
          left = mid + 1;
        } else {
          // If the current element is greater than the target, move to the left
          right = mid - 1;
        }
      } else {
        if (mountainArr[mid] < target) {
          // If the current element is less than the target, move to the left
          right = mid - 1;
        } else {
          // If the current element is greater than the target, move to the right
          left = mid + 1;
        }
      }
    }

    // If the target is not found, return -1
    return -1;
  }
}

