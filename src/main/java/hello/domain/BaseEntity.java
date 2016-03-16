package hello.domain;

import lombok.Data;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by lex on 2016/3/16.
 */
@Data
public class BaseEntity implements Serializable {
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;
    private Long createdByUserId;
    private String createdByUsername;
    private Long updatedByUserId;
    private String updatedByUsername;
}
