package todo;

import java.nio.file.Paths;

public class Todo {
  public static void main(String[] args) {
    Help help = new Help();
    Fileok lista = new Fileok();
    String newTask = "";
    int task = 0;

    if (args.length == 0) {
      help.listPossibilities();
    } else if (args[0].equals("-l")) {
      lista.readFile(Paths.get("listek.txt"));
    } else if (args[0].equals("-a" + newTask)) {
      lista.addNewTaskToTheFile(Paths.get("listek.txt"), args[1]);
    } else if (args[0].equals("-c")) {
      lista.checkTheList(Paths.get("listek.txt"), 1);
    } else if (args[0].equals("-r" + task)) {
      lista.removeTaskFromTheFile(Paths.get("listek.txt"),Integer.parseInt(args[1]));
    } else {
      System.out.println("Unsupported argument");
    }
  }
}
