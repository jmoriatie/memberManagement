package com.study.commento_.member.memberDao;

import com.study.commento_.member.memberDto.MemberDto;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, MemberDto> storage = new HashMap();

    public void save(MemberDto memberDto){
        storage.put(memberDto.getMemberNo(), memberDto);
    }

    public MemberDto findByNo(Long memberNo){
        return storage.get(memberNo);
    }

    public MemberDto findById(String memberId){
        Long memberNo = null;

        for(MemberDto memberDto : storage.values()){
            if(memberDto.getMemberId().equals(memberId)){
                memberNo = memberDto.getMemberNo();
            }
        }
        return findByNo(memberNo);
    }


}
