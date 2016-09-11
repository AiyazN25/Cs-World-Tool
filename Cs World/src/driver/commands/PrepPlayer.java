package driver.commands;

import driver.GameBoard;

public class PrepPlayer extends Command implements CommandInterface {
  
  public PrepPlayer(String[] args, GameBoard gb) {
    super(args);
    this.args = args;
    this.gb = gb;
  }
  
  protected void run() {
    
  }
}