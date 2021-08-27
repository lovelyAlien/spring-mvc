package spring.servlet.web.frontcontroller;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class ModelView {
    //논리적 경로
    private String viewName;
    //요청 메시지 속성
    private Map<String, Object> model=new HashMap<>();

    public ModelView(String viewName){
        this.viewName=viewName;
    }


}
