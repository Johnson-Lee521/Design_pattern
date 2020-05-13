package org.pattern.proxy;

/**
 * @ClassName TestProxy
 * @Description: 测试
 * @Author TR
 * @Date 2020/5/13 15:25
 **/
public class TestProxy {
    public static void main(String[] args) {
        Messi messi = new Messi();
        //找到梅老板的经纪人
        Broker broker = new Broker(messi);
        //谈公益活动的项目
        broker.publicBenefitActivities();
        //谈商业活动的项目
        broker.endorsement();

        //这里为C罗代言
        Ronaldo ronaldo = new Ronaldo();
        Broker broker1 = new Broker(ronaldo);
        broker1.publicBenefitActivities();
        broker1.endorsement();
    }
}
