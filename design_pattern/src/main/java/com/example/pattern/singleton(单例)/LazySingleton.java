import lombok.Synchronized;
import org.springframework.util.StringUtils;

/**
 * @author: tianyong
 * @date: 2019/11/14 16:30
 * @desciption:懒加载单例模式
 */
public class LazySingleton {


    // 私有构造
    private LazySingleton() {}
    // 声明对象实例
    private static volatile LazySingleton instance;


    /**
      * @author: tianyong
      * @date: 2019/11/14
      * @description:懒加载 (默认是线程不安全的、不过现在安全了:[增加了volatile、synchronized关键字])
    */
    public static synchronized LazySingleton getInstance(){
        if(StringUtils.isEmpty(instance)){
            instance = new LazySingleton();
        }
        return instance;
    }

}
