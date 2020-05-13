package org.pattern.factory;

/**
 * @ClassName Test
 * @Description: 使用BarcelonaFactory工厂
 * @Author TR
 * @Date 2020/5/12 14:44
 **/
public class Test {
    public static void main(String[] args) {
        BarcelonaFactory barcelonaFactory = new BarcelonaFactory();
        Barcelona messi = barcelonaFactory.getName("Messi");
        messi.playFootBall();
        Barcelona suarez = barcelonaFactory.getName("Suarez");
        suarez.playFootBall();
        Barcelona piQue = barcelonaFactory.getName("PiQue");
        piQue.playFootBall();

    }

}
