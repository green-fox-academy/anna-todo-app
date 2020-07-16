//Check task
//Given the terminal opened in the project directory
//And the file where you store your data
//And the file has at least 2 tasks
//When the application is ran with the -c 2 argument
//Then it should check the second task from the file

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CheckList {

  public static String check(String checkedItem) {
    return checkedItem = "[x]" + checkedItem;
  }

  public static void main(String[] args) {
    if (args[0].equals("-c2")) {
      try {
        Path filePath = Paths.get("listek.txt");
        List<String> lines = Files.readAllLines(filePath);
        System.out.println(check(lines.get(1)));
        for (int i = 0; i < lines.size(); i++) {
          System.out.println(i + " - " + lines.get(i));
        }
      } catch (Exception e) {
        System.out.println("Uh-oh, could not read the file!");
      }
    }
  }
}
