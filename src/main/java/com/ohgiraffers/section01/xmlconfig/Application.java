package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.lang.reflect.Member;

public class Application {
    public static void main(String[] args) {
        //xml파일에 등록해둔 정보 가져오기

        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");
        /* 예시 1 */
        MemberDTO member1 = (MemberDTO) context.getBean("member");
        System.out.println(member1);
        //result : MemberDTO(sequence=1, id=user01, pwd=pass01, name=홍길동)

        /* 예시 2 */
        MemberDTO member2 = context.getBean(MemberDTO.class); //다운캐스팅 해줄 필요 없음
        System.out.println(member2);
        //result : MemberDTO(sequence=1, id=user01, pwd=pass01, name=홍길동)

        /* 예시 3 */
        MemberDTO member3 = context.getBean("member", MemberDTO.class);
        System.out.println(member3);
        //result : MemberDTO(sequence=1, id=user01, pwd=pass01, name=홍길동)
    }
}
