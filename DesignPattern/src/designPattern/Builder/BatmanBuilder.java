package designPattern.Builder;

// --- 복잡한 Hero 객체를 실제로 만들어내는 Builder의 구현체인 배트맨 찍어내는 클래스 ---
public class BatmanBuilder implements Builder {
    private Hero batman;
    
    BatmanBuilder(){
        batman = new Hero("batman");
    }
    public void makeArm() {
        batman.setArmSource("money1");
    }
    public void makeLeg() {
        batman.setLegSource("money2");
    }
    public Hero getResult() {
        return batman;
    }
}