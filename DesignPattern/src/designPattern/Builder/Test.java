package designPattern.Builder;

// -- Direct를 이용해 Hero를 찍어내는 Test class --
public class Test {
    public static void main(String[] args) {
        Builder builder = new BatmanBuilder();
        Director director = new Director(builder);
        //director Builder = BatmanBuilder
        director.build();
        Hero hero = director.getHero();
        hero.showResult();
        
        
    }
}