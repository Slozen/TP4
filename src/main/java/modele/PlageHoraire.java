package modele;

public class PlageHoraire {

    private Horaire heure_Debut;
    private Horaire heure_Fin;
    private final static int DUREE_MIN = 30;


    public PlageHoraire(Horaire heure_Debut, Horaire heure_Fin) throws ExceptionPlanning {


        if (!heure_Debut.estValide()) {

             throw new ExceptionPlanning(2);

        }
        if (!heure_Fin.estValide()) {

            throw new ExceptionPlanning(1);

        }
        if (heure_Fin.toMinutes() - heure_Debut.toMinutes() < DUREE_MIN)

            throw new ExceptionPlanning(0);

        this.heure_Debut = heure_Debut;
        this.heure_Fin = heure_Fin;
    }


    /**
     * fonction qui vérifie si une plage horaire est valide
     * @return
     */
    public Boolean estValide(){

        return heure_Fin.toMinutes() - heure_Debut.toMinutes() >= DUREE_MIN;
    }

    /**
     * fonction qui calcule la duree de la plagehoraire
     * @return
     */
    public int duree() {

        return this.heure_Fin.toMinutes() - this.heure_Debut.toMinutes();
    }

    /**
     * Fonction qui compare 2 plagehoraire this et l'objet entré en parametre
     * @param heureComparee
     * @return
     */

    public int compareTo(PlageHoraire heureComparee) {

        if (this.heure_Fin.toMinutes() <= heureComparee.heure_Debut.toMinutes())

            return -1;

        if (heureComparee.heure_Fin.toMinutes() <= this.heure_Debut.toMinutes())

            return 1;

        return 0;

    }


    public String toString(){

        return heure_Debut + " " + heure_Fin;
    }

}
