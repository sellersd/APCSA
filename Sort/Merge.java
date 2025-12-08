/*************************
 * David Sellers
 * AP CS A
 * Merge Sort
 * Demo of the recursive breakdown
 * of the arrays
 *************************/

class Merge {
  public static void main(String[] args) {

    int size = 16;
    int[] nums = new int[size];

    nums = populateArray(size);

    printArr(nums);

    nums = merge(nums);

    printArr(nums);
  }

  public static int[] populateArray(int size) {
    int[] arr = new int[size];

    for (int i = 0; i < size; i++) {
      arr[i] = (int) (Math.random() * 1000);
    }

    return arr;
  }

  public static void printArr(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "  ");
    }
    System.out.println();

  }

  public static int[] sort(int[] l, int[] u) {
    int[] s_arr = new int[l.length + u.length];

    // printArr(l);
    // printArr(u);

    int spos = 0;
    int lpos = 0;
    int upos = 0;

    while (lpos < l.length && upos < u.length) {
      if (l[lpos] < u[upos]) {
        s_arr[spos] = l[lpos];
        lpos++;
      } else {
        s_arr[spos] = u[upos];
        upos++;
      }
      spos++;
    }

    while (lpos < l.length) {
      s_arr[spos] = l[lpos];
      lpos++;
      spos++;
    }

    while (upos < u.length) {
      s_arr[spos] = u[upos];
      upos++;
      spos++;
    }
    printArr(s_arr);
    return s_arr;
  }

  public static int[] merge(int[] arr) {

    if (arr.length < 2) {
      return arr;
    }

    else {
      int mid = arr.length / 2;
      int[] lower = new int[mid];
      int[] upper = new int[arr.length - mid];

      // copy lower half
      for (int i = 0; i < mid; i++) {
        lower[i] = arr[i];
      }

      // printArr(lower);

      // copy upper half
      for (int i = mid; i < arr.length; i++) {
        upper[i - mid] = arr[i];

      }
      // printArr(upper);

      // recurse
      lower = merge(lower);
      upper = merge(upper);

      return sort(lower, upper);
    }

  }
}
