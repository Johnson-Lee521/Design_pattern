package org.pattern.abstractfactory;

/**
 * @ClassName BarcelonaFactory
 * @Description: TODO
 * @Author TR
 * @Date 2020/5/12 16:08
 **/
public class BarcelonaFactory extends AbstractFactory {
    @Override
    public Barcelona getName(String name) {
        if (name==null){
            return null;
        }
        if (name.equals("Messi")){
            return new Messi();
        }else if (name.equals("Suarez")){
            return new Suarez();
        }else if (name.equals("PiQue")){
            return new PiQue();
        }
        return null;
    }

    @Override
    public Number getNumber(String number) {
        return null;
    }
}
