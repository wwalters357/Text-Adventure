class Room {
  private RoomType type;
  private Object obj;

  public Room(RoomType type) {
    this.type = type;
    switch(type){
      case MONSTER:
        obj = new Enemy(); 
        break;
      case ITEM:
        break;
      case MERCHANT:
        break;
      case BOSS:
        break;
    }
  }
}