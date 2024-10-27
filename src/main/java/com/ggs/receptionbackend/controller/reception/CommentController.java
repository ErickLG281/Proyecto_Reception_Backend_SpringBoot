package com.ggs.receptionbackend.controller.reception;

import com.ggs.receptionbackend.entity.reception_information.Comment;
import com.ggs.receptionbackend.service.reception_service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("comment")
public class CommentController {

    @Autowired
    private CommentService commentService;
    @GetMapping("/{receptionId}")
    public ResponseEntity<List<Comment>> searchCommentsByReceptionId(@PathVariable Long receptionId) {
        List<Comment> comments = commentService.searchCommentsByReceptionId(receptionId);
        if (comments.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(comments);
        }
    }

    @GetMapping("/{clientId}")
    public ResponseEntity<List<Comment>> searchCommentsByClientId(@PathVariable Long clientId) {
        List<Comment> comments = commentService.searchCommentsByClientId(clientId);
        if (comments.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(comments);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment) {
        Comment createdComment = commentService.createComment(comment);
        return ResponseEntity.ok(createdComment);
    }


    @PutMapping("/update/{commentId}")
    public ResponseEntity<Comment> updateComment(@PathVariable(name = "commentId") Long id, @RequestBody Comment updatedComment) {
        Comment updateComment = commentService.updateComment(id, updatedComment);
        if (updateComment != null) {
            return ResponseEntity.ok(updateComment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/update/{commentId}")
    public ResponseEntity<Void> deleteComment(@PathVariable(name = "commentId") Long id) {
        commentService.deleteComment(id);
        return ResponseEntity.noContent().build();
    }
}
