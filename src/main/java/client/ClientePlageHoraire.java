package client;

import modele.*;

public class ClientePlageHoraire implements ConstantesErreur {

    public static void main(String[] args) {


        try {
            PlageHoraire a2 = new PlageHoraire(new Horaire(23, 0), new Horaire(15, 15));

        }
        catch (ExceptionPlanning parException) {

            System.out.println(ERREURS_PLANNING[parException.getCodeErreur()]);

        }

    }
}
