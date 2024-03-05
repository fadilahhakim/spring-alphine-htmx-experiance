package com.example.crudapp.Member;

public record MemberDto(
         Long id,
         String name,
         String address,
         String phone_number,
         String gender
)
{
}
