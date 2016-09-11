package driver;

import java.util.ArrayList;

public class Deck {
  public ArrayList<Card> contents = new ArrayList<Card>();
  public int numOfCards;
  
  public Deck(int numOfCards) {
    this.numOfCards = numOfCards;
  }
  
  public Card draw() {
    if(numOfCards > 0) {
      numOfCards--;
      return contents.remove(0);
    }
    else {
      return null;
    }
  }
  
  public Card draw(int i) {
    // Draw the i'th index (i=1 means first/top card) from Deck
    if(numOfCards > i-1) {
      numOfCards--;
      return contents.remove(i-1);
    }
    else {
      return null;
    }
  }

}
