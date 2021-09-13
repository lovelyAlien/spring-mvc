package inflearn.proxypattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class ProxyPatternApplication {

    public static void main(String[] args) {
        ArrayList<ThumbNail> thumbNails= new ArrayList<ThumbNail>();

        thumbNails.add(new ProxyThumbNail("Git 강좌", "/git.mp4"));
        thumbNails.add(new ProxyThumbNail("REST API란?", "/rest-api.mp4"));
        thumbNails.add(new ProxyThumbNail("도커 사용법", "/docker.mp4"));
        thumbNails.add(new ProxyThumbNail("객체 지향 프로그래밍", "/oodp.mp4"));

        for(ThumbNail thumNail: thumbNails){
            thumNail.showTitle();
        }

        System.out.println();

        //ProxyThumbNail instance
        thumbNails.get(2).showPreview();
        thumbNails.get(2).showPreview();
        thumbNails.get(3).showPreview();
        thumbNails.get(1).showPreview();

    }

}
