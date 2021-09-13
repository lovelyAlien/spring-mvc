package inflearn.singletonpattern;

public class Settings {
    private boolean darkMode=false;

    private Settings () {};

    public static Settings settings=null;

    public static Settings getInstance() {
        if (settings == null) {
            settings =  new Settings();
        }
        return settings;
    }


    public boolean getDarkMode(){
        return darkMode;
    }

    public void setDarkMode(boolean _darkMode){
       darkMode=_darkMode;
    }
}
