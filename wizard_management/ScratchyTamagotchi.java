package wizard_management;

public class ScratchyTamagotchi extends Tamagotchi{

  public ScratchyTamagotchi(String name, int hunger_level, int happiness_level, int drama_level, double age, Boolean alive, int weight){
    super(name, hunger_level, happiness_level, drama_level, age, alive, weight);
  }

  public String feed(String food){
      int hunger_decrease = 0;
      int happiness_increase = 0;
      int drama_decrease = 0;
        switch (food){
          case "worms": 
          hunger_decrease = 2;
          break;
          case "fried hubba bubba": 
          hunger_decrease = 1;
          drama_decrease = 3;
          break;
          case "fried fleas": 
          hunger_decrease = 3;
          happiness_increase = 2;
          break;
          case "bacon scratchers": 
          hunger_decrease = 2;
          happiness_increase = 3;
          drama_decrease = 3;
          break;
          default: return "RRrrraaaallppphhh...eck..cough.. no way!";
        }
        this.setHungerLevel(this.hunger_level -= hunger_decrease);
        this.setHappinessLevel(this.happiness_level += happiness_increase);
        this.setDramaLevel(this.drama_level -= drama_decrease);
        return "Dats good!";
    }
}