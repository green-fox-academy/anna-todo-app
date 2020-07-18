package todo;

import java.util.List;

public class Flags {

  public String findingFlag(List<String> flagList, String input) {
    String choosenFlag = "";
    for (int i = 0; i < flagList.size() ; i++) {
      if (flagList.get(i).equals(input)) {
        choosenFlag = input;
      } else {
        System.out.println("...");
      }
    }
    return choosenFlag;
  }
}
