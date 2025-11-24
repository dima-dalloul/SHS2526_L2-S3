package exo2;

public class ProductOperator implements Operator{
    @Override
    public int calcul(Liste liste) {
        int result = 1;
        for (int i = 0; i < liste.getSize(); i++)
            result *= liste.getElements()[i];
        return result;
    }
}
