package com.study.commento_.member;

import com.study.commento_.member.dateInterface.DateSet;
import com.study.commento_.member.dateInterface.DateSetImpl;
import com.study.commento_.member.memberDao.MemberRepository;
import com.study.commento_.member.memberDao.MemoryMemberRepository;
import com.study.commento_.member.memberService.MemberService;
import com.study.commento_.member.memberService.MemberServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberConfig {
    
    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DateSet dateSet(){
        return new DateSetImpl();
    }
}
