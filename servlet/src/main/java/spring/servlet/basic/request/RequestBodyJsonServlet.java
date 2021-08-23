package spring.servlet.basic.request;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.StreamUtils;
import spring.servlet.basic.HelloData;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name="RequestBodyJsonServlet", urlPatterns="/request-body-json")
public class RequestBodyJsonServlet extends HttpServlet {

    //스프링 라이브러리 JAKSON 제공
    private ObjectMapper objectMapper= new ObjectMapper();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //메시지 바디 내용을 바이트 코드로 얻을 수 있다.
        ServletInputStream inputStream=request.getInputStream();
        //바이트 코드를 String 으로 변환
        //Spring에서 제공하는 유틸 사용
        //항상 바이트를 문자로 변환할 때는 인코딩 정보를 알려줘야 한다. 반대도 마찬가지
        String messageBody= StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
        System.out.println("messageBody = "+ messageBody);

        //json 형태 문자열을 객체로 변환
        HelloData helloData= objectMapper.readValue(messageBody, HelloData.class);

        System.out.println("helloData.username = " + helloData.getUsername());
        System.out.println("helloData.username = " + helloData.getAge());
        response.getWriter().write("ok");
    }


}
