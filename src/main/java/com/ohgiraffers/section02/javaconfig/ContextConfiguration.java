package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("section02ContextConfiguration") //해당 클래스가 설정 파일이라고 알려주는 Annotation
public class ContextConfiguration {

    @Bean(name = "member")
    //Bean의 이름을 별도로 지정하고 싶은 경우, Annotation 옆에 (name = "(Bean 명칭)")으로 작성해주면 된다.
    public MemberDTO getMember() {
        //별도 지정이 없는 경우 'getMember(메소드 명칭)'가 Bean의 이름이 된다.
        return new MemberDTO(1, "user01", "pass01", "홍길동");
    }
}
