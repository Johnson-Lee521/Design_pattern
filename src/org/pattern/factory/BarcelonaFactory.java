package org.pattern.factory;

/**
 * @ClassName BarcelonaFactory
 * @Description: 创建一个工厂，生成基于给定信息的实体类的对象
 * @Author TR
 * @Date 2020/5/12 14:38
 **/
public class BarcelonaFactory {
     //用来获取球员
    public Barcelona getName(String name) {
        if (name == null) {
            return null;
        }
        if (name.equals("Messi")) {
            return new Messi();
        } else if (name.equals("Suarez")) {
            return new Suarez();
        } else if (name.equals("PiQue")) {
            return new PiQue();
        }
        return null;
    }
}
