package com.study.commento_.member.memberController;

import com.study.commento_.member.memberDto.MemberDto;
import com.study.commento_.member.memberService.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberRestController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/member/{id}")
    public MemberDto getMember(@PathVariable String id){
        return memberService.findById(id);
    }

    @GetMapping("/members")
    public List<MemberDto> getMembers(){
        return memberService.findAllMembers();
    }

    @PostMapping("/member/{id}")
    public void joinMember(@PathVariable String id, @RequestBody MemberDto memberDto){
        memberService.join(memberDto);
    }

    @PatchMapping("/member/{id}")
    public MemberDto updateMember(@PathVariable String id, @RequestBody MemberDto memberDto){
        return memberService.updateMember(id, memberDto);
    }

    @DeleteMapping("/member/{id}")
    public void deleteMember(@PathVariable String id){
        memberService.deleteMember(id);
    }
}
