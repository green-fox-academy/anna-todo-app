//Given the terminal opened in the project directory
//And the file where you store your data
//And a task with the description Walk the dog stored in the file
//And a task with the description Buy milk stored in the file
//And a task with the description Do homework stored in the file
//When the application is ran with -l argument
//Then it should print the tasks that are stored in the file
//And it should add numbers before each
//$ todo -l
//
//1 - Walk the dog
//2 - Buy milk
//3 - Do homework

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class List {
  public static void main(String[] args) {
    try {
      Path filePath = Paths.get("list.txt");
      List <String> lines = Files.readAllLines(filePath);
      System.out.println(lines.get(0)); // Prints the first line of the file
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
    }
  }
}

