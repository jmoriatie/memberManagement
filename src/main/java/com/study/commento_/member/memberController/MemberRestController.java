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

    @GetMapping("/member/{memberId}")
    public MemberDto getMember(@PathVariable String memberId){
        return memberService.findById(memberId);
    }

    @GetMapping("/members")
    public List<MemberDto> getMembers(){
        return memberService.findAllMembers();
    }

    @PostMapping("/member")
    public void joinMember(@RequestBody MemberDto memberDto){
        memberService.join(memberDto);
    }

    @PutMapping("/member")
    public MemberDto updateMember(@RequestBody MemberDto memberDto){
        return memberService.updateMember(memberDto);
    }

    @DeleteMapping("/member")
    public void deleteMember(@RequestBody MemberDto memberDto){
        memberService.deleteMember(memberDto);
    }
}
