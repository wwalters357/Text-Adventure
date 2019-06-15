class Boss extends Enemy {

  public Boss(String name, int health, int armor, int damage) {
    super(name, health, armor, damage);
  }

  public int strongAttack() {
    damage = this.attack() * 2;
    return damage;
  }
}