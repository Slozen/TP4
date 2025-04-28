package client;

import modele.*;

public class ClientPlanningCollection implements ConstantesErreur {

    public static void main (String[]args){

        PlanningCollection planningVacances = new PlanningCollection();


        try {
            planningVacances.ajout(new Reservation("Musculation", new Date(24, 10, 2025),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            planningVacances.ajout(new Reservation("Python", new Date(17, 10, 2025),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            planningVacances.ajout(new Reservation("DANSE", new Date(26, 11, 2030),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            planningVacances.ajout(new Reservation("Java", new Date(19, 11, 2030),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            planningVacances.ajout(new Reservation("¨Maths", new Date(18, 11, 2030),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            planningVacances.ajout(new Reservation("Musculation", new Date(24, 10, 2026),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            planningVacances.ajout(new Reservation("Musculation", new Date(31, 10, 2026),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            planningVacances.ajout(new Reservation("Musculation", new Date(6, 11, 2026),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            planningVacances.ajout(new Reservation("Musculation", new Date(13, 11, 2026),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));

            planningVacances.ajout(new Reservation("Musculation", new Date(20, 11, 2026),
                    new PlageHoraire(new Horaire(10, 15), new Horaire(11, 15))));





        }
        catch (ExceptionPlanning exceptionPlanning) {
            System.out.println(ERREURS_PLANNING[exceptionPlanning.getCodeErreur()]);


        }
        System.out.println(planningVacances.toString());
        System.out.println(planningVacances.getReservations((new DateCalendrier (24,10,2025))));
        System.out.println(planningVacances.getReservations("DANSE"));


    }
}
