package driver.commands;

import driver.GameBoard;

public class SetAtk extends Command implements CommandInterface {
  
  public SetAtk(String[] args, GameBoard gb) {
    super(args);
    this.args = args;
    this.gb = gb;
  }
  
  protected void run() {
    
  }
}