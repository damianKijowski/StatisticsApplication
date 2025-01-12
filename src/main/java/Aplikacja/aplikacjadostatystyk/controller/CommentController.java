package Aplikacja.aplikacjadostatystyk.controller;

import Aplikacja.aplikacjadostatystyk.Entity.Comment;
import Aplikacja.aplikacjadostatystyk.Entity.CommentRequest;
import Aplikacja.aplikacjadostatystyk.Entity.CommentResponse;
import Aplikacja.aplikacjadostatystyk.Entity.Users;
import Aplikacja.aplikacjadostatystyk.repository.CommentRepository;
import Aplikacja.aplikacjadostatystyk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<Comment> addComment(@RequestBody CommentRequest commentRequest) {
        Users user = userRepository.findByEmail((commentRequest.getEmail()));

        Comment comment = new Comment(
                commentRequest.getContent(),
                commentRequest.getMatchId(),
                user,
                LocalDateTime.now()
        );
        commentRepository.save(comment);
        return ResponseEntity.ok(comment);
    }

    @GetMapping("/{matchId}")
    public ResponseEntity<List<CommentResponse>> getCommentsByMatch(@PathVariable int matchId) {
        List<Comment> comments = commentRepository.findByMatchId(matchId);

        List<CommentResponse> response = comments.stream()
                .map(comment -> new CommentResponse(
                        comment.getContent(),
                        comment.getUser().getName(),
                        comment.getCreatedAt()
                ))
                .collect(Collectors.toList());

        return ResponseEntity.ok(response);
    }
}
