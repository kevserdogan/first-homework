package dto;

import java.time.LocalDateTime;
import java.util.Date;

public class ProductCommentDto {


    public ProductCommentDto(String userName, String categoryName, double price, String productName, String userLastName, String userMail, String userPhone, String comment, LocalDateTime commentDate) {
        this.userName = userName;
        this.categoryName = categoryName;
        this.price = price;
        this.productName = productName;
        this.userLastName = userLastName;
        this.userMail = userMail;
        this.userPhone = userPhone;
        this.comment = comment;
        this.commentDate = commentDate;
    }

    private String userName;
    private String categoryName;
    private double price;
    private String productName;
    private String userLastName;
    private String userMail;
    private String userPhone;
    private String comment;
    private LocalDateTime commentDate;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
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
}
