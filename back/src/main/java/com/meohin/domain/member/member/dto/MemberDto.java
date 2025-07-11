package com.meohin.domain.member.member.dto;

import com.meohin.domain.member.member.entity.Member;

import java.time.LocalDateTime;

public record MemberDto(
        int id,
        LocalDateTime createDate,
        LocalDateTime modifyDate,
        String name
) {
    public MemberDto(int id, LocalDateTime createDate, LocalDateTime modifyDate, String name) {
        this.id = id;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.name = name;
    }

    public MemberDto(Member member) {
        this(
                member.getId(),
                member.getCreateDate(),
                member.getModifyDate(),
                member.getName()
        );
    }
}