/**
 * @author: tianyong
 * @date: 2019/11/15 10:45
 * @desciption:具体工厂类 (日本农场)
 */
public class Factory_Japan_Farm implements Factory_Farm{


    /**
      * @author: tianyong
      * @date: 2019/11/15
      * @description:日本农场功能职责(小奶猪、草)
    */
    @Override
    public Animal AnimalObject() {
        return new Animal_Pig("日本   小奶猪....");
    }

    @Override
    public Plant PlantObject() {
        return new Plant_Grass("日本   草....");
    }


}
