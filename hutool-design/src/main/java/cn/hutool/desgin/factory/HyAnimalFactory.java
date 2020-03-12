package cn.hutool.desgin.factory;

/**
 * @author lurui04
 * @Package cn.hutool.desgin.factory
 * @ClassName HyAnimalFactory
 * @Description TODO 类描述
 * @Date 2020/3/12 17:53
 */
public class HyAnimalFactory implements IAnimalFactory {
    @Override
    public Animal creatAnimal() {
        return new HyAnimal();
    }
}
