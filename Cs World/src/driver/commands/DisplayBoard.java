package driver.commands;

import driver.GameBoard;

public class DisplayBoard extends Command implements CommandInterface {
  
  public DisplayBoard(String[] args, GameBoard gb) {
    super(args);
    this.args = args;
    this.gb = gb;
  }
  
  protected void run() {
    
  }
}