package pattern.Factory;

/*
工廠模式 - 介面
想成是各產品都有同架構的模組，再各自客製
具體產品角色(ConcreteProduct)：工廠類所創建的對象就是此角色的實例。
 */
public interface Car {
    //各產品自己的模組 - 車輪
    void wheel();
}
