package driver.commands;

import driver.GameBoard;

public class ViewCard extends Command implements CommandInterface {
  
  public ViewCard(String[] args, GameBoard gb) {
    super(args);
    this.args = args;
    this.gb = gb;
  }
  
  protected void run() {
    
  }
}