package pattern.Factory;

/*
工廠模式 - 產品1
抽象產品角色(Product)：它一般是由具體產品繼承的父類或者實現的接口。
 */
public class Product1 implements Car {

    @Override
    public void wheel() {
        System.out.println("[Product1][productModule]");
        System.out.println("[Product1]我是紅色的輪子");
    }
}