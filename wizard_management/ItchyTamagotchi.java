package wizard_management;

public class ItchyTamagotchi extends Tamagotchi {

  public ItchyTamagotchi(String name, int hunger_level, int happiness_level, int drama_level, double age, Boolean alive, int weight){
    super(name, hunger_level, happiness_level, drama_level, age, alive, weight);
  }

  public String feed(String food){
      int hunger_decrease = 0;
      int happiness_increase = 0;
      int drama_decrease = 0;
        switch (food){
          case "cherry cough syrup": 
          hunger_decrease = 1;
          drama_decrease = 3;
          break;
          case "lemon juice": 
          hunger_decrease = 2;
          drama_decrease = 3;
          break;
          case "tomato pie": 
          hunger_decrease = 3;
          happiness_increase = 4;
          drama_decrease = 5;
          break;
          case "tomato joice": 
          hunger_decrease = 1;
          drama_decrease = 1;
          break;
          case "rabbit": 
          hunger_decrease = 5;
          break;
          case "magpie": 
          hunger_decrease = 3;
          happiness_increase = 6;
          break;
          case "Nerds": 
          hunger_decrease = 1;
          happiness_increase = 6;
          break;
          case "Santa's raindeer": 
          hunger_decrease = 8;
          happiness_increase = 1;
          drama_decrease = 6;
          break;
          default: return "Say what?!";
        }
        this.setHungerLevel(this.hunger_level -= hunger_decrease);
        this.setHappinessLevel(this.happiness_level += happiness_increase);
        this.setDramaLevel(this.drama_level -= drama_decrease);
        return "Ho, ho, ho";
    }
}