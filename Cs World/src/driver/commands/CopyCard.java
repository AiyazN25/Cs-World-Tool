package driver.commands;

import driver.GameBoard;

public class CopyCard extends Command implements CommandInterface {
  
  public CopyCard(String[] args, GameBoard gb) {
    super(args);
    this.args = args;
    this.gb = gb;
  }
  
  protected void run() {
    
  }
}