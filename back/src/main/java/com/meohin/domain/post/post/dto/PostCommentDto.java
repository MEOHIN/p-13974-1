package com.meohin.domain.post.post.dto;

import com.meohin.domain.post.postComment.entity.PostComment;

import java.time.LocalDateTime;

public record PostCommentDto(
        int id,
        LocalDateTime createDate,
        LocalDateTime modifyDate,
        int authorId,
        String authorName,
        int postId,
        String content
) {
    public PostCommentDto(PostComment postComment) {
        this(
                postComment.getId(),
                postComment.getCreateDate(),
                postComment.getModifyDate(),
                postComment.getAuthor().getId(),
                postComment.getAuthor().getName(),
                postComment.getPost().getId(),
                postComment.getContent()
        );
    }
}