package com.study.commento_.member;

import com.study.commento_.config.MemberConfig;
import com.study.commento_.member.memberDao.MemberRepository;
import com.study.commento_.member.memberDao.MemoryMemberRepository;
import com.study.commento_.member.memberDto.Department;
import com.study.commento_.member.memberDto.MemberDto;
import com.study.commento_.member.memberService.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
}
