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
    return "[x]" + checkedItem;
  }

  public static void main(String[] args) {
      try {
        Path filePath = Paths.get("listek.txt");
        List<String> lines = Files.readAllLines(filePath);
        for (int i = 0; i < lines.size(); i++) {
          if ((Integer.parseInt(args[1]) - 1) == i) {
            System.out.println(i + " - " + check(lines.get(i)));
          } else {
            System.out.println(i + " - " + lines.get(i));
          }
        }
      } catch (Exception e) {
        System.out.println("Uh-oh, could not read the file!");
      }
    }
  }
