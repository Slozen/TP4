package client;

import modele.Date;

public class ClientDate {

    public static void main(String[] args) {

        Date a = new Date(9,11,1950);
        Date b = new Date(2,11,1950);


        System.out.println(b.compareTo(a));

        System.out.println(Date.estBissextile(2104));

        System.out.println(a.toString());

    }
}
