package pattern.Factory;

/*
工廠模式 - 主程式
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("[Pattern][Factory][Main] start!");
        Factory carFactory = new Factory();

        //取得P1
        Car car1 = carFactory.getProduct("P1");
        //P1的輪子
        car1.wheel();

        //取得P2
        Car car2 = carFactory.getProduct("P2");
        //P2的輪子
        car2.wheel();
    }
}
