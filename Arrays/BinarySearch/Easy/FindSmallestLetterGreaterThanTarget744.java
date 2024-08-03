package Arrays.BinarySearch.Easy;

public class FindSmallestLetterGreaterThanTarget744 {

  public static void main(String[] args) {
    char[] array = {'c', 'f', 'j'};
    char target = 'j';

    System.out.println(findTheSmallestLetterGreaterThanTarget(array, target));
  }

  static char findTheSmallestLetterGreaterThanTarget(char[] letters, char target) {
    // Handle the wrap-around case explicitly
    if (letters[letters.length - 1] <= target) {
      return letters[0];
    }

    int start = 0;
    int end = letters.length - 1;
    int medium;
    while (start <= end) {
      medium = start + (end - start) / 2;
      if (letters[medium] > target) {
        end = medium - 1;
      } else {
        start = medium + 1;
      }
    }
    // Since we're looking for the smallest letter greater than target,
    // start should be at the smallest element that is greater than the target
    return letters[start];
  }
}
