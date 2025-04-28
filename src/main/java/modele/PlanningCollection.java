package modele;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class PlanningCollection {

    private ArrayList<Reservation> chArrayList;
    private TreeSet<Reservation> chTreeSet;
    private TreeMap<Integer,TreeSet<Reservation>> chTreeMap;

    public PlanningCollection() {

        chArrayList = new ArrayList<>();
        chTreeSet = new TreeSet<>();
        chTreeMap = new TreeMap<>();
    }

    public void ajout(Reservation parReservation) throws ExceptionPlanning {

        int numeSemaine = parReservation.getDate().getNumeroSemaine();
        TreeSet<Reservation> setReservations = chTreeMap.get(numeSemaine);

        chTreeMap.put(numeSemaine, setReservations);

        if (setReservations == null){
            setReservations = new TreeSet<>();
            chTreeMap.put(numeSemaine, setReservations);
        }

        setReservations.add(parReservation);


        if (!parReservation.estValide())

            throw new ExceptionPlanning(0);

        for (int i = 0; i < chArrayList.size(); i++) {

            if (chArrayList.get(i).compareTo(parReservation) == 0)

                    throw new ExceptionPlanning(2);

        }
        chArrayList.add(parReservation);
        chTreeSet.add(parReservation);



    }


    /**
     * Retourne un treeset contenant les reservations de chTreeSet qui on lieu à la date reçus en paramettre
     *
     * @param parDate
     * @return
     * @throws ExceptionPlanning
     */
    public TreeSet<Reservation> getReservations(DateCalendrier parDate) {

        TreeSet<Reservation> resultat =  new TreeSet<>();

        Iterator<Reservation> iterateur = chTreeSet.iterator();

        while(iterateur.hasNext()) {
            Reservation reservation = iterateur.next();
            if (reservation.getDate().compareTo(parDate) == 0)

                resultat.add(reservation);
        }
        return resultat;

        }

        public TreeSet<Reservation>getReservations (String parString){

            TreeSet<Reservation> resultat =  new TreeSet<>();

            Iterator<Reservation> iterateur = chTreeSet.iterator();

            while(iterateur.hasNext()) {
                Reservation reservation = iterateur.next();
                if (reservation.getTitre().compareTo(parString) == 0)

                    resultat.add(reservation);
            }
            return resultat;


        }


    public String toString(){

        return chArrayList.size() + " "+ chArrayList.toString()+"\n"

                + chTreeSet.size()+" "+ chTreeSet.toString() +"\n"

                + chTreeMap.size()+" "+ chTreeMap.toString();
    }
}
