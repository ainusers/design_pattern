/**
 * @author: tianyong
 * @date: 2019/11/15 11:03
 * @desciption:工厂测试类
 */
public class Factory_Test {

    public static void main(String args[]){

        //Animal_Dog(name=中国   中华田园犬....)
        System.out.println(new Factory_China_Farm().AnimalObject());
        //Plant_Tomato(name=中国   西红柿....)
        System.out.println(new Factory_China_Farm().PlantObject());
        //Animal_Pig(name=日本   小奶猪....)
        System.out.println(new Factory_Japan_Farm().AnimalObject());
        //Plant_Grass(name=日本   草....)
        System.out.println(new Factory_Japan_Farm().PlantObject());

    }

}
