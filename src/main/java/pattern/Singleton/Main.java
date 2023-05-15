package pattern.Singleton;

/*
* 單例模式-主程式
* */
public class Main {
    public static void main(String[] args) {
        MakeThread makeThread = new MakeThread();
        makeThread.run();

        MakeThread2 makeThread2 = new MakeThread2();
        makeThread2.run();
    }
}
