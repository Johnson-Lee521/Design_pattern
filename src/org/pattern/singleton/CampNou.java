package org.pattern.singleton;

/**
 * @ClassName CampNou
 * @Description: 创建一个全局的诺坎普球场地球上仅有一个,
 *
 * @Author TR
 * @Date 2020/5/13 12:28
 **/
public class CampNou {
    /**
     * 创建 CampNou 的一个对象
     */
    private static CampNou campNou=new CampNou();
    /**
     * 让构造函数为 private，这样该类就不会被实例化,目的就是不会产生第二个诺坎普球场
     */
    private CampNou() {
    }
    /**
     * 获取唯一可用的对象
     * @return
     */
    public static CampNou getInstance(){
        return campNou;
    }
    public void campNouInfo(){
        System.out.println("在诺坎普球场训练中...");
    }


}
