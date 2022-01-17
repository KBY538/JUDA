package ac.kr.smu.JUDA.board.repository;

import ac.kr.smu.JUDA.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}