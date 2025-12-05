import java.util.ArrayList;

public class wordchain {
  private static ArrayList<String> wordList = new ArrayList<String>();

  public static void main(String[] args) {

    ArrayList<String> temp = new ArrayList<String>();
    // wordList.add("an");
    // wordList.add("band");
    // wordList.add("band");
    // wordList.add("abandon");
    // 
    // System.out.println(isWordChain());

    // wordList.add("to");
    // wordList.add("too");
    // wordList.add("tools");
    // wordList.add("stool");

    // System.out.println(isWordChain());

    wordList.add("catch");
    wordList.add("bobcat");
    wordList.add("catchacat");
    wordList.add("cat");
    wordList.add("at");

    temp = createList("cat");

    for(String t: temp) {
      System.out.println(t);
    }
  }

  public static Boolean isWordChain() {

    int passed = 0;
    int counter = 1;
    int num_words = wordList.size();

    while(passed != -1 && counter < num_words) {

      passed = wordList.get(counter).indexOf(wordList.get(counter-1));
      counter++;
    }

    if(passed == -1) {
        return false;
      }
    else {
      return true;
    }
  }

  public static ArrayList<String> createList(String target) {

    ArrayList<String> myList = new ArrayList<String>();

    int num_words = wordList.size();

    for(int i = 0; i < num_words; i++) {
      if(wordList.get(i).indexOf(target) == 0) {
        myList.add(wordList.get(i).substring(target.length()));
      }
    }

    return myList;
  }

}
