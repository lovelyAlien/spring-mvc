package inflearn.singletonpattern;

import static inflearn.singletonpattern.Settings.settings;

public class FirstPage {
    private Settings settings= Settings.getInstance();


    public void setAndPrintSettings(){
        //다크모드 on
        settings.setDarkMode(true);
        System.out.println("firstPage.setAndPrintSettings");
        System.out.println("settings.getDarkMode= "+ settings.getDarkMode());
        System.out.println("System.out.println(settings)= "+ settings);
    }
}