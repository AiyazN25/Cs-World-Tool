package driver.commands;

public interface CommandInterface {
  // These are methods that must be implemented in every command

  int getArgCount();

  String output();
}
