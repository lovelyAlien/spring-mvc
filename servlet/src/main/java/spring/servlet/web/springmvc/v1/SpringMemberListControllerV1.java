package spring.servlet.web.springmvc.v1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import spring.servlet.domain.member.Member;
import spring.servlet.domain.member.MemberRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class SpringMemberListControllerV1 {

    private MemberRepository memberRepository= MemberRepository.getInstance();


    @RequestMapping("/springmvc/v1/members")
    public ModelAndView process(){

        List<Member> members =memberRepository.findAll();
        ModelAndView mv=new ModelAndView("members");
        mv.addObject("members", members);

        return mv;


    }
}
