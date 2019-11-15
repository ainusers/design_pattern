import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: tianyong
 * @date: 2019/11/15 11:37
 * @desciption:鱼 子类
 */
@Setter
@Getter
@ToString
public class Animal2_Fish implements Animal2 {

    // 输出名字
    private String name;


    // 有参构造
    public Animal2_Fish(String name) {
        this.name = name;
    }

}
