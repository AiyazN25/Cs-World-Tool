package driver.commands;

import driver.GameBoard;

/**
 * This is the parent Command class. It's child classes are all the individual
 * commands required to work for the game.
 * 
 * The class contains instance variables to keep track of the argument count of
 * a command, a list of strings of the arguments themselves, and the current
 * GameBoard state the command is working on. Lastly, it contains an output
 * string, which each command will output to the user once it's finished
 * processing - this could be some specific message, an error message, or simply
 * a newline (nothing). It is overloaded with two constructors to accomodate
 * both commands that take in arguments and ones that don't.
 *
 */
public class Command {
  private int argCount;
  String[] args;
  GameBoard gb;
  protected String output = "";

  public Command() {
    argCount = 0;
  }

  public Command(String[] args) {
    argCount = args.length;
  }

  /**
   * This method is used to perform a commands specific ability and set its
   * output to the correct value.
   */
  protected void run() {}

  public int getArgCount() {
    return argCount;
  }

  /**
   * @return a string of it's output
   */
  public String output() {
    run();
    return output;
  }
}

