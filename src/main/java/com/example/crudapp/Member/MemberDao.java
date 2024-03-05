package com.example.crudapp.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<MemberPojo> findAll() {
        String sql = "SELECT * FROM members";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
            new MemberPojo(
                    rs.getLong("id"),
                    rs.getString("name"),
                    rs.getString("address"),
                    rs.getString("handphone"),
                    rs.getString("gender")
            ));
     }

     public MemberPojo findById(Long id) {
        String sql = "SELECT * FROM members where id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
             new MemberPojo(
                     rs.getLong("id"),
                     rs.getString("name"),
                     rs.getString("address"),
                     rs.getString("handphone"),
                     rs.getString("gender")
             ));
     }

     public void save(MemberPojo member) {
         String sql = "INSERT INTO members (name, address, handphone, gender) VALUES (?, ?, ?, ?)";
         jdbcTemplate.update(sql, member.getName(), member.getAddress(), member.getPhone_number(), member.getGender());
     }

     public void update(MemberPojo member) {
        String sql = "UPDATE INTO members SET name = ? , address = ? , handphone = ?, gender = ? WHERE id = ? ";
        jdbcTemplate.update(sql, member.getName(), member.getAddress(), member.getPhone_number(), member.getGender(), member.getId());
     }

     public void delete(Long id) {
        String sql = "DELETE FROM members WHERE id = ?";
        jdbcTemplate.update(sql, id);
     }
}
