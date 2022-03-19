package com.study.commento_.member.memberService;

import com.study.commento_.member.memberDto.MemberDto;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {

    void join(MemberDto memberDto);
    MemberDto findById(String memberId);
    MemberDto findByNo(Long memberNo);
}
