package hello.repository;

import hello.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lex on 2016/3/16.
 */
public interface PostRepository extends JpaRepository<Post, Long> {
}
