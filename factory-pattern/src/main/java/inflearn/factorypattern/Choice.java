package inflearn.factorypattern;

public class Choice {

    private ShoesFactory shoesFactory=new ShoesFactory();


    Shoes shoes1;
    Shoes shoes2;
    Shoes shoes3;

    void withoutFactory(){
        shoes1=new Nike();
        shoes2=new Adidas();
        shoes3=new NewBalance();
    }

    void withFactory(){
        shoes1=shoesFactory.getShoes(Brand.NIKE);
        shoes2=shoesFactory.getShoes(Brand.ADIDAS);
        shoes3=shoesFactory.getShoes(Brand.NEWBALANCE);
    }

}
