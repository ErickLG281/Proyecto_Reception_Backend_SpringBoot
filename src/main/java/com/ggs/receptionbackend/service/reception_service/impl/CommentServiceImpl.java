package com.ggs.receptionbackend.service.reception_service.impl;

import com.ggs.receptionbackend.entity.reception_information.Comment;
import com.ggs.receptionbackend.repository.reception_repository.CommentRepository;
import com.ggs.receptionbackend.service.reception_service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment searchCommentById(Long id) {
        return commentRepository.findById(id).orElse(null);
    }

    @Override
    public Comment createComment(Comment comment) {
       comment.setDescription(comment.getDescription());
       comment.setDate(comment.getDate());
       comment.setRecommended(comment.isRecommended());
       comment.setQualityService(comment.getQualityService());
       comment.setResponseTime(comment.getResponseTime());
       comment.setProfessionalism(comment.getProfessionalism());
       comment.setProfessionalism(comment.getProfessionalism());
       comment.setQualityPrice(comment.getQualityPrice());
       comment.setFlexibility(comment.getFlexibility());
        return commentRepository.save(comment);
    }

    @Override
    public Comment updateComment(Long id, Comment comment) {
        Comment newComment = commentRepository.findById(id).orElse(null);
        if (newComment != null) {
            newComment.setDescription(newComment.getDescription());
            newComment.setDate(newComment.getDate());
            newComment.setRecommended(newComment.isRecommended());
            newComment.setQualityService(newComment.getQualityService());
            newComment.setResponseTime(newComment.getResponseTime());
            newComment.setProfessionalism(newComment.getProfessionalism());
            newComment.setProfessionalism(newComment.getProfessionalism());
            newComment.setQualityPrice(newComment.getQualityPrice());
            newComment.setFlexibility(newComment.getFlexibility());
            return commentRepository.save(newComment);
        }
        return null;
    }

    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }

    @Override
    public List<Comment> searchCommentsByReceptionId(Long receptionId) {
        return commentRepository.findByCompany_CompanyId(receptionId);
    }

    @Override
    public List<Comment> searchCommentsByClientId(Long clientId) {
        return commentRepository.findByClientClientId(clientId);
    }

}
