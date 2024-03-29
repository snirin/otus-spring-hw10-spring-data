package ru.otus.spring.hw10.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.spring.hw10.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBook_Id(long bookId);

}
