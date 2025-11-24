package exo2;

public class MainExo2 {
    public static void main(String[] args){
        Liste l = new Liste(10, 10);
        l.add(5);
        l.add(10);
        l.add(15);
        SumOperator sumOperator = new SumOperator();
        ProductOperator productOperator = new ProductOperator();
        System.out.println("Somme de la liste = " + sumOperator.calcul(l));
        System.out.println("Produit de la liste = " + productOperator.calcul(l));
    }

}
