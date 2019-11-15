/**
 * @author: tianyong
 * @date: 2019/11/15 14:00
 * @desciption:测试 工厂方法
 */
public class FactoryMethod_Test {

    public static void main(String []args){
        System.out.println(new Farm2_Fish().AnimalObject());
        System.out.println(new Farms2_Cat().AnimalObject());
    }
}
