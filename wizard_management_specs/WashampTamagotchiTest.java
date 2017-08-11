import wizard_management.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class WashampTamagotchiTest{

  WashampTamagotchi washamptamagotchi;

  @Before
  public void before(){
    washamptamagotchi = new WashampTamagotchi("Whizzup", 0, 0, 0, 0);
  }

  @Test
  public void canGetName(){
    assertEquals("Whizzup", washamptamagotchi.getName());
  }

  @Test
  public void canGetHungerLevel(){
    assertEquals(0, washamptamagotchi.getHungerLevel());
  }

  @Test
  public void canGetHappinessLevel(){
    assertEquals(0, washamptamagotchi.getHappinessLevel());
  }
}