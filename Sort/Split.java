/*************************
David Sellers
AP CS A
Merge Sort
Demo of the recursive breakdown
of the arrays
*************************/
class Split {
  public static void main(String[] args) {

    int[] nums = new int[10];

    for(int i = 0; i < 10; i++) {
      nums[i] = (int)(Math.random() * 100);
    }
    printArr(nums);

    merge(nums);

    printArr(nums);
  }

  public static void printArr(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "  ");
    }
    System.out.println();

  }
  public static void merge(int[] arr) {
    int temp;

    if(arr.length < 2) {
      return;
    }

    int mid = arr.length / 2;
    int[] lower = new int[mid];
    int[] upper = new int[arr.length - mid];

    //copy lower half
    for(int i = 0; i < mid; i++) {
      lower[i] = arr[i];
    }
    System.out.println("Lower");
    printArr(lower);

    //copy upper half
    for(int i = mid; i < arr.length; i++) {
      upper[i - mid] = arr[i];

    }
    System.out.println("Upper");
    printArr(upper);

    // recurse
    merge(lower);
    merge(upper);


  }
}
