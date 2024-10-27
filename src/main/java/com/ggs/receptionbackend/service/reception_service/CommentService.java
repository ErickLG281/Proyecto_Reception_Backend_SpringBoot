package com.ggs.receptionbackend.service.reception_service;

import com.ggs.receptionbackend.entity.reception_information.Comment;

import java.util.List;

public interface CommentService {
    Comment searchCommentById(Long id);
    Comment createComment(Comment comment);
    Comment updateComment(Long id, Comment comment);
    void deleteComment(Long id);

    List<Comment> searchCommentsByReceptionId(Long receptionId);

    List<Comment> searchCommentsByClientId(Long clientId);
}
