package driver.commands;

import driver.GameBoard;

public class ListCommands extends Command implements CommandInterface {
  
  public ListCommands(String[] args, GameBoard gb) {
    super(args);
    this.args = args;
    this.gb = gb;
  }
  
  protected void run() {
    
  }
}