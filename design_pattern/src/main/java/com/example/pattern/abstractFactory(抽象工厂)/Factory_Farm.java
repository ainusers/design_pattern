/**
 * @author: tianyong
 * @date: 2019/11/15 10:37
 * @desciption:抽象工厂 (农场)
 */
public interface Factory_Farm {


    /**
      * @author: tianyong
      * @date: 2019/11/15
      * @description:工厂的功能职责(动物/植物)
    */
    Animal AnimalObject();
    Plant PlantObject();

}
