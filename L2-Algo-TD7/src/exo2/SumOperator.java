package exo2;

public class SumOperator implements Operator {
    @Override
    public int calcul(Liste liste) {
        int result = 0;
        for (int i = 0; i < liste.getSize(); i++)
            result += liste.getElements()[i];
        return result;
    }
}
