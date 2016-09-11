package driver;

public class Zone {
  
  public Card slots[];
  public int numOfSlots;
  
  public Zone(int numOfSlots){
    this.numOfSlots = numOfSlots;
    slots = new Card[numOfSlots];
  }
}