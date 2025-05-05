import modele.ExceptionPlanning;
import modele.Horaire;
import modele.PlageHoraire;
import org.junit.jupiter.api.*;


import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class TestPlageHorraire {



    @Test
    public void testDuree() throws ExceptionPlanning {

        PlageHoraire a1 = new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15));

        PlageHoraire a2 = new PlageHoraire(new Horaire(11, 15), new Horaire(11, 15));

        assertTrue(a1.duree() == 60 );
        assertFalse(a2.duree() == 15);
  }

  @Test
  public void testcomparTo() throws ExceptionPlanning{

      PlageHoraire a1 = new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15));

      PlageHoraire a2 = new PlageHoraire(new Horaire(12, 15), new Horaire(13, 15));

      PlageHoraire a3 = new PlageHoraire(new Horaire(12, 15), new Horaire(13, 15));


      assertEquals(-1,a1.compareTo(a2), "test réussie valeur negatif");
      assertEquals(0,a2.compareTo(a3), "test réussie null");
      assertEquals(1,a2.compareTo(a1), "test réussie valeur positif");
  }
}
