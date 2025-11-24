package exo1;

import java.util.Arrays;

public abstract class ListManagement {
    private int[] elements;
    private int size;
    private int increment;
    private char operateur;

    public ListManagement(){
        this(10,10, '+');
    }

    public ListManagement(int initialSize, int increment, char operateur) {
        elements = new int[initialSize];
        this.increment=increment;
        size=0;
        this.operateur = operateur;
    }

    public void add(int value) {
        if (elements.length==size) {
            elements = Arrays.copyOf(elements, elements.length+increment);
        }
        elements[size] = value;
        size++;
    }

    public int eval(){
        if(operateur == '+'){
            int result = 0;
            for (int i = 0; i < size; i++)
                result += elements[i];
            return result;
        } else {
            int result = 1;
            for (int i = 0; i < size; i++)
                result *= elements[i];
            return result;
        }
    }
}

/**
 * Ces codes ont de nombreuses ressemblances. Il serait donc judicieux de factoriser un peu cela.
 * Proposez une solution avec une classe abstraite dont hériteront exo1.ListSum et exo1.ListProduct.
 * Astuce pour factoriser au maximum : On peut isoler dans des méthodes abstraites l’initialisation du résultat
 * par l’élément neutre de l’opérateur et l’opération en elle même.
 */
