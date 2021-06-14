package com.zdp.study.structure.flyweight;

/**
 * @author zdp
 * @date 2021/4/5
 * @desc 享元模式demo
 * 当项目中有大量对象的时候，享元模式非常好用，它提供了共享对象的方法来减少资源的消耗
 * 在这个例子中{@link AlchemistShop} 需要大量的{@link Potion} 对象，它通过{@link PotionFactory} 来获取potion对象。
 * {@link PotionFactory} 是享元模式的实例，它内部持有了一个potion的map，使用懒加载的方式，当需要potion对象的时候，才会去创建对象
 * 为了保证线程安全，享元模式的对象必须是不可变的，要求享元模式对象都是值对象
 */
public class FlyweightDemo {

    public static void main(String[] args) {
        AlchemistShop shop = new AlchemistShop();
        shop.enumerate();
    }
}
