/**
 * @author: tianyong
 * @date: 2019/11/15 13:52
 * @desciption:鱼 子类
 */
public class Farm2_Fish implements Farm2 {


    /**
     * @author: tianyong
     * @date: 2019/11/15
     * @description:动物农场功能职责（鱼）
     */
    @Override
    public Animal2 AnimalObject() {
        return new Animal2_Fish("动物 鱼....");
    }
}
