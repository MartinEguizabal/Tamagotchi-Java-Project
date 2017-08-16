package wizard_management;
import java.util.ArrayList;

public class Campus{

  String name;
  ArrayList<House> houses;

  public Campus(String name){
    this.name = name;
    this.houses = new ArrayList<House>();
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public int countHouses(){
    return this.houses.size();
  }

  public void addHouse(House house){
    this.houses.add(house);
  }

  public void removeHouse(House house){
    this.houses.remove(house);
  }

  public String findHouse(House house){
    for(House the_house : this.houses){
      if(the_house == house){
        return the_house.getName();
      }
    }
    return "Can't find house";
  }


}