package modele;

public class Reservation implements Comparable<Reservation>{

    private String titre;
    protected Date chDate;
    private PlageHoraire plageHoraire;

    public Reservation(String titre, Date date, PlageHoraire plageHoraire) throws ExceptionPlanning{

        if(!date.estValide()){

            throw new ExceptionPlanning(0);

        }

        if(!plageHoraire.estValide()){

            throw new ExceptionPlanning(1);
        }
        this.titre = titre;
        this.chDate = date;
        this.plageHoraire = plageHoraire;
    }


    /**
     *
     *Fonction qui compare 2 Réservation entre elles
     *
     * @param parReservation
     * @return
     */
    public int compareTo(Reservation parReservation) {

        if (this.chDate.compareTo(parReservation.chDate) == 0) {

            if (this.chDate.compareTo(parReservation.chDate) == 0)
                return 0;
        }

            if (this.chDate.compareTo(parReservation.chDate) == 1)
                return 1;

            return -1;
    }

    public String toString() {

        return this.titre + " " +" le " + this.chDate + " "+ "à" + " " + this.plageHoraire;
    }

    public boolean estValide() {

        return chDate.estValide() && plageHoraire.estValide();
    }

    public Date getDate(){

        return chDate;
    }

    public String getTitre(){

        return titre;
    }

}
