package org.pattern.singleton;

/**
 * @ClassName TestSingleton
 * @Description: 从CampNou类中获取球场,巴萨的球员在诺坎普踢球只需要进入球场就行,无需每一个球员都创建出一个诺坎普球场
 * 梅西,苏亚雷斯,布斯克茨,都在巴塞罗那效力,他们天天在诺坎普球场训练,
 * 如果出现在伯纳乌球场训练,那就出问题了
 * @Author TR
 * @Date 2020/5/13 12:42
 **/
public class TestSingleton {
    public static void main(String[] args) {
        //梅西
        CampNou messi = CampNou.getInstance();
        messi.campNouInfo();
        //苏亚雷斯
        CampNou suarez = CampNou.getInstance();
        suarez.campNouInfo();
        //布斯克茨
        CampNou busquets = CampNou.getInstance();
        busquets.campNouInfo();
        //三人都在同一个球训练

    }
}
