package driver.commands;

import driver.GameBoard;

public class DisplayHand extends Command implements CommandInterface {
  
  public DisplayHand(String[] args, GameBoard gb) {
    super(args);
    this.args = args;
    this.gb = gb;
  }
  
  protected void run() {
    
  }
}