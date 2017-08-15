package wizard_management;
import behaviours.*;

public abstract class Tamagotchi implements Eat{

  String name;
  int hunger_level;
  int happiness_level;
  int drama_level;
  double age;
  boolean alive;
  int weight;

  public Tamagotchi(String name, int hunger_level, int happiness_level, int drama_level, double age, boolean alive, int weight){
    this.name = name;
    this.hunger_level = hunger_level;
    this.happiness_level = happiness_level;
    this.drama_level = drama_level;
    this.age = age;
    this.alive = alive;
    this.weight = weight;
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
    if (this.hunger_level < 0){
      this.hunger_level = 0;
    }
    if(this.hunger_level > 10){
      this.hunger_level = 10;
    }
  }

  public int getHappinessLevel(){
    return this.happiness_level;
  }

  public void setHappinessLevel(int happiness_level){
    this.happiness_level = happiness_level;
    if (this.happiness_level < 0){
      this.happiness_level = 0;
    }
    if(this.happiness_level > 10){
      this.happiness_level = 10;
    }
  }

  public int getDramaLevel(){
    return this.drama_level;
  }

  public void setDramaLevel(int drama_level){
    this.drama_level = drama_level;
    if (this.drama_level < 0){
      this.drama_level = 0;
    }
    if(this.drama_level > 10){
      this.drama_level = 10;
    }
  }
  // this.drama.level = this.drama_level < 0 ? 0;
  // this.drama_level = (this.drama_level < 0) ? 0;
  // this.drama_level < 0 ? : this.drama_level = 0;

  public double getAge(){
    return this.age;
  }

  public void setAge(double age){
    this.age = age;
  }

  public boolean getAliveTrueFalse(){
    return this.alive;
  }

  public void setAliveTrueFalse(boolean soul){
    this.alive = soul;
  }

  public int getWeight(){
    return this.weight;
  }

  public void setWeight(int weight){
    if((this.weight >= 0 && this.weight < 100) && (weight >= 0 && weight <= 100)){
    this.weight = weight;
    }
  }

  // LIFE EVENTS:

  public void isBorn(){
    this.setHungerLevel(10);
    this.setHappinessLevel(4);
    this.setDramaLevel(3);
    this.setAliveTrueFalse(true);
  }

  public void isAging(double minutes){
    double increase = minutes/41.76;
    increase = Math.round(increase *100.0)/100.0;
    age += increase;
  }

  // POSITIVE ACTIONS:

  

  public void sleep(){
    this.setHungerLevel(this.hunger_level + 1);
    this.setHappinessLevel(this.happiness_level + 1);
    this.setDramaLevel(this.drama_level - 1);
  }

  // VITALS OVER TIME:

  public void reallyHungry(int time_since_feed){
    if(time_since_feed > 83.52){
      this.setHungerLevel(this.hunger_level -= 1);
    }
  }

  // INTERMEDIARY SANCTIONS:

  public void getsOverweight(){
    if(getWeight() > 75){
     this.setHappinessLevel(this.happiness_level - 3);
     this.setDramaLevel(this.drama_level + 4);
    }
  }

  // ULTIMATE SANCTIONS:

  public void starves(int time_since_feed){
    if(time_since_feed > 584.64 && this.hunger_level == 10 && this.weight < 10){
      setAliveTrueFalse(false);
    }
  }

  public void depressed(int time_since_happy_increase){
    if(time_since_happy_increase > 7015.68 && this.happiness_level == 0){
      setAliveTrueFalse(false);
    }
  }

  public void heartAttack(int time_since_relaxation){
    if(time_since_relaxation > 292.32 && this.drama_level == 10){
      setAliveTrueFalse(false);
    }
  }

  public void morbidlyObese(int time_since_reaching_95kg){
    if(time_since_reaching_95kg > 1169.28 && this.weight > 95){
      setAliveTrueFalse(false);
    }
  }

  // HOUSE DRAMA FACTOR AFFECT:

  public void dramaFactorAffect(House house){
    house.computeDramaFactor();
    int drama_factor = (house.drama_factor/2);
    System.out.println("total =" + house.drama_factor);
    this.setDramaLevel(this.drama_level += drama_factor);
  }
}

// how to link game with time, especially in above method
// fix tierney
// printout or return strings?
// efficient way to set alive as a condition on all methods?
// can't extend and override feed method
// Calculate Affinity method doesn't work

