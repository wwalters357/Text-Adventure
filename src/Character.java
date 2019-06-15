import java.util.ArrayList;
import java.lang.Math;

class Character{
  private String name;
  private int tempHealth, health, armor, damage, level, money, exp;
  private final static double accuracy = 0.75;

  public Character(String name, int health, int armor, int damage){
    this.name = name;
    this.health = health;
    this.tempHealth = health;
    this.armor = armor;
    this.damage = damage;
    this.level = 1;
    this.money = 0;
    this.exp = 0;
  }

  public String getName(){
    return name;
  }

  public int getHealth(){
    return health;
  }

  public int getArmor(){
    return armor;
  }

  public int getDamage(){
    return damage;
  }

  public int getExp(){ return exp; }

  public void setName(String name){
    this.name = name;
  }

  public void setHealth(int health){
    this.health = health;
  }

  public void setArmor(int armor){
    this.armor = armor;
  }

  public void setDamage(int damage){
    this.damage = damage;
  }

  public void setExp(int exp){ this.exp = exp; }
  
  public int attack(){
    if(Math.random() <= accuracy){
      return damage;
    }
    return 0;
  }
  
  public int defend(int damage){
    int armr = 2 * armor;
    damage -= armr;
    tempHealth -= (damage < 0) ? 0 : damage;
    return tempHealth;
  }

  public void item(int x){
    switch(x){
      case 1:
        tempHealth = health;
        break;
      case 2:
        damage *= 2;
        break;
    }
  }
  
  public void run(){
    item(1);
  }
}
