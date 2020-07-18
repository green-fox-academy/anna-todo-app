package todo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Fileok {

  String newTask = "";

  public void readFile(Path filePath) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      if (lines.isEmpty()) {
        System.out.println("No task for today! :)");
      } else {
        for (int i = 0; i < lines.size(); i++) {
          System.out.println(i + " - " + lines.get(i));
        }
      }
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
      System.out.println(e);
    }
  }

  public void addNewTaskToTheFile(Path filePath, String newTask) {
    this.newTask = newTask;
    try {
      List<String> lines = Files.readAllLines(filePath);
      lines.add(newTask);
      for (int i = 0; i < lines.size(); i++) {
        System.out.println(i + " - " + lines.get(i));
      }
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
      System.out.println(e);
    }
  }

  public void removeTaskFromTheFile(Path filePath, int taskToRemoveIndex) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      lines.remove(taskToRemoveIndex);
      for (int i = 0; i < lines.size(); i++) {
        System.out.println(i + " - " + lines.get(i));
      }
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
      System.out.println(e);
    }
  }

  public void checkTheList(Path filePath, int checkedItem) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        if (Integer.parseInt(lines.get(i)) == checkedItem) {
          System.out.println(i + " - [x] " + lines.get(i));
        } else {
          System.out.println(i + " - " + lines.get(i));
        }
      }
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
    }
  }
}

