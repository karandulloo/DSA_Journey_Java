package Arrays;

public class NoColFixedArray {

  public static void main(String[] args) {
    int arr[][] = {
        {1, 2, 3},
        {4, 5},
        {6, 7, 8, 9, 10}

    };

    //now how will i print it without using Arrays.toString and also i dont have fixed col length

    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        // as we dont have the length fixed of column but we can take the
        // length of that particular row and that many times the loop shall run


        System.out.print(arr[row][col] + " ");
      }
      System.out.println();

    }
  }

}
