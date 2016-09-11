package driver.commands;

import driver.GameBoard;

public class MoveCard extends Command implements CommandInterface {
  
  public MoveCard(String[] args, GameBoard gb) {
    super(args);
    this.args = args;
    this.gb = gb;
  }
  
  protected void run() {
    
  }
}