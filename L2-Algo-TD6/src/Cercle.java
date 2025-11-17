public class Cercle {
    private double rayon;

    public Cercle(){
        rayon = 1.0;
    }

    public Cercle(double rayon){
        this.rayon = rayon;
    }

    public double getRayon(){
        return rayon;
    }

    public double aire(){
        // V1 :
        return Math.PI * Math.pow(rayon, 2);
        // V2
        // return Math.PI * rayon * rayon;
    }

    public double perimetre(){
        return 2 * Math.PI * rayon;
    }
}