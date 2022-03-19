package com.study.commento_.member.memberDao;

import com.study.commento_.member.memberDto.MemberDto;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {
    void save(MemberDto memberDto);
    MemberDto findByNo(Long memberNo);
    MemberDto findById(String memberId);
}
