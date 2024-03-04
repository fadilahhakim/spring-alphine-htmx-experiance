package com.example.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping()
    public String index(){
        return "member";
    }

    @GetMapping("/list")
    public String listMembers(Model model) {
        List<MemberPojo> members = memberService.findAll();
        model.addAttribute("members", members);
        return "member-list";
    }

    @GetMapping("/edit/{id}")
    public String editMember(@PathVariable Long id, Model model) {
        MemberPojo member = memberService.findById(id);
        model.addAttribute("member",member);
        return "member-form";
    }

    @PostMapping("save")
    public String saveMember(@ModelAttribute MemberPojo member) {
         memberService.save(member);
         return "redirect:/members/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteMember(@PathVariable Long id) {
        memberService.delete(id);
        return "redirect:/members/list";
    }
}
