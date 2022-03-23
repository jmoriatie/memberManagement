package com.study.commento_.member.memberDao;

import com.study.commento_.member.memberDto.Department;
import com.study.commento_.member.memberDto.MemberDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, MemberDto> storage;

    public MemoryMemberRepository(){
        storage = new HashMap();
        storage.put(1L, new MemberDto(1L, Department.ONEDEPT, "t1", "t1"));
        storage.put(2L, new MemberDto(2L, Department.TWODEPT, "t2", "t2"));
        storage.put(3L, new MemberDto(3L, Department.THREEDEPT, "t3", "t3"));
        storage.put(4L, new MemberDto(4L, Department.TWODEPT, "t4", "t4"));
        storage.put(5L, new MemberDto(5L, Department.THREEDEPT, "t5", "t5"));
    }

    public void save(MemberDto memberDto){
        if(this.findById( memberDto.getMemberId() ) == null){
            MemberDto newMember = new MemberDto(memberDto.getMemberNo(), memberDto.getDepartment(), memberDto.getMemberId(), memberDto.getMemberPw());
            storage.put(memberDto.getMemberNo(), memberDto);
        }
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

    @Override
    public List<MemberDto> findAllMembers() {
        return new ArrayList<MemberDto>(storage.values());
    }

    @Override
    public MemberDto updateMember(MemberDto memberDto) {
        MemberDto findMember = storage.get(memberDto.getMemberNo());
        findMember.setDepartment(memberDto.getDepartment());
        findMember.setMemberPw(memberDto.getMemberPw());
        return findMember;
    }

    @Override
    public void deleteMember(MemberDto memberDto) {
        storage.remove(memberDto.getMemberNo());
    }


}
