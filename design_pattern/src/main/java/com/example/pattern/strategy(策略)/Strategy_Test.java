/**
 * @author: tianyong
 * @date: 2019/11/14 9:33
 * @desciption:测试策略
 */
public class Strategy_Test {


    public static void main(String args[]){
        new Strategy_Context(new Traffic_Fly()).invokeStrategy("张三");
        new Strategy_Context(new Traffic_Train()).invokeStrategy("李四");
    }

}
