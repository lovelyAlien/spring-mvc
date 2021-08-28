package spring.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import spring.servlet.domain.member.Member;
import spring.servlet.domain.member.MemberRepository;
import spring.servlet.web.frontcontroller.ModelView;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;


@Controller
public class SpringMemberSaveControllerV1 {

    MemberRepository memberRepository= MemberRepository.getInstance();

    @RequestMapping("/springmvc/v1/members/save")
    public ModelAndView process(HttpServletRequest request, HttpServletResponse response){

        String username=request.getParameter("username");
        int age=Integer.parseInt(request.getParameter("age"));

        Member member= new Member(username, age);

        System.out.println("member = " + member);
        memberRepository.save(member);
        ModelAndView mv = new ModelAndView("save-result");
        mv.addObject("member", member);
        return mv;



    }

}
