package entity;

import net.bytebuddy.asm.Advice;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Products")

public class ProductEntity {
    @SequenceGenerator(schema = "public",name = "generator", sequenceName = "product_id_seq")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ProductId", nullable = false)
    private long productId;
    @Column(name = "ProductName", nullable = false)
    private String productName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CategoryId",foreignKey = @ForeignKey(name = "FK_Product_categoryId"))
    private  CategoryEntity categoryId;
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

    public CategoryEntity getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(CategoryEntity categoryId) {
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
