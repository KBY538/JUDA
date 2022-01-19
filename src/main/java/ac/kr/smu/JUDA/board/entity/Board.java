package ac.kr.smu.JUDA.board.entity;

import ac.kr.smu.JUDA.user.entity.User;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // 게시글 식별자

    private String title; // 게시글 제목
    private String content; // 게시글 내용

    //@ManyToOne
    //private User writer; // 게시글 작성자

    //private int profit; // 수익률

   @CreatedDate
    private LocalDateTime instDtm; // 게시글 작성일
}
