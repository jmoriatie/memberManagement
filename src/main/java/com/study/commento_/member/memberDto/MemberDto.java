package com.study.commento_.member.memberDto;

import com.study.commento_.member.dateInterface.DateSet;
import com.study.commento_.member.dateInterface.DateSetImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class MemberDto {

    private DateSet ds;

    private long memberNo;
    private Department department;
    private String memberId;
    private String memberPw;
    private LocalDateTime created_at;

    public MemberDto(){}

    public MemberDto(Long memberNo, Department department, String memberId, String memberPw) {
        ds = new DateSetImpl();
        this.memberNo = memberNo;
        this.department = department;
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.created_at = ds.setCreatedAt();
    }

    public MemberDto(Department department, String memberId, String memberPw) {
        ds = new DateSetImpl();
        this.department = department;
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.created_at = ds.setCreatedAt();
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMemberPw() {
        return memberPw;
    }

    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    @Override
    public String toString() {
        return "[MemberDto]" +
                "\n no= " + memberNo +
                "\n department= " + department +
                "\n id= " + memberId +
                "\n pw= " + memberPw +
                "\n created_at= " + created_at;
    }

    public long getMemberNo() {
        return memberNo;
    }
}
