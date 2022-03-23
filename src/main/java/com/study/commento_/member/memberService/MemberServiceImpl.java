package com.study.commento_.member.memberService;

import com.study.commento_.member.memberDao.MemberRepository;
import com.study.commento_.member.memberDto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(MemberDto memberDto) {
        this.memberRepository.save(memberDto);
    }

    @Override
    public MemberDto findById(String memberId) {
        return memberRepository.findById(memberId);
    }

    @Override
    public MemberDto findByNo(Long memberNo) {
        return memberRepository.findByNo(memberNo);
    }

    @Override
    public List<MemberDto> findAllMembers() {
        return memberRepository.findAllMembers();
    }

    @Override
    public MemberDto updateMember(MemberDto memberDto) {
        return memberRepository.updateMember(memberDto);
    }

    @Override
    public void deleteMember(MemberDto memberDto) {
        memberRepository.deleteMember(memberDto);
    }
}
