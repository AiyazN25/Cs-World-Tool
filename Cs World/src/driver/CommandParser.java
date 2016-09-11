package driver;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

public class CommandParser {
  public String command;
  public String stdout = "";
  public String[] args;
  public GameBoard gb;

  public CommandParser(GameBoard gb) {
    this.gb = gb;
  }

  public CommandParser(String input, GameBoard gb) {
    this.gb = gb;
    parse(input);
  }

  public void cleanUp() {
    command = "";
    args = new String[1];
    stdout = "";
  }

  public void parse(String input) {
    // Parse the input, splitting on whitespace
    String[] parsed = input.trim().split("\\s+");

    command = parsed[0];
    args = Arrays.copyOfRange(parsed, 1, parsed.length);

  }

  public void runCommand() throws NoSuchMethodException, IllegalAccessException,
      InvocationTargetException, InstantiationException {

    Class<?> commandClass;

    HashMap<String, String> commandMap = GameBoard.getCommandMap();
    try {
      commandClass =
          Class.forName("driver.commands." + commandMap.get(command));
    } catch (ClassNotFoundException e) {
      System.out.println("Invalid Command!");
      return;
    }

    Class<?>[] types = {String[].class, GameBoard.class};
    Constructor<?> constructor = commandClass.getConstructor(types);

    Object instanceOfClass = constructor.newInstance(args, gb);

    Method commandOutput;
    commandOutput = instanceOfClass.getClass().getMethod("output");
    String output = (String) commandOutput.invoke(instanceOfClass);
    stdout += output;

    System.out.print(stdout);
  }
}
