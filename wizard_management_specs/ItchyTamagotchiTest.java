import wizard_management.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ItchyTamagotchiTest {

  ItchyTamagotchi itchytamagotchi;

  @Before
  public void before(){
    itchytamagotchi = new ItchyTamagotchi("TestTamagotchi", 0, 0, 0, 0, false);
  }

  @Test
  public void canGetName(){
    assertEquals("TestTamagotchi", itchytamagotchi.getName());
  }

  @Test
  public void canGetHappinessLevel(){
    assertEquals(0, itchytamagotchi.getHappinessLevel());
  }

  @Test
  public void canGetAge(){
    assertEquals(0, itchytamagotchi.getAge(), 0.01);
  }
}

// Icky