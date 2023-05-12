package pattern.Factory;

/*
工廠模式 - 工廠
工廠角色(Factory)：負責實現創建所有實例的內部邏輯。
 */
public class Factory {
    //使用 getProduct 獲取各個產品對象
    public Car getProduct(String productType){
        if(productType == null){
            return null;
        }
        if(productType.equalsIgnoreCase("P1")){
            return new Product1();
        } else if(productType.equalsIgnoreCase("P2")){
            return new Product2();
        }
        return null;
    }
}
