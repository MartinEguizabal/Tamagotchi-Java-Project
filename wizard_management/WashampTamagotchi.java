package wizard_management;

public class WashampTamagotchi extends Tamagotchi{

  public WashampTamagotchi(String name, int hunger_level, int happiness_level, int drama_level, double age, Boolean alive, int weight){
    super(name, hunger_level, happiness_level, drama_level, age, alive, weight);
  }

  public String feed(String food){
      int hunger_decrease = 0;
      int happiness_increase = 0;
      int drama_decrease = 0;
        switch (food){
          case "bugs": 
          hunger_decrease = 2;
          happiness_increase = 4;
          break;
          case "farm animal": 
          hunger_decrease = 8;
          break;
          case "steak": 
          hunger_decrease = 4;
          happiness_increase = 2;
          break;
          case "lemon curd": 
          hunger_decrease = 1;
          break;
          case "candy": 
          hunger_decrease = 1;
          drama_decrease = 3;
          break;
          case "scampi": 
          hunger_decrease = 2;
          happiness_increase = 1;
          break;
          case "salad": 
          hunger_decrease = 2;
          drama_decrease = 2;
          break;
          default: return "Yeah right, go see yur ma!";
        }
        this.setHungerLevel(this.hunger_level -= hunger_decrease);
        this.setHappinessLevel(this.happiness_level += happiness_increase);
        this.setDramaLevel(this.drama_level -= drama_decrease);
        return "Yummy";
    }
}