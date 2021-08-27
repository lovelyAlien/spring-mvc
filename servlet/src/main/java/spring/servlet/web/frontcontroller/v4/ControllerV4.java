package spring.servlet.web.frontcontroller.v4;


import java.util.Map;

public interface ControllerV4 {

    //뷰의 이름 반환
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
