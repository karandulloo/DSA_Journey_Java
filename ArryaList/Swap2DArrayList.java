package ArryaList;

import java.util.ArrayList;
import java.util.Scanner;

public class Swap2DArrayList {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Initialise the starting ArrayList");
    int numberOfElements = in.nextInt();
    ArrayList<String> arrayList = new ArrayList<>();

    for (int i = 0; i < numberOfElements; i++) {
      arrayList.add(in.next());
    }

    swap(arrayList, arrayList.get(0), arrayList.get(arrayList.size() - 1));
    System.out.println(arrayList);
//    for (String names : arrayList) {
//      System.out.println(names);
//
//    }
  }

  static ArrayList<String> swap(ArrayList<String> arrayList, String firstString, String lastString) {
    arrayList.set(0, lastString);
    arrayList.set(arrayList.size() - 1, firstString);
    return arrayList;
  }
}
