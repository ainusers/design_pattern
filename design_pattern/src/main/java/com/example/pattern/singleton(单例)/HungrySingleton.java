/**
 * @author: tianyong
 * @date: 2019/11/14 16:50
 * @desciption:饿汉式单例模式
 */
public class HungrySingleton {


    // 私有构造
    private HungrySingleton(){}
    // 声明对象实例
    private static final HungrySingleton instance=new HungrySingleton();


    /**
      * @author: tianyong
      * @date: 2019/11/14
      * @description:饿汉式 (默认线程是安全的)
    */
    public static HungrySingleton getInstance(){
        return instance;
    }

}
