package ac.kr.smu.JUDA.board.controller;

import ac.kr.smu.JUDA.board.entity.Board;
import ac.kr.smu.JUDA.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    // Get 데이터 조회
    @GetMapping("/posts/{id}")
    public Board getPost(@PathVariable("id") Long id){
        return boardService.findById(id);
    }

    @GetMapping("/posts")
    public List<Board> getPostAll(){
        return boardService.findAll();
    }

    // Post 데이터 생성
    @PostMapping("/posts")
    public ResponseEntity<String> PutPost(@PathVariable("id") Long id, @RequestBody Board board){
        return new ResponseEntity<>(boardService.insert(board), HttpStatus.OK);
    }

    // Put 데이터 수정
    @PutMapping("/posts/{id}")
    public ResponseEntity<String> UpdatePost(@PathVariable("id") Long id, @RequestBody Board board){
        return new ResponseEntity<>(boardService.update(id, board), HttpStatus.OK);
    }
    // Delete 데이터 삭제
    @DeleteMapping("posts/{id}")
    public ResponseEntity<String> DeletePost(@PathVariable("id") Long id){
        return new ResponseEntity<>(boardService.delete(id), HttpStatus.OK);
    }
}
