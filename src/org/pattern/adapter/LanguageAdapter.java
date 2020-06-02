package org.pattern.adapter;

/**
 * @ClassName LanguageAdapter
 * @Description: 创建一个语言适配器
 * @Author TR
 * @Date 2020/6/2 9:37
 **/
public class LanguageAdapter implements English{
    private Spanish spanish;

    LanguageAdapter(Spanish spanish){
        this.spanish=spanish;
    }
    @Override
    public void speakEnglish() {
        System.out.println("语言转换器");
        spanish.speakSpanish();
    }
}
