package org.pattern.abstractfactory;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author TR
 * @Date 2020/5/12 16:21
 **/
public class Test {
    public static void main(String[] args) {
        AbstractFactory nameFactory = FactoryProducer.getFactory("NAME");
        AbstractFactory numberFactory = FactoryProducer.getFactory("NUMBER");
        Barcelona name1 = nameFactory.getName("Messi");
        name1.footBall();
        Barcelona name2 = nameFactory.getName("Suarez");
        name2.footBall();
        Barcelona name3 = nameFactory.getName("PiQue");
        name3.footBall();

        Number number1 = numberFactory.getNumber("10");
        number1.uniformNumber();
        Number number2 = numberFactory.getNumber("9");
        number2.uniformNumber();
        Number number3 = numberFactory.getNumber("3");
        number3.uniformNumber();


    }
}
