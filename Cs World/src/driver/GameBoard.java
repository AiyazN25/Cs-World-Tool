package driver;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GameBoard {
  // All the constants
  public int NUMCARDSIN5PILE = 3;
  public int NUMCARDSIN4PILE = 5;
  public int NUMCARDSIN3PILE = 10;
  public int NUMCARDSIN2PILE = 15;
  public int NUMCARDSIN1PILE = 20;
  public int PLAYERLIFEPOINTS = 10;
  // Board is going to have 10 zones, 5 for each of the 2 players
  public Player playerOne = new Player(PLAYERLIFEPOINTS);
  public ArrayList<Zone> playerOneZonesList = new ArrayList<Zone>();
  public Player playerTwo = new Player(PLAYERLIFEPOINTS);
  public ArrayList<Zone> playerTwoZonesList = new ArrayList<Zone>();
  // FrontLines
  public Zone p1FL = new Zone(3);
  public Zone p2FL = new Zone(3);
  // RightWings
  public Zone p1RW = new Zone(2);
  public Zone p2RW = new Zone(2);
  // LeftWings
  public Zone p1LW = new Zone(2);
  public Zone p2LW = new Zone(2);
  // RightTails
  public Zone p1RT = new Zone(2);
  public Zone p2RT = new Zone(2);
  // LeftTails
  public Zone p1LT = new Zone(2);
  public Zone p2LT = new Zone(2);
  // In addition, we'll put the hands of each of the players as part of the
  // board too for now
  public ArrayList<Card> p1Hand = new ArrayList<Card>();
  public ArrayList<Card> p2Hand = new ArrayList<Card>();
  // And the decks of both players too (since we're just testing, this means we
  // can "see" the whole deck)
  // 1 piles:
  public Deck OnePileOfp1 = new Deck(NUMCARDSIN1PILE);
  public Deck OnePileOfp2 = new Deck(NUMCARDSIN1PILE);
  // 2 piles:
  public Deck TwoPileOfp1 = new Deck(NUMCARDSIN2PILE);
  public Deck TwoPileOfp2 = new Deck(NUMCARDSIN2PILE);
  // 3 piles:
  public Deck ThreePileOfp1 = new Deck(NUMCARDSIN3PILE);
  public Deck ThreePileOfp2 = new Deck(NUMCARDSIN3PILE);
  // 4 piles:
  public Deck FourPileOfp1 = new Deck(NUMCARDSIN4PILE);
  public Deck FourPileOfp2 = new Deck(NUMCARDSIN4PILE);
  // 5 piles:
  public Deck FivePileOfp1 = new Deck(NUMCARDSIN5PILE);
  public Deck FivePileOfp2 = new Deck(NUMCARDSIN5PILE);

  public static void main(String[] args)
      throws NoSuchMethodException, IllegalAccessException,
      InvocationTargetException, InstantiationException {
    GameBoard gb = new GameBoard();
    // Add all player 1's zones to the player one zone list
    gb.playerOneZonesList.add(gb.p1FL);
    gb.playerOneZonesList.add(gb.p1RW);
    gb.playerOneZonesList.add(gb.p1LW);
    gb.playerOneZonesList.add(gb.p1RT);
    gb.playerOneZonesList.add(gb.p1LT);
    // Add all player 2's zones to the player two zone list
    gb.playerTwoZonesList.add(gb.p2FL);
    gb.playerTwoZonesList.add(gb.p2RW);
    gb.playerTwoZonesList.add(gb.p2LW);
    gb.playerTwoZonesList.add(gb.p2RT);
    gb.playerTwoZonesList.add(gb.p2LT);
    // create a scanner so we can read the command-line input
    Scanner scanner = new Scanner(System.in);
    CommandParser commandParser = new CommandParser(gb);
    // Always keep running, unless exit command is given
    while (true) {
      String input = scanner.nextLine();
      if (input.trim().equals("exit")) {
        break;
      }
      // Parse the input
      commandParser.parse(input);
      // Run the command
      commandParser.runCommand();
      // And reset back to original state
      commandParser.cleanUp();
    }
  }

  public static HashMap<String, String> getCommandMap() {
    HashMap<String, String> commandMap = new HashMap<>();
    commandMap.put("ViewCard", "ViewCard");
    commandMap.put("SetMaxHP", "SetMaxHP");
    commandMap.put("SetCurrHP", "SetCurrHP");
    commandMap.put("SetMaxStam", "SetMaxStam");
    commandMap.put("SetCurrStam", "SetCurrStam");
    commandMap.put("SetAtk", "SetAtk");
    commandMap.put("SetTech", "SetTech");
    commandMap.put("MoveCard", "MoveCard");
    commandMap.put("CopyCard", "CopyCard");
    commandMap.put("DeleteCard", "DeleteCard");
    commandMap.put("DisplayBoard", "DisplayBoard");
    commandMap.put("DisplayHand", "DisplayHand");
    commandMap.put("PrepPlayer", "PrepPlayer");
    commandMap.put("ListCommands", "ListCommands");
    return commandMap;
  }

}
