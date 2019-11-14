import lombok.Getter;
import lombok.Setter;

/**
 * @author: tianyong
 * @date: 2019/11/13 18:21
 * @desciption:上下文对象
 */
@Setter
@Getter
public class Strategy_Context {


    // 声明接口
    private Traffic traffic;


    /**
      * @author: tianyong
      * @date: 2019/11/14
      * @param:name 名字
      * @description:注：这里以有参为例，起构造赋值的作用
    */
    public Strategy_Context(Traffic traffic) {
        this.traffic = traffic;
    }


    /**
      * @author: tianyong
      * @date: 2019/11/14
      * @param:name 名字
      * @description:策略调用
    */
    public void invokeStrategy(String name){
        traffic.goHome(name);
    }


}
