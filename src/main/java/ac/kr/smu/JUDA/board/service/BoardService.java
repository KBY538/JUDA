package ac.kr.smu.JUDA.board.service;

import ac.kr.smu.JUDA.board.entity.Board;
import ac.kr.smu.JUDA.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    // 게시글 작성
    public String insert(Board board){
        boardRepository.save(board);
        return "성공적으로 작성 되었습니다!";
    }

    // 게시글 전체 조회
    public List<Board> findAll(){
        return boardRepository.findAll();
    }

    // 게시글 아이디로 찾기
    public Board findById(Long id){
        return boardRepository.findById(id).get();
    }

    // 게시글 수정
    public String update(Long id, Board board){
        Board boardTemp = boardRepository.findById(id).get();
        boardTemp.setTitle(board.getTitle());
        boardTemp.setContent(board.getContent());
        boardTemp.setInstDtm(board.getInstDtm());
        //boardTemp.setWriter(board.getWriter());
        boardRepository.save(boardTemp);
        return "성공적으로 수정 되었습니다!";
    }

    // 게시글 삭제
    public String delete(Long id){
        boardRepository.deleteById(id);
        return "성공적으로 삭제 되었습니다!";
    }
}
