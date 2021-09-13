package inflearn.singletonpattern;

public class SecondPage {
    private Settings settings= Settings.getInstance();






    public void printSettings(){

        System.out.println("secondPage.PrintSettings");
        System.out.println("settings.getDarkMode= "+ settings.getDarkMode());
        System.out.println("System.out.println(settings)= "+ settings);

    }
}
