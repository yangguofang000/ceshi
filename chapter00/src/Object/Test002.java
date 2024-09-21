package Object;

public class Test002 {
    public static void main(String[] args) {
        // 创建实例化对象
        Test001 t1 = new Test001();

        // 调用对象方法
        t1.call();
        t1.seendMessage("Hello World!!!");
        t1.playGame();
        t1.name = "哈哈哈哈哈";
        t1.price = 20;
        System.out.print("name:"+t1.name +'\n' +"price"+ t1.price);

    }


}
