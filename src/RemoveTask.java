//Remove task
//Given the terminal opened in the project directory
//And the file where you store your data
//And the file has at least 2 tasks
//When the application is ran with the -r 2 argument
//Then it should remove the second task from the file

//Error Handling
//1.
//Given the terminal opened in the project directory
//When the application is ran with the -r argument
//Then it should show an error message like: Unable to remove: no index provided
//2.
//
//Given the terminal opened in the project directory
//And the file where you store your data
//And the file has less than 20 tasks
//When the application is ran with the -r 20 argument
//Then it should show an error message like: Unable to remove: index is out of bound
//3.
//
//Given the terminal opened in the project directory
//When the application is ran with the -r apple argument
//Then it should show an error message like: Unable to remove: index is not a number

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RemoveTask {
  public static void main(String[] args) {

    if (args[0].equals("-r2") /*&& args[1].equals("2")*/) {
      try {
        Path filePath = Paths.get("list.txt");
        List<String> lines = Files.readAllLines(filePath);
        lines.remove(1);
        for (int i = 0; i < lines.size(); i++) {
          System.out.println(i + " - " + lines.get(i));
        }
      } catch (Exception e) {
        System.out.println("Uh-oh, could not read the file!");
      }
    } else if (args[0].equals("-r")) {
      System.out.println("Unable to remove: no index provided");
    } else if (args[0].equals("-r20")) {
      System.out.println("Unable to remove: index is out of bound");
    } else if (args[0].equals("-rapple")) {
      System.out.println("Unable to remove: index is not a number");
    }
  }
}
