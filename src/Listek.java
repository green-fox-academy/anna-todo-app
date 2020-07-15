//Given the terminal opened in the project directory
//And the file where you store your data
//And a task with the description Walk the dog stored in the file
//And a task with the description Buy milk stored in the file
//And a task with the description Do homework stored in the file
//When the application is ran with -l argument
//Then it should print the tasks that are stored in the file
//And it should add numbers before each
//
//
//1 - Walk the dog
//2 - Buy milk
//3 - Do homework

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;


public class Listek {
  public static void main(String[] args) {
    if (args.equals("-l")) {
      try {
        Path filePath = Paths.get("list.txt");

        List<String> lines = Files.readAllLines(filePath);
        for (int i = 0; i < lines.size(); i++) {
          System.out.println(i + lines.get(i));
        }
      } catch (Exception e) {
        System.out.println("Uh-oh, could not read the file!");
      }
    }
  }
}
