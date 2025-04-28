package modele;

public class Horaire {

    private int chHeure;
    private int chQuartHeure;

    public Horaire (int parHeure, int parQuartHeure) {

        this.chHeure = parHeure;
        this.chQuartHeure = parQuartHeure;
    }

    public int toMinutes() {

        return chHeure * 60 + chQuartHeure;
    }

    public int getHeure() {

        return chHeure;
    }

    public int getQuartHeure() {

        return chQuartHeure;

    }

    public void setHeure(int parHeure) {

        this.chHeure = parHeure;
    }

    public void setQuartHeure(int parQuartHeure) {

        this.chQuartHeure = parQuartHeure;
    }

    public Boolean estValide() {

        if (chHeure < 0 || chHeure > 23)

            return false;

        if (chQuartHeure %15 != 0 || chQuartHeure >= 45   )

            return false;

        return true;
    }

    public String toString(){

        return chHeure +"h" + chQuartHeure;
    }
}
