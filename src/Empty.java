//Given the terminal opened in the project directory
//And the file where you store your data
//And the file has 0 task
//When the application is ran with -l argument
//Then it should show a message like this: No todos for today! :)

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Empty {
  public static void main(String[] args) {
    if (args.equals("-l")) {
      try {
        Path filePath = Paths.get("empty.txt");
        List<String> lines = Files.readAllLines(filePath);
        System.out.println("No task for today! :)");
      } catch (Exception e) {
        System.out.println("Uh-oh, could not read the file!");
      }
    }
  }
}
