package cn.hutool.desgin.factory;

/**
 * @author lurui04
 * @Package cn.hutool.desgin.factory
 * @ClassName HyAnimal
 * @Description TODO 类描述
 * @Date 2020/3/12 17:29
 */
public class HyAnimal extends Animal {
    @Override
    public void run() {
        System.out.println("HyAnimal run");
    }

    @Override
    public void eat() {
        System.out.println("HyAnimal eat");
    }
}
