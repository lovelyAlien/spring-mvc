package inflearn.factorypattern;

public class ShoesFactory {
    public Shoes getShoes(Brand brand) {
        if (brand == Brand.NIKE) {
            return new Nike();
        } else if (brand == Brand.ADIDAS) {
            return new Adidas();
        } else {
            return new NewBalance();
        }
    }
}

enum Brand {
    NIKE, ADIDAS, NEWBALANCE
}
