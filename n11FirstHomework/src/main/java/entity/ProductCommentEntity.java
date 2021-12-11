package entity;

import dto.ProductCommentDto;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "ProductComment")
@SequenceGenerator(schema = "public",name = "generator", sequenceName = "productcomment_id_seq")
public class ProductCommentEntity {

    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "CommentId", nullable = false)
    private long commentId;
    @Column(name = "Comment", nullable = false)
    private String comment;
    @Column(name = "CommentDate", nullable = false)
    private LocalDateTime commentDate;
    @Column(name = "ProductId", nullable = false)
    private long productId;
    @Column(name = "UserId", nullable = false)
    private long userId;
    @Column(name = "Point", nullable = false)
    private int productPoint;

}
