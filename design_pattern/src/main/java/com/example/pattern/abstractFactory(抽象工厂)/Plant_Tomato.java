import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: tianyong
 * @date: 2019/11/15 11:00
 * @desciption:西红柿 子类
 */
@Setter
@Getter
@ToString
public class Plant_Tomato implements Plant {

    // 输出名字
    private String name;


    // 有参构造
    public Plant_Tomato(String name) {
        this.name = name;
    }

}
