package driver.commands;

import driver.GameBoard;

public class DeleteCard extends Command implements CommandInterface {
  
  public DeleteCard(String[] args, GameBoard gb) {
    super(args);
    this.args = args;
    this.gb = gb;
  }
  
  protected void run() {
    
  }
}