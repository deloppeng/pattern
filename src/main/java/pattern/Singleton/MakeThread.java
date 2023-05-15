package pattern.Singleton;

public class MakeThread extends Thread{
    //覆寫Thread方法run()
    public void run(){
        System.out.println("[MakeThread]");
        for (int i=0; i<3; i++){
            //取得已創建實例對象
            SingleObject object = SingleObject.getInstance();
            object.showMessage();
        }
    }
}
