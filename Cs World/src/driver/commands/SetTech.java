package driver.commands;

import driver.GameBoard;

public class SetTech extends Command implements CommandInterface {
  
  public SetTech(String[] args, GameBoard gb) {
    super(args);
    this.args = args;
    this.gb = gb;
  }
  
  protected void run() {
    
  }
}