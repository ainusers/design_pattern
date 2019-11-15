import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: tianyong
 * @date: 2019/11/15 10:54
 * @desciption:狗 子类
 */
@Setter
@Getter
@ToString
public class Animal_Dog implements Animal {

    // 输出名字
    private String name;


    // 有参构造
    public Animal_Dog(String name) {
        this.name = name;
    }

}
