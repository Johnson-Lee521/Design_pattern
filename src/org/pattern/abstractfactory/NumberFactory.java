package org.pattern.abstractfactory;

/**
 * @ClassName NumberFactory
 * @Description: TODO
 * @Author TR
 * @Date 2020/5/12 16:11
 **/
public class NumberFactory extends AbstractFactory {
    @Override
    public Barcelona getName(String name) {
        return null;
    }

    @Override
    public Number getNumber(String number) {
        if (number==null){
            return null;
        }
        if (number.equals("10")){
            return new MessiNumber();
        }else if (number.equals("9")){
            return new SuarezNumber();
        }else if (number.equals("3")){
            return new PiQueNumber();
        }
        return null;
    }
}
