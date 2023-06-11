package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        //context로 부터 Bean을 꺼냄(name: "member", MemberDTO.class <- 요기에서)
        MemberDTO member = context.getBean("member", MemberDTO.class);

        System.out.println(member);
        //result : MemberDTO(sequence=1, id=user01, pwd=pass01, name=홍길동)
    }
}
