package com.example.newsfeedproject.board.repository;

import com.example.newsfeedproject.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

    Optional<List<Board>> findALLByUser_Username(String username);
}
