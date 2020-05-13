package org.pattern.abstractfactory;

/**
 * @ClassName Messi
 * @Description: TODO
 * @Author TR
 * @Date 2020/5/12 15:58
 **/
public class Messi implements Barcelona {
    @Override
    public void footBall() {
        System.out.println("梅西在诺坎普踢球");
    }
}
