package org.pattern.proxy;

/**
 * @ClassName Broker
 * @Description: 定义一个经纪人
 * @Author TR
 * @Date 2020/5/13 15:20
 **/
public class Broker implements FootballStar{

    private FootballStar footballStar;

    /**
     * 只要符合条件,他可以是任何一个足球巨星的经纪人
     * @param footballStar
     */
    public Broker(FootballStar footballStar) {
        this.footballStar=footballStar;
    }

    @Override
    public void publicBenefitActivities() {
        this.footballStar.publicBenefitActivities();//我只是经纪人我接到公益活动,让球星去参加
    }

    @Override
    public void endorsement() {
        this.footballStar.endorsement();//接到商业广告

    }
}
