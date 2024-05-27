package ArryaList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2DExample {

  //[[],[],[]] so this means ArrayList of ArrayList

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of arrayList you want: ");
    int sizeofArray = in.nextInt();


    //initialise the array
    for (int i = 0; i < sizeofArray; i++) {
      list.add(new ArrayList<>());
    }

    for (int i = 0; i < sizeofArray; i++) {
      for (int j = 0; j < sizeofArray; j++) {
        list.get(i).add(in.nextInt());

      }

    }

    System.out.println(list);
  }


}
