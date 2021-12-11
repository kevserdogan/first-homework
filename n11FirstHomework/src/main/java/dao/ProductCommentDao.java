package dao;

import base.BaseDao;
import dto.ProductCommentDto;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.persistence.TypedQuery;
import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ProductCommentDao extends BaseDao {


    public List<ProductCommentDto> findProductCommentByProductId(long productId)
    {
        Session session=sessionFactory.openSession();
        Query query= session.createQuery("select new dto.ProductCommentDto( user.userName," +
                                                            "category.categoryName," +
                                                            "product.price," +
                                                            "product.productName," +
                                                            "user.lastName," +
                                                            "user.userMailAddress," +
                                                            "user.userPhone," +
                                                            "productComment.comment," +
                                                            "productComment.commentDate )" +
                                                            "from ProductCommentEntity productComment left join " +
                                                                  "UserEntity user on productComment.userId=user.userId left join" +
                                                                  " ProductEntity product on product.productId=productComment.productId left join" +
                                                                  " CategoryEntity category on category.categoryId=product.categoryId " +
                                                                "where product.productId= :productId",ProductCommentDto.class);

        query.setParameter("productId",productId);
        try {
            List<ProductCommentDto> returnList = (List<ProductCommentDto>) query.list();
            if (returnList.size() > 0) {
                return returnList;
            }
        }catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
        return new ArrayList<ProductCommentDto>();

    }
}
