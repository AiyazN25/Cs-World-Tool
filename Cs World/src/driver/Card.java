package driver;

public class Card {
  public String name;
  public int lvl;
  public int maxHP;
  public int currHP;
  public int Atk;
  public int maxStam;
  public int currStam;
  public String Tech;
  
  public Card(String name, int lvl, int HP, int Atk, int Stam, String Tech) {
    this.name = name;
    this.lvl = lvl;
    this.maxHP = HP;
    currHP = maxHP;
    this.Atk = Atk;
    this.maxStam = Stam;
    currStam = maxStam;
    this.Tech = Tech;
  }
}