package wizard_management;

public abstract class Tamagotchi {

  String name;
  int hunger_level;
  int happiness_level;
  int drama_level;
  double age;
  boolean alive;

  public Tamagotchi(String name, int hunger_level, int happiness_level, int drama_level, double age, boolean alive){
    this.name = name;
    this.hunger_level = hunger_level;
    this.happiness_level = happiness_level;
    this.drama_level = drama_level;
    this.age = age;
    this.alive = alive;
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

  public double getAge(){
    return this.age;
  }

  public void setAge(double age){
    this.age = age;
  }

  public Boolean getAliveTrueFalse(){
    return this.alive;
  }

  public void setAliveTrueFalse(Boolean soul){
    this.alive = soul;
  }

  public void isBorn(int hunger_level, int happiness_level, int drama_level){
    this.setHungerLevel(hunger_level);
    this.setHappinessLevel(happiness_level);
    this.setDramaLevel(drama_level);
  }

  public void isAging(double minutes){
    // this.age += Math.round((minutes/41.76));
    double increase = minutes/41.76;
    increase = Math.round(increase *100.0)/100.0;
    age += increase;
  }

}

