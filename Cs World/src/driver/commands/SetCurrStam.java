package driver.commands;

import driver.GameBoard;

public class SetCurrStam extends Command implements CommandInterface {
  
  public SetCurrStam(String[] args, GameBoard gb) {
    super(args);
    this.args = args;
    this.gb = gb;
  }
  
  protected void run() {
    
  }
}