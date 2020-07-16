//Given the terminal opened in the project directory
//When the application is ran with the -a "Feed the monkey" argument
//Then it should add a new task with the description Feed the monkey

//Add new task error handling
//Given the terminal opened in the project directory
//When the application is ran with the -a argument
//Then it should show an error message like: Unable to add: no task provided

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AddNewTask {
  public static void main(String[] args) {
    String newTask = "Feed the monkey";
    if (args[0].equals("-a" + newTask)) {
      try {
        Path filePath = Paths.get("list.txt");
        List<String> lines = Files.readAllLines(filePath);
        lines.add(newTask);
        for (int i = 0; i < lines.size(); i++) {
          System.out.println(i + " - " + lines.get(i));
        }
      } catch (Exception e) {
        System.out.println("Uh-oh, could not read the file!");
      }
    } else if (args[0].equals("-a")) {
      System.out.println("Unable to add: no task provided");
    }
  }
}
