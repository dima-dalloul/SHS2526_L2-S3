public class Cylindre extends Cercle{
    private double rayon, hauteur;
    public Cylindre(){
        rayon = 1;
        hauteur = 1;
    }

    public Cylindre(double rayon){
        this.rayon = rayon;
    }

    public Cylindre(double rayon, double hauteur){
        this.rayon = rayon;
        this.hauteur = hauteur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public double volume(){
        // π r2 h
        return Math.PI * Math.pow(rayon, 2) * hauteur;
    }

    public double perimetre(){
        // 2diametre + 2hauteur
        return ((2 * 2 * rayon) + (2 * hauteur));
    }

    public double aire() {
        // 2π × R × h
        return (2 * Math.PI * rayon * hauteur);
    }

    @Override
    public double getRayon() {
        return rayon;
    }
}