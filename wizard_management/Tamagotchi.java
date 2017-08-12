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
    if((this.hunger_level >= 0 && this.hunger_level < 10) && (hunger_level >= 0 && hunger_level <= 10)){
    // if(this.hunger_level && new_hunger_level == (1..10)){
    this.hunger_level = hunger_level;
    }
  }

  public int getHappinessLevel(){
    return this.happiness_level;
  }

  public void setHappinessLevel(int happiness_level){
    if((this.happiness_level >= 0 && this.happiness_level < 10) && (happiness_level >= 0 && happiness_level <= 10)){
    this.happiness_level = happiness_level;
    }
  }

  public int getDramaLevel(){
    return this.drama_level;
  }

  public void setDramaLevel(int drama_level){
    if((this.drama_level >= 0 && this.drama_level < 10) && (drama_level >= 0 && drama_level <= 10)){
    this.drama_level = drama_level;
    }
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

  public String feed(String food){
    int hunger_decrease;
      switch (food){
        case "protein shake": hunger_decrease = 3;
        // happiness_increase = 1;
        break;
        case "slurpy": hunger_decrease = 1;
        break;
        case "steak": hunger_decrease = 4;
        // happiness_increase = 2;
        break;
        case "lemon curd": hunger_decrease = 1;
        break;
        case "cherry cough syrup": hunger_decrease = 1;
        break;
        case "irn-bru": hunger_decrease = 2;
        // happiness_increase = 1;
        break;
        case "marmelade haggis": hunger_decrease = 5;
        // happiness_increase = 3;
        break;
        default: return "Yeachtk, I don't eat dat!";
        // default: System.out.printl("yeachtk, I don't eat dat!");
      }
      this.setHungerLevel(this.hunger_level -= hunger_decrease);
      // this.happiness_level += happiness_increase;
        // System.out.println("Yummy!");
      return "Yummy";
  }

  // public void feed(String food){
  //     }
}

