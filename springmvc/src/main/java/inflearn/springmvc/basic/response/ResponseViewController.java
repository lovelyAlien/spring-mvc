package inflearn.springmvc.basic.response;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView ResponseViewV1(){
        ModelAndView mav= new ModelAndView("response/hello")
                .addObject("data", "hello");

        return mav;
    }
    //@ResponseBody가 없으면 뷰 리졸버 실행되어서 뷰를 찾고, 랜더링 한다
    @RequestMapping("/response-view-v2")
    public String ResponseViewV2(Model model){
        model.addAttribute("data", "hello");

        return "response/hello";
    }



    //명시성이 떨어진다. 권장하지 않는다.
    @RequestMapping("/response-view-v3")
    public void ResponseViewV3(Model model){

        model.addAttribute("data", "hello");
    }



}
