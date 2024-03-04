package com.example.crudapp;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
