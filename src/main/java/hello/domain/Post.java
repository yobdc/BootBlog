package hello.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Created by lex on 2016/3/16.
 */
@Getter
@Setter
@Entity
public class Post extends BaseEntity {
    private Long id;
    private String title;
    private String content;
}
