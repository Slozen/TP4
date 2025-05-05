import modele.ExceptionPlanning;
import modele.Horaire;
import modele.PlageHoraire;
import org.junit.Test;
import org.junit.jupiter.api.*;


import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class testHoraire {

    @Test
    public void testComparTo() throws ExceptionPlanning{


        Horaire a1 = new Horaire(15,30);
        Horaire a2 = new Horaire(10,10);
        Horaire a3 = new Horaire(10,0);


        assertTrue(a1.compareTo(a2) > 0);
        assertTrue(a2.compareTo(a2) == 0);
        assertTrue(a2.compareTo(a1) < 0);


    }
}
