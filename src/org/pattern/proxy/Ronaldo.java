package org.pattern.proxy;

/**
 * @ClassName Ronaldo
 * @Description: C罗
 * @Author TR
 * @Date 2020/5/13 15:32
 **/
public class Ronaldo implements FootballStar{

    @Override
    public void publicBenefitActivities() {
        System.out.println("C罗在出席公益活动");
    }

    @Override
    public void endorsement() {
        System.out.println("C罗为XXX品牌代言");
    }
}
