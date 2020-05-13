package org.pattern.abstractfactory;

/**
 * @ClassName FactoryProducer
 * @Description: 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂
 * @Author TR
 * @Date 2020/5/12 16:15
 **/
public class FactoryProducer {
    public static AbstractFactory getFactory(String data){
        if (data.equals("NAME")) {
            return new BarcelonaFactory();
        } else if (data.equals("NUMBER")) {
            return new NumberFactory();
        }
        return null;
    }
}
