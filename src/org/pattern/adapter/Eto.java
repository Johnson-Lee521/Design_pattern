package org.pattern.adapter;

/**
 * @ClassName Eto
 * @Description:
 *     1997年埃托奥初到西班牙不会西班牙语,不能进行正常的交流
 * @Author TR
 * @Date 2020/6/2 9:45
 **/
public class Eto {
    private English english;

    Eto(English english){
        this.english=english;
    }

    public void speakLanguage(){
        english.speakEnglish();
    }
    public static void main(String[] args) {
        Spanish spanish = new Spanish();
        LanguageAdapter languageAdapter = new LanguageAdapter(spanish);
        Eto eto = new Eto(languageAdapter);
        eto.speakLanguage();
    }
}
