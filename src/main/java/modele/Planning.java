package modele;

import java.util.Arrays;

public class Planning {

    private Reservation [] reservations;
    private static int TAILLE_TAB;

    public Planning (int taille) {
        TAILLE_TAB = taille;
        reservations = new Reservation[TAILLE_TAB];
    }

    /**
     *
     * Methode 1 moins performante
    public boolean ajout2(Reservation reservation) {

        if(! reservation.estValide())

            return false;

        if (Reservations[TAILLE_TAB-1] != null)

            return false;

        for (int i = 0; i < TAILLE_TAB; i++) {

            if (Reservations[i] == null) {

                Reservations[i] = reservation;

                return true;
            }


            if (Reservations[i].compareTo(reservation) == 0)
                return false;
        }

        return true;
    }
     */

    public Reservation getReservation(Date parDate){

        for(int i = 0; i < TAILLE_TAB; i++) {

            if (reservations[i] != null && reservations[i].getDate().compareTo(parDate)==0)

                return reservations[i];
        }

            return null;

    }

    public void ajout(Reservation parRes) throws ExceptionPlanning{

        if (reservations[TAILLE_TAB - 1] != null)
            throw new ExceptionPlanning(1);

        if (!parRes.estValide())
            throw new ExceptionPlanning(0);

        for (int i = 0; i < TAILLE_TAB; i++) {

            if (reservations[i] != null && reservations[i].compareTo(parRes) == 0)
                    throw new ExceptionPlanning(2);

            if  (reservations[i] == null) {
                reservations[i] = parRes;
                break;
            }

        }
    }


    public String toString() {

      return Arrays.toString(reservations);
    }


}
