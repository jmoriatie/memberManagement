package com.study.commento_.member;

import com.study.commento_.member.memberDto.Department;
import com.study.commento_.member.memberDto.MemberDto;
import com.study.commento_.member.memberService.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;


public class MemberTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach(){
        MemberConfig memberConfig = new MemberConfig();
        memberService = memberConfig.memberService();
    }

    @DisplayName("MemberJoin, find 테스트")
    @Test
    void joinTest(){
        MemberDto testMember = new MemberDto(1L, Department.ONEDEPT, "testId", "testPw");

        memberService.join(testMember);
        MemberDto findMember = memberService.findByNo(1L);

        assertThat(testMember).isEqualTo(findMember);
    }

    @DisplayName("find 테스트")
    @Test
    void findMemberTest(){
        MemberDto findMember = memberService.findByNo(1L);
        assertThat(findMember.getMemberNo()).isEqualTo(1L);
    }

}
