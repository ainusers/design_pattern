/**
 * @author: tianyong
 * @date: 2019/11/14 13:45
 * @desciption:测试适配器
 */
public class Adapter_Test {

    public static void main(String [] args){
        // 测试适配器
        new Target_Adapter(new Adapter()).targetPrint();
    }

}
