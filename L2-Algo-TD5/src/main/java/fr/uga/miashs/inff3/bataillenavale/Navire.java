package fr.uga.miashs.inff3.bataillenavale;

public class Navire {
    // ------------------- Attributs -------------------//
    private Coordonnee debut;   // debut est la coordonnée du début
    private Coordonnee fin;     // fin est la coordonnée de fin du navire
    private Coordonnee[] partiesTouchees;   // Le tableau partiesTouchees contient les coordonnées du navire qui sont touchées
    private int nbTouchees;     // nbTouchees le nombre de parties du navire réellement touchées.

    // ------------------- Constructeur -------------------//

    /**
     * Constructeur qui calcule la coordonnée de fin à partir des paramètres longueur et estVertical.
     * L'attribut partiesTouchees sera instancié et l’attribut nbTouchees initialisé à 0.
     * @param debut
     * @param longueur
     * @param estVertical
     */
    public Navire(Coordonnee debut, int longueur, boolean estVertical){
        this.debut = debut;

        // Je teste si c'est vertical
        if(estVertical){
            // la coordonnée de fin sera sur la même colonne mais pas la même ligne
            fin = new Coordonnee((debut.getLigne() + longueur - 1), debut.getColonne());
        } else {
            // la coordonnée de fin sera sur la même ligne mais pas la même colonne
            fin = new Coordonnee(debut.getLigne(), (debut.getColonne() + longueur - 1));
        }

        // J'initialise les parties touchées à 0 car on est au début
        this.partiesTouchees = new Coordonnee[longueur];
        this.nbTouchees = 0;
    }

    // ------------------- Méthodes -------------------//
    /**
     * Méthode pour afficher ne représentation textuelle d’un navire, .i.e. sa cordonnée de début,
     * celle de fin ainsi que les coordonnées touchées
     * @return String d'affichage
     */
    public String toString(){
        return "Navire dont la coordonnée de début est : " + debut.toString() +
                ", dont la coordonnée de fin est : " + fin.toString() +
                " et il a ces coordonnées touchées " + partiesTouchees.toString();
    }

    /**
     * Méthode Getter de la coordonnée de début
     * @return Coordonnée fin
     */
    public Coordonnee getDebut(){
        return debut;
    }

    /**
     * Méthode Getter de la coordonnée de fin
     * @return Coordonnée fin
     */
    public Coordonnee getFin(){
        return fin;
    }

    /**
     * Méthode qui retourne true si la coordonnée passée en paramètre est contenue dans le navire.
     * @param c à tester
     * @return true si elle est dans le navire
     */
    public boolean contient(Coordonnee c){
        // Je teste si la colonne donnée est entre la colonne de début et celle de fin
        // Ainsi que si la ligne donnée est entre la ligne de début et celle de fin
        return (
                ((this.debut.getColonne() <= c.getColonne()) && (c.getColonne() <= this.fin.getColonne()))
                &&
                ((this.debut.getLigne() <= c.getLigne()) && (c.getLigne() <= this.fin.getLigne()))
                );
    }
}

/*
La ligne (resp. la colonne) de la coordonnée de début est toujours inférieure ou égale à la
ligne (resp. la colonne) de la coordonnée de fin.
*/
