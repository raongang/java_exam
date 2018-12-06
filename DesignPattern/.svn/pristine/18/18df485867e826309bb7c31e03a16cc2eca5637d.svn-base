package designPattern.Builder;

// -- Builder를 관리해주는 Director --
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void build(){
        builder.makeArm();
        builder.makeLeg();
    }
    public Hero getHero(){
        return builder.getResult();
    }
}