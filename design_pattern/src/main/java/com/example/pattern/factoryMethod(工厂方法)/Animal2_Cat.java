import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: tianyong
 * @date: 2019/11/15 11:32
 * @desciption:猫 子类
 */
@Setter
@Getter
@ToString
public class Animal2_Cat implements Animal2 {

    // 输出名字
    private String name;


    // 有参构造
    public Animal2_Cat(String name) {
        this.name = name;
    }

}
