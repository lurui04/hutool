package cn.hutool.desgin.factory;

/**
 * @author lurui04
 * @Package cn.hutool.desgin.factory
 * @ClassName AnimalMethodFactory
 * @Description TODO 类描述
 * @Date 2020/3/12 17:45
 */
public class AnimalMethodFactory {


    public static IAnimalFactory creatFactory(String type) {
        if ("PrAnimai".equals(type)) {
            return new PrAnimalFactory();
        } else if ("HyAnimal".equals(type)) {
            return new HyAnimalFactory();
        }
        return null;
    }


}
