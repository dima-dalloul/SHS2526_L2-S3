package fr.uga.miashs.inff3.bataillenavale;

public class Coordonnee {
    /*
     *  Rappel :
     *  	- A1 où A désigne la colonne et 1 désigne la ligne.
     *  	- 2 attributs représentant la ligne et la colonne sous forme
     *  		d'indices commençant à 0.
     *  	- Pour convertir la colonne d'une coordonnée au format lettre en indice
     *  		il faut soustraire le caractère 'A' à la lettre que l'on veut convertir.
     *  	- Par exemple, pour la coordonnée « C1 », l’attribut ligne sera initialisé
     *  		à 0 et l’attribut colonne à 2.
     */
    // -------------------- Attributs --------------------//
    private int colonne = 0; 	// la différence entre la lettre donnée et la lettre A
    private int ligne = 0;		// le chiffre qui va être donné

    // -------------------- Constructeurs --------------------//
    /*
     * Ajoutez un premier constructeur qui prend en paramètre une chaîne de caractères contenant les coordonnées
     * dans le système « bataille navale ». Pour réaliser ce constructeur, utilisez les méthodes charAt(…)
     * et subString(...) de la classe String, et la fonction Integer.parseInt(…) qui permet de parser un entier
     * à partir d’une chaîne de caractères.
     * NB: l'expression 'A'-'A', convertie en int donne 0 en Java ('B'-'A' donne 1, etc.).
     */

    /**
     * Constructeur d'un objet Coordonnée à partir d'une chaîne de caratères
     * @param s Chaîne de caractères
     */
    public Coordonnee(String s) {
        // Je crée des variables intermédiaires
        char colonne;
        String ligne;

        // Je récupère la colonne et la ligne sous format de caractères
        // Pour la colonne, je la récupère sous forme Majuscule (ainsi même si c'est en minuscule,
        // je la traite de la même manière que la majuscule).
        colonne = (s.toUpperCase()).charAt(0);
        ligne = s.substring(1);

        // Je soustrais le code ASCII de la colonne avec celui de 'A' et je stocke dans l'attribut colonne
        this.colonne = colonne - 'A';
        // Je fais la même chose pour la ligne sachant que l'indice humain commence par 1 et celui des PCs à 0,
        // donc je convertis le string en int et je soustrais de 1
        this.ligne = Integer.parseInt(ligne) - 1;
    }

    /**
     * Constructeur d'un objet Coordonnée à partir de 2 entiers l pour ligne et c pour colonne
     * @param l pour la ligne
     * @param c pour la colonne
     */
    public Coordonnee(int l, int c) {
        // Je stocke les éléments directement en supposant que les indices renvoyées ont correctement été calculés.
        this.colonne = c;
        this.ligne = l;
    }

    // -------------------- Getters ---------------------//
    /**
     * Je renvoie la ligne
     * @return entier qui correspond à l'indice de la ligne
     */
    public int getLigne() {
        return this.ligne;
    }

    /**
     * Je renvoie la colonne
     * @return entier qui correspond à l'indice de la colonne
     */
    public int getColonne() {
        return this.colonne;
    }


    // -------------------- Méthodes --------------------//
    /*
     * Ajoutez la méthode public boolean equals(Object o) qui retourne true ssi la coordonnée courante
     * possède la même ligne et la même colonne que celle passée en paramètre.
     * Pour tester à l’exécution que o est bien une instance de Coordonnee, vous pouvez utiliser le code suivant :
     * if (o instanceof Coordonnee) {
     * Coordonnee c = (Coordonnee) o;
     * // On passe ici si o référence une coordonnée
     * // il faut tester l’égalite
     * }
     * return false;
     */
    /**
     * Tester l'égalité entre la coordonnée courante avec la coordonée passée en paramètre
     * @param o coordonnée à tester
     * @return vrai si c'est sur la même ligne et la même colonne
     */
    public boolean equals(Object o) {
        if (o instanceof Coordonnee) {
            Coordonnee c = (Coordonnee) o;
            // Je teste si ces 2 coordonnées ont la même ligne ET la même colonne
            if(c.getColonne() == this.colonne && c.getLigne() == this.ligne)
                // Si oui, je renvoie vrai
                return true;
            else
                // Si non, je renvoie faux
                return false;
        }
        return false;
    }


