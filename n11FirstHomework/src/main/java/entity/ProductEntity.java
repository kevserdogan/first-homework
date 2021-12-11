package entity;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Products")
@SequenceGenerator(schema = "public",name = "generator", sequenceName = "product_id_seq")
public class ProductEntity {

    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ProductId", nullable = false)
    private long productId;
    @Column(name = "ProductName", nullable = false)
    private String productName;
    @Column(name = "CategoryId", nullable = false)
    private  long categoryId;
    @Column(name = "Price", nullable = false,precision = 18,scale = 2)
    private double price;
    @Column(name = "Quantity", nullable = false)
    private int quantity;
    @Column(name = "RecordDate", nullable = false)
    private Date recordDate;

    public void setId(Long id) {
        this.productId = id;
    }


    public Long getId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }
}
