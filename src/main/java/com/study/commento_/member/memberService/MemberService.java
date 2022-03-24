package com.study.commento_.member.memberService;

import com.study.commento_.member.memberDto.MemberDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemberService {

    void join(MemberDto memberDto);
    MemberDto findById(String memberId);
    MemberDto findByNo(Long memberNo);
    List<MemberDto> findAllMembers();
    MemberDto updateMember(String id, MemberDto memberDto);
    void deleteMember(String id);
}
