package dto;

public class CommentCountInfoDto {

    private long productId;
    private  String productName;
    private double price;
    private long commentCount;

    public CommentCountInfoDto(long productId, String productName, double price, long commentCount) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.commentCount = commentCount;
    }

    public CommentCountInfoDto() {
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(long commentCount) {
        this.commentCount = commentCount;
    }
}