    /*
     * Ajoutez la méthode public boolean voisine(Coordonnee o) qui retourne true
     * si la coordonnée courante est voisine de celle passée en paramètre.
     *  On considère seulement le 4-voisinage (i.e. les coordonnées en diagonale
     *  ne sont pas voisines).
     */
    /**
     *
     * Elles sont voisines si elles sont sur la même ligne et/ou sur la même colonne
     * (les coordonnées diagonalles ne sont pas considérées comme voisines)
     * @param c coordonnée à tester
     * @return vrai si elle est voisine avec la coordonnée actuelle
     */
    /**
     * Tester si la coordonnée donnée en paramètre est voisine de la coordonnée actuelle
     * @param c Coordonnee  à tester si voisine
     * @return vrai si elles sont voisines, faux sinon
     */
    public boolean voisine(Coordonnee c) {
        // V1 - version longue
        // Par défaut, on met à faux
        boolean resultat = false;

        // Je teste si elles sont voisines sur la même colonne
        if ((this.colonne == c.colonne) && (this.ligne == c.ligne - 1)){
            resultat = true;
        } else if ((this.colonne == c.colonne) && (this.ligne == c.ligne + 1)){
            resultat = true;
        }
        // Je teste si elles sont voisines sur la même ligne
        else if ((this.colonne == c.colonne - 1 ) && (this.ligne == c.ligne)) {
            resultat = true;
        } else if ((this.colonne == c.colonne + 1 ) && (this.ligne == c.ligne)) {
            resultat = true;
        }

        // Je renvoie le résultat
        return resultat;

        /*
        // V2 - version compacte
        return (
                ((this.colonne == c.colonne) && (this.ligne == c.ligne - 1))  ||
                ((this.colonne == c.colonne) && (this.ligne == c.ligne + 1)) ||
                ((this.colonne == c.colonne - 1 ) && (this.ligne == c.ligne)) ||
                ((this.colonne == c.colonne + 1 ) && (this.ligne == c.ligne))
        );
        */
    }

    /**
     * Méthode pour comparer deux coordonnées.
     * Une coordonnée est plus petite qu’une autre si elle est
     * placée avant dans le sens de la lecture (gauche à droite, haut en bas).
     * Cette méthode retourne un nombre négatif si la coordonnée courante est plus petite que o,
     * 0 si elles sont égales,
     * un nombre positif si elle est plus grande que o.
     * @param c Coordonnée à tester
     * @return entier 0 ou nombre négatif ou nombre positif
     */
    public int compareTo(Coordonnee c) {
        // On compare selon la ligne

        // On gère le cas des lignes inférieures
        if(this.ligne > c.ligne){
            // Cas C3 et A1
            return (this.ligne - c.ligne);
        }
        // On compare l'égalité des lignes
        else if (this.ligne == c.ligne){
            // On compare les colonnes
            if (this.colonne > c.colonne){
                // Cas C3 et A3
                return (this.colonne - c.colonne);
            } else if(this.colonne == c.colonne){
                // Cas C3 et C3
                return 0;
            } else {
                // Cas C3 et E3
                return (this.colonne - c.colonne);
            }
        }
        // On gère le cas des lignes supérieures
        else {
            // Cas C3 et D9
            // Cas E1 et A2
            return (this.ligne - c.ligne);
        }
    }

    /**
     * Méthode pour afficher une représentation en coordonnées de type "A1"
     */
    public String toString() {
        String resultat = "";
        char col;
        int l;

        // Étape 1 : convertir la colonne en caractère entre A et Z
        col = (char) ('A' + this.colonne);

        // Étape 2 : convertir la ligne d'indice PC à indice humain
        l = this.ligne + 1;

        // Étape 3 : afficher
        resultat = resultat + col + l;
        return resultat;
    }
}
