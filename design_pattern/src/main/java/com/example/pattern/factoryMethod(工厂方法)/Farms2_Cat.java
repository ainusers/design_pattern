/**
 * @author: tianyong
 * @date: 2019/11/15 13:59
 * @desciption:
 */
public class Farms2_Cat implements Farm2 {

    /**
     * @author: tianyong
     * @date: 2019/11/15
     * @description:动物农场功能职责（猫）
     */
    @Override
    public Animal2 AnimalObject() {
        return new Animal2_Cat("动物 猫....");
    }
}
