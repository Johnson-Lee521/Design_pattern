package org.pattern.abstractfactory;

/**
 * @ClassName AbstractFactory
 * @Description: 为巴萨和球衣创建抽象工厂
 * @Author TR
 * @Date 2020/5/12 16:05
 **/
public abstract class AbstractFactory {
    public abstract Barcelona getName(String name);
    public abstract Number getNumber(String number);
}
