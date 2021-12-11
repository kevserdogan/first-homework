package dao;

import base.BaseDao;
import dto.ProductCommentDto;
import dto.UserDto;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class UserDao extends BaseDao {

    public List<UserDto> findUserComment(long userId)
    {
        Session session=sessionFactory.openSession();
        Query query= session.createQuery("select new dto.UserDto( user.userName," +
                "user.userId," +
                "product.productName," +
                "productComment.comment," +
                "productComment.commentDate )" +
                "from ProductCommentEntity productComment left join " +
                "UserEntity user on productComment.userId=user.userId left join" +
                " ProductEntity product on product.productId=productComment.productId left join" +
                " CategoryEntity category on category.categoryId=product.categoryId " +
                "where user.userId= :productId",UserDto.class);

        query.setParameter("productId",userId);
        try {
            List<UserDto> returnList = (List<UserDto>) query.list();
            if (returnList.size() > 0) {
                return returnList;
            }
        }catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
        return new ArrayList<UserDto>();

    }
}
