package Arrays.BinarySearch;

public class BinarySearch {

  //time complexity is logN
  //because we take half of the sorted array and then traverse to that side
  public static void main(String[] args) {

//    int[] arrayNumbers = {-16, -6, -1, 0, 20, 35, 49, 57, 76, 89, 93, 100};
    int[] arrayNumbers = {1002, 22, 10, 9, 5, -1};
    int findElement = 1002;

    System.out.println(findTheIndex(arrayNumbers, findElement));
  }

  static int findTheIndex(int[] array, int target) {
    int mid = 0;
    int start = 0;
    int end = array.length - 1;
    //check array order
    boolean isAcs = array[start] < array[end];

    while (start <= end) {
      //integer number can be big hence this is not the optimal solution
      mid = start + (end - start) / 2;
      if (array[mid] == target) {
        return mid;
      }
      if (isAcs) {

        if (target < array[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {
        if (target < array[mid]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }

    }
    return -1;
  }
}
