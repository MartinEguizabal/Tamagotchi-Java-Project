import wizard_management.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CampusTest{

  Campus campus1;
  House house1;
  House house2;
  House house3;

  @Before
  public void before(){
    campus1 = new Campus("Tamagotchi College Campus");
    house1 = new House("Veritable", false, 0);
    house2 = new House("The Honky Tonk", false, 0);
    house3 = new House("Tomogatchi Groto", false, 0);
  }

  @Test
  public void canAddHouse(){
    campus1.addHouse(house3);
    assertEquals(1, campus1.countHouses());
    assertEquals("Tomogatchi Groto", campus1.findHouse(house3));
  }

  @Test
  public void canRemoveHouse(){
    campus1.addHouse(house1);
    campus1.addHouse(house3);
    campus1.removeHouse(house1);
    assertEquals("Can't find house", campus1.findHouse(house1));
  }

  @Test
  public void canFindHouse(){
    campus1.addHouse(house1);
    campus1.addHouse(house2);
    assertEquals("The Honky Tonk", campus1.findHouse(house2));
  }

  @Test
  public void cannotFindHouse(){
    campus1.addHouse(house1);
    campus1.addHouse(house2);
    assertEquals("Can't find house", campus1.findHouse(house3));
  }
}