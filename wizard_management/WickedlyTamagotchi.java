package wizard_management;

public class WickedlyTamagotchi extends Tamagotchi {

  public WickedlyTamagotchi(String name, int hunger_level, int happiness_level, int drama_level, double age, boolean alive, int weight){
    super(name, hunger_level, happiness_level, drama_level, age, alive, weight);
  }

  public String feed(String food){
      int hunger_decrease = 0;
      int happiness_increase = 0;
      int drama_decrease = 0;
        switch (food){
          case "protein shake": 
          hunger_decrease = 3;
          happiness_increase = 1;
          break;
          case "slurpy": 
          hunger_decrease = 1;
          break;
          case "steak": 
          hunger_decrease = 4;
          happiness_increase = 2;
          break;
          case "lemon curd": hunger_decrease = 1;
          break;
          case "cherry cough syrup": 
          hunger_decrease = 1;
          drama_decrease = 3;
          break;
          case "irn-bru": 
          hunger_decrease = 2;
          happiness_increase = 1;
          break;
          case "marmelade haggis": 
          hunger_decrease = 5;
          happiness_increase = 3;
          drama_decrease = 2;
          break;
          default: return "Yeachtk, I don't eat dat!";
        }
        this.setHungerLevel(this.hunger_level -= hunger_decrease);
        this.setHappinessLevel(this.happiness_level += happiness_increase);
        this.setDramaLevel(this.drama_level -= drama_decrease);
        return "Yummy";
    }

  }

