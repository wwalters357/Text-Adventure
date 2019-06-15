class Room {
  private RoomType type;
  private Enemy enemy;

  public Room(RoomType type) {
    this.type = type;
    switch(type){
      case ENEMY:
        enemy = new Enemy("Goblin", 5, 1, 2);
        break;
      case ITEM:
        break;
      case MERCHANT:
        break;
      case BOSS:
        enemy = new Enemy("Orge", 10, 2, 4);
        break;
    }
  }
}