package modele;

public class ExceptionPlageHoraire extends Exception {

    private int chCodeErreur;


    public ExceptionPlageHoraire(int parCodeErreur) {

        this.chCodeErreur = parCodeErreur;

    }
    public int getCodeErreur() {

        return chCodeErreur;
    }
}

