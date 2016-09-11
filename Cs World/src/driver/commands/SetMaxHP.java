package driver.commands;

import driver.GameBoard;

public class SetMaxHP extends Command implements CommandInterface {
  
  public SetMaxHP(String[] args, GameBoard gb) {
    super(args);
    this.args = args;
    this.gb = gb;
  }
  
  protected void run() {
    
  }
}