package com.ohgiraffers.section03.annotationconfig.subsection02.xml;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context
                = new GenericXmlApplicationContext("section03/annotationconfig/subsection02/xml/spring-context.xml");

        String[] beanNames = context.getBeanDefinitionNames();

        for(String beanName : beanNames) {
            System.out.println("beanName : " + beanName);
        }
        /* result:
        * beanName : memberDAO
        * beanName : section02ContextConfiguration
        * beanName : contextConfiguration
        * beanName : org.springframework.context.annotation.internalConfigurationAnnotationProcessor
        * beanName : org.springframework.context.annotation.internalAutowiredAnnotationProcessor
        * beanName : org.springframework.context.event.internalEventListenerProcessor
        * beanName : org.springframework.context.event.internalEventListenerFactory
        * beanName : member
*/
        MemberDAO memberDAO = context.getBean("memberDAO", MemberDAO.class);

        System.out.println(memberDAO.selectMember(1));
        //result : MemberDTO(sequence=1, id=user01, pwd=pass01, name=홍길동)
        
        System.out.println(memberDAO.insertMember(new MemberDTO(3, "user03", "pass03", "신사임당")));
        //result : true
    }
}
