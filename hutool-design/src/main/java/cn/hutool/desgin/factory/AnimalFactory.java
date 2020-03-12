package cn.hutool.desgin.factory;

import java.net.StandardSocketOptions;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lurui04
 * @Package cn.hutool.desgin.factory
 * @ClassName AnimalFactory
 * @Description TODO 类描述
 * @Date 2020/3/12 17:30
 */
public class AnimalFactory {

    private static final Map<String, Animal> animalHashMap = new HashMap<>();

    /**
     *
     */
    static {
        animalHashMap.put("PrAnimal", new PrAnimal());
        animalHashMap.put("HyAnimal", new HyAnimal());
    }

    /**
     *
     * @param type
     * @return
     */
    public static Animal creatAnimal(String type) {
        if ("PrAnimal".equals(type)) {
            return new PrAnimal();
        } else if ("HyAnimal".equals(type)) {
            return new HyAnimal();
        }
        return null;
    }

    /**
     * 单例模式的简单工厂方法
     * @param type
     * @return
     */
    public static Animal creatAnimalBySingleton(String type) {
        return animalHashMap.get(type);
    }

    /**
     * 普通模式的工厂方法模式
     * @param type
     * @return
     */
    public static Animal creatAnimalByMethodFactory(String type) {
        return AnimalMethodFactory.creatFactory(type).creatAnimal();
    }
}
