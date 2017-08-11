package wizard_management;

public abstract class Tamagotchi {

  String name;
  int hunger_level;
  int happiness_level;
  int drama_level;
  int age;

  public Tamagotchi(String name, int hunger_level, int happiness_level, int drama_level, int age){
    this.name = name;
    this.hunger_level = hunger_level;
    this.happiness_level = happiness_level;
    this.drama_level = drama_level;
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public int getHungerLevel(){
    return this.hunger_level;
  }

  public void setHungerLevel(int hunger_level){
    this.hunger_level = hunger_level;
  }

  public int getHappinessLevel(){
    return this.happiness_level;
  }

  public void setHappinessLevel(int happiness_level){
    this.happiness_level = happiness_level;
  }

  public int getDramaLevel(){
    return this.drama_level;
  }

  public void setDramaLevel(int drama_level){
    this.drama_level = drama_level;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    this.age = age;
  }

  // public void isBorn(int hunger_level, int happiness_level, int drama_level){
  //   this.setHungerLevel(hunger_level);
  // }

}

