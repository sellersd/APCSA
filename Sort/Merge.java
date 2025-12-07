/*************************
 * David Sellers
 * AP CS A
 * Merge Sort
 * Demo of the recursive breakdown
 * of the arrays
 *************************/

class Merge {
  public static void main(String[] args) {

    int size = 10;
    int[] nums = new int[size];

    nums = populateArray(size);

    printArr(nums);

    merge(nums);

    printArr(nums);
  }

  public static int[] populateArray(int size) {
    int[] arr = new int[size];

    for (int i = 0; i < 10; i++) {
      arr[i] = (int) (Math.random() * 100);
    }

    return arr;
  }

  public static void printArr(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "  ");
    }
    System.out.println();

  }

  public static void merge(int[] arr) {

    int temp;

    if (arr.length < 2) {
      return;
    }
    if (arr.length == 2) {
      if (arr[1] < arr[0]) {
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
      }
      return;
    }

    int mid = arr.length / 2;
    int[] lower = new int[mid];
    int[] upper = new int[arr.length - mid];

    // copy lower half
    for (int i = 0; i < mid; i++) {
      lower[i] = arr[i];
    }

    printArr(lower);

    // copy upper half
    for (int i = mid; i < arr.length; i++) {
      upper[i - mid] = arr[i];

    }
    printArr(upper);

    // recurse
    merge(lower);
    merge(upper);

  }
}
