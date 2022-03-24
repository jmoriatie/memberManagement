package com.study.commento_.member.memberDao;

import com.study.commento_.member.memberDto.MemberDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MemberRepository {
    void save(MemberDto memberDto);
    MemberDto findByNo(Long memberNo);
    MemberDto findById(String memberId);
    List<MemberDto> findAllMembers();
    MemberDto updateMember(String id, MemberDto memberDto);
    void deleteMember(String id);
}
