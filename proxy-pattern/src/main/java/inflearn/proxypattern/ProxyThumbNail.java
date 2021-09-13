package inflearn.proxypattern;

public class ProxyThumbNail implements ThumbNail{

    private String title;
    private String movieUrl;

    private RealThumbNail realThumbNail;

    public ProxyThumbNail(String _title, String _movieUrl) {
        title = _title;
        movieUrl = _movieUrl;
    }

    public void showTitle() {
        System.out.println("제목: " + title);
    }

    public void showPreview() {
        if (realThumbNail == null) {
            realThumbNail = new RealThumbNail(title, movieUrl);
        }


        realThumbNail.showPreview();
    }
}
