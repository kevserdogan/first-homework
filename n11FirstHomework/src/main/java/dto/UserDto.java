package dto;

import java.time.LocalDateTime;

public class UserDto {

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(LocalDateTime commentDate) {
        this.commentDate = commentDate;
    }

    public UserDto(String userName, long userId, String productName, String comment, LocalDateTime commentDate) {
        this.userName = userName;
        this.userId = userId;
        this.productName = productName;
        this.comment = comment;
        this.commentDate = commentDate;
    }

    private long userId;
    private String productName;
    private String comment;
    private LocalDateTime commentDate;
}
