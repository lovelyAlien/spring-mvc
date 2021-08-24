package spring.servlet.web.frontcontroller.v1.controller;

import spring.servlet.domain.member.Member;
import spring.servlet.domain.member.MemberRepository;
import spring.servlet.web.frontcontroller.v1.ControllerV1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberSaveControllerV1 implements ControllerV1{

    MemberRepository memberRepository= MemberRepository.getInstance();

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        int age=Integer.parseInt(request.getParameter("age"));

        Member member= new Member(username, age);

        memberRepository.save(member);

        request.setAttribute("member", member);

        String viewPath="/WEB-INF/views/save-result.jsp";

        RequestDispatcher dispatcher=request.getRequestDispatcher(viewPath);

        //다른 서블릿이나 JSP로 이동할 수 있는 기능이다. 서버 내부에서 다시 호출이 발생한다.
        dispatcher.forward(request, response);

    }

}
