/**
 * @author: tianyong
 * @date: 2019/11/15 10:40
 * @desciption:具体工厂类 (中国农场)
 */
public class Factory_China_Farm implements Factory_Farm {


    /**
      * @author: tianyong
      * @date: 2019/11/15
      * @description:中国农场功能职责(中华田园犬、西红柿)
    */
    @Override
    public Animal AnimalObject() {
        return new Animal_Dog("中国   中华田园犬....");
    }

    @Override
    public Plant PlantObject() {
        return new Plant_Tomato("中国   西红柿....");
    }


}
