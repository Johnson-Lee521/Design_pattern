package org.pattern.factory;

/**
 * @ClassName Messi
 * @Description: 梅老板在巴萨踢球
 * @Author TR
 * @Date 2020/5/12 14:32
 **/
public class Messi implements Barcelona{
    @Override
    public void playFootBall() {
        System.out.println("Messi在诺坎普球场训练");
    }
}
