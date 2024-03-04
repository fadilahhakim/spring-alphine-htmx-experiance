package com.example.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberDao memberDao;

    public List<MemberPojo> findAll() {
        return memberDao.findAll();
    }

    public MemberPojo findById(Long id) {
        return memberDao.findById(id);
    }

    public void save(MemberDto req) {
        MemberPojo memberPojo = new MemberPojo();
        memberPojo.setName(req.name());
        memberPojo.setAddress(req.address());
        memberPojo.setPhone_number(req.phone_number());
        memberDao.save(memberPojo);
    }
    public void update(MemberPojo member) {
        memberDao.update(member);
    }

    public void delete(Long id) {
        memberDao.delete(id);
    }
}
