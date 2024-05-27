package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Swap2DArrayList {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the arraylist:");
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      list.add(in.nextInt());
    }

    // Call the swap function with indices to swap
    swap(list, 0, list.size() - 1);

    // Print the swapped list to verify
    System.out.println("Swapped arraylist: " + list);
  }

  // Swap method to swap elements at two indices
  static void swap(ArrayList<Integer> list, int firstIndex, int secondIndex) {
    int temp = list.get(firstIndex);
    list.set(firstIndex, list.get(secondIndex));
    list.set(secondIndex, temp);
  }
}
