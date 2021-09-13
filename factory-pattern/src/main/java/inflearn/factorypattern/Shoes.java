package inflearn.factorypattern;

abstract class Shoes {

    protected abstract String getShoesName();

    public Shoes(){
        System.out.println(this.getShoesName()+ "신발 객체 생성");
    }
}

class Adidas extends Shoes{
    @Override
    protected  String getShoesName(){
        return "아디다스";
    }
}

class Nike extends Shoes{
    @Override
    protected  String getShoesName(){
        return "나이키";
    }
}

class NewBalance extends Shoes{
    @Override
    protected  String getShoesName(){
        return "뉴발란스";
    }
}

