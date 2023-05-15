package pattern.Singleton;
/*
* 實例模式-實例對象*/
public class SingleObject {
    //建立實例對象
    private static SingleObject instance;

    //不實例化
    private SingleObject(){}

    //取得已創建實例對象
    public static SingleObject getInstance() {
        if (instance == null) {
            System.out.println("[Create][SingleObject]");
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
