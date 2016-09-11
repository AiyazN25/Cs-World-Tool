package driver.commands;

import driver.GameBoard;

public class SetCurrHP extends Command implements CommandInterface {
  
  public SetCurrHP(String[] args, GameBoard gb) {
    super(args);
    this.args = args;
    this.gb = gb;
  }
  
  protected void run() {
    
  }
}