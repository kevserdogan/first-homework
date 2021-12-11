package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "User",schema = "public")
@SequenceGenerator(schema = "public",name = "generator", sequenceName = "user_id_seq")
public class UserEntity {


    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "UserId", nullable = false)
    private long userId;
    @Column(name = "Name", nullable = false)
    private String userName;
    @Column(name = "LastName", nullable = false)
    private String lastName;
    @Column(name = "Mail", nullable = false)
    private String userMailAddress;
    @Column(name = "PhoneNumber", nullable = false)
    private String userPhone;
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordDate;
}
