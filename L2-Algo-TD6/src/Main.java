public class Main {
    public static void main(String[] args){
        //B b = new B(false);

        //C c = new C();

        /* Fin exercice 1 - décommenter pour voir la sortie compilateur
        A u = new A();
        B v = new A();
        A w = new B();
        A x = new C();
        C y = new C();
        B z = new C();

        u.m5();
        y.m1();
        y.m6();
        x.m6();
        */

        Cercle cercle0 = new Cercle();
        Cercle cercle1 = new Cercle(2.5);
        System.out.println("Rayon de cercle0 = " + cercle0.getRayon());
        System.out.println("Aire de cercle0 = " + cercle0.aire());
        System.out.println("Périmètre de cercle0 = " + cercle0.perimetre());
        System.out.println("Rayon de cercle1 = " + cercle1.getRayon());
        System.out.println("Aire de cercle1 = " + cercle1.aire());
        System.out.println("Périmètre de cercle1 = " + cercle1.perimetre());

        Cylindre cylindre0 = new Cylindre();
        Cylindre cylindre1 = new Cylindre(2.5);
        Cylindre cylindre2 = new Cylindre(4, 8);

        System.out.println("Rayon de cylindre0 = " + cylindre0.getRayon());
        System.out.println("Volume de cylindre0 = " + cylindre0.volume());
        System.out.println("Perimetre de cylindre0 = " + cylindre0.perimetre());
        System.out.println("Aire de cylindre0 = " + cylindre0.aire());

        System.out.println("Rayon de cylindre1 = " + cylindre1.getRayon());
        System.out.println("Volume de cylindre1 = " + cylindre1.volume());
        System.out.println("Perimetre de cylindre1 = " + cylindre1.perimetre());
        System.out.println("Aire de cylindre1 = " + cylindre1.aire());

        System.out.println("Rayon de cylindre2 = " + cylindre2.getRayon());
        System.out.println("Volume de cylindre2 = " + cylindre2.volume());
        System.out.println("Perimetre de cylindre2 = " + cylindre2.perimetre());
        System.out.println("Aire de cylindre2 = " + cylindre2.aire());
    }
}
