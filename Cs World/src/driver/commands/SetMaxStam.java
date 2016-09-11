package driver.commands;

import driver.GameBoard;

public class SetMaxStam extends Command implements CommandInterface {
  
  public SetMaxStam(String[] args, GameBoard gb) {
    super(args);
    this.args = args;
    this.gb = gb;
  }
  
  protected void run() {
    
  }
}