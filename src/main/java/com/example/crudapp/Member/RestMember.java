package com.example.crudapp.Member;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class RestMember {

    private MemberService memberService;
    @GetMapping("/members")
    public List<MemberPojo> listMember() {
       return memberService.findAll();
    }

    @PostMapping("/member")
    public void addMember(MemberDto req) {
        memberService.save(req);
    }

    @PostMapping("/delete/member/{id}")
    public void deletedMember(@PathVariable Long id) {
        memberService.delete(id);
    }

}
