public class Entree {
    private int nombreEnclos;
    private Enclos[] lesEnclos;
    private double prix;
    private Visiteur visiteur;
    private Zoo zoo;

    public Entree(Visiteur visiteur, Zoo zoo) {
        setVisiteur(visiteur);
        setZoo(zoo);
    }

    public int getNombreEnclos() {
        return nombreEnclos;
    }


    public Enclos[] getLesEnclos() {
        return lesEnclos;
    }


    public double getPrix() {
        return prix;
    }


    public Visiteur getVisiteur() {
        return visiteur;
    }
    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    private Enclos[] getEnclosSecure(){

        int enclosAvecGardien = 0;
        for (Enclos enclos : zoo.getLesEnclos()){
            if (enclos.getGardien() != null){
                enclosAvecGardien++;
            }
        }
        Enclos[] enclosAccessibles = new Enclos[enclosAvecGardien];
        int i = 0;
        for(Enclos enclos : zoo.getLesEnclos()){
            if(enclos.getGardien() != null){
                enclosAccessibles[i] = enclos;
                i++;
            }
        }
        return enclosAccessibles;
    }

    private int nbEnclosAccessibles(){
        return getEnclosSecure().length;
    }
}
