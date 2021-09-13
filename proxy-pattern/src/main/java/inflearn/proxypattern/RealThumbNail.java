package inflearn.proxypattern;

public class RealThumbNail implements ThumbNail {
    private String title;
    private String movieUrl;


    public RealThumbNail(String _title, String _movieUrl){
        title=_title;
        movieUrl=_movieUrl;

    }

    public void showTitle(){
        System.out.println("제목: "+ title);
    }
    public void showPreview(){
        System.out.println("재생: "+ movieUrl);
    }

}
