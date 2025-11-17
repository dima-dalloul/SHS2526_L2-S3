public class Main {
    public static void main(String[] args){
        ListSum listSum = new ListSum();
        listSum.add(5);
        listSum.add(10);
        listSum.add(15);
        System.out.println("Sum: " + listSum.eval());
        ListProduct listProduct = new ListProduct();
        listProduct.add(5);
        listProduct.add(10);
        listProduct.add(15);
        System.out.println("Product: " + listProduct.eval());

    }
}
