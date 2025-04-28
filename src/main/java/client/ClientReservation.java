package client;

import modele.*;

public class ClientReservation implements ConstantesErreur{

    public static void main(String[] args) {


        try {
            Reservation a1 = new Reservation("Musculation", new Date(24, 10, 2025),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15)));

            Reservation a2 = new Reservation("Musculation", new Date(1, 2, 2013),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15)));

            System.out.println(a1.toString());
            System.out.println(a1.compareTo(a1));
        }
        catch (ExceptionPlanning parException) {

            System.out.println(ERREURS_PLANNING[parException.getCodeErreur()]);



        }


    }
}
