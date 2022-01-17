package ac.kr.smu.JUDA;

import ac.kr.smu.JUDA.board.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@EnableConfigurationProperties({FileStorageProperties.class})
@ComponentScan(basePackages = {"ac.kr.smu.JUDA.board.service.BoardService"})
@SpringBootApplication()
public class JudaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JudaApplication.class, args);
	}

}
