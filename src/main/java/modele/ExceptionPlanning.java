package modele;

public class ExceptionPlanning extends Exception {

    private int chCodeErreur;


    public ExceptionPlanning(int parCodeErreur) {

        this.chCodeErreur = parCodeErreur;

    }
    public int getCodeErreur() {

        return chCodeErreur;
    }
}
