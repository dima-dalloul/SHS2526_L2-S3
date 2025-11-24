package exo2;

import java.util.Arrays;

public class Liste {
    private int[] elements;
    private int size;
    private int increment;

    public Liste(){
        this(10,10);
    }

    public Liste(int initialSize, int increment) {
        elements = new int[initialSize];
        this.increment=increment;
        size=0;
    }

    public void add(int value) {
        if (elements.length==size) {
            elements = Arrays.copyOf(elements, elements.length+increment);
        }
        elements[size] = value;
        size++;
    }

    /**
     * Il pourrait donc être intéressant de séparer le stockage (i.e. la liste) de l’opération.
     * Pour cela, on peut “déléguer” l’évaluation à une autre classe qui est l’opérateur.
     * On aura dans ce cas une classe concrète pour représenter la liste.
     * Cette classe aura une méthode eval qui prendra en paramètre une instance du type Operator.
     * Le type Operator est une interface pour laquelle il existe au moins deux implémentations :
     * SumOperator et ProductOperator.
     */

    public int eval(Operator operator){
        return operator.calcul(this);
    }

    //------------------------------ Getters and Setters ------------------------------
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getElements() {
        return elements;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }
}
