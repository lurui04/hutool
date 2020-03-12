package cn.hutool.desgin.factory;

/**
 * @author lurui04
 * @Package cn.hutool.desgin.factory
 * @ClassName PrAnimal
 * @Description TODO 类描述
 * @Date 2020/3/12 17:28
 */
public class PrAnimal extends Animal {
    @Override
    public void run() {
        System.out.println("PrAnimal run");
    }

    @Override
    public void eat() {
        System.out.println("PrAnimal eat");
    }
}
