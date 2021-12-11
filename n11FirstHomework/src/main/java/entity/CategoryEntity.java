package entity;

import javax.persistence.*;

@Entity
@Table(name = "Category")
@SequenceGenerator(schema = "public",name = "generator", sequenceName = "category_id_seq")
public class CategoryEntity {

    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "CategoryId", nullable = false)
    private Long categoryId;

    @Column(name = "Name", nullable = false)
    private  String categoryName;

    @Column(name = "Reftraction", nullable = false)
    private int reftraction;

    @Column(name = "TopCategoryId", nullable = false)
    private int topCategoryId;

}
