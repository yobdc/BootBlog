package hello.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by lex on 2016/3/16.
 */
@Getter
@Setter
@Entity
public class Post extends BaseEntity {
    private String title;
    private String content;
}
