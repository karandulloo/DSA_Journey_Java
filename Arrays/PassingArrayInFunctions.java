package Arrays;

import java.util.Arrays;

public class PassingArrayInFunctions {

  //Array will be effected because it is called by reference being a no primtive data type the JAVA calls it by its reference value

  public static void main(String[] args) {
    int[] arrayTest = new int[5];
    for (int i = 0; i < arrayTest.length; i++) {
      arrayTest[i] = i;

    }
    System.out.print(Arrays.toString(arrayTest));
    changeArray(arrayTest);
    System.out.println(Arrays.toString(arrayTest));


  }

  static int[] changeArray(int[] arrayInput) {
    arrayInput[0] = 99;
    return arrayInput;

  }

}
