package org.pattern.proxy;

/**
 * @ClassName Messi
 * @Description: 梅老板
 * @Author TR
 * @Date 2020/5/13 15:18
 **/
public class Messi implements FootballStar{

    @Override
    public void publicBenefitActivities() {
        System.out.println("梅老板在出席公益活动");

    }

    @Override
    public void endorsement() {
        System.out.println("梅老板为XXX品牌代言");
    }
}
