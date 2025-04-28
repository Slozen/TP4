package client;

import modele.DateCalendrier;

import java.util.Arrays;


public class ClientDateCalendrier {

    public static void main(String[] args){
        DateCalendrier d1 = new DateCalendrier();
        DateCalendrier d2 = new DateCalendrier(16,5,2016);
        DateCalendrier d3 = new DateCalendrier(1,12,2010);
        DateCalendrier d4 = new DateCalendrier(20,9,2020);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1.dateDuLendemain());
        System.out.println(d2.dateDeLaVeille());
        DateCalendrier [] tableauDeDates = new DateCalendrier[4];
        tableauDeDates[0] = d1;
        tableauDeDates[1] = d2;
        tableauDeDates[2] = d3;
        tableauDeDates[3] = d4;
        System.out.println(Arrays.toString(tableauDeDates));
        Arrays.sort(tableauDeDates);
        System.out.println(Arrays.toString(tableauDeDates));
    }
}
