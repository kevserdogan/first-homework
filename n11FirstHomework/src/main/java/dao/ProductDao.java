package dao;

import base.BaseDao;
import dto.CommentCountInfoDto;
import dto.ProductCommentDto;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class ProductDao  extends BaseDao  {

    public List<BaseDao> findAll()
    {
        Session session=sessionFactory.openSession();
        Query query= session.createQuery("select product from ProductEntity product");
        if(query.list().size()>0)
        {
            return query.list();
        }

        return new ArrayList<BaseDao>();

    }

    public BaseDao findById(long Id) {
        Session session=sessionFactory.openSession();
        Query query= session.createQuery("select product from ProductEntity product where productId="+Id);
        return (BaseDao) query.getSingleResult();
    }

    public List<CommentCountInfoDto> calculateProductsCommentCount()
    {
        Session session=sessionFactory.openSession();
        Query query= session.createQuery("select new dto.CommentCountInfoDto(product.productId,product.productName,product.price,count(pe.comment)) "+" from " +
                                                     "ProductEntity product join " +
                                                     "ProductCommentEntity pe on product.productId=pe.productId" +
                                                     " where pe.comment is not null group by product.productId,product.productName,product.price");
        try {
            List<CommentCountInfoDto> returnList = (List<CommentCountInfoDto>) query.list();
            if (returnList.size() > 0) {
                return returnList;
            }
        }catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
        return new ArrayList<CommentCountInfoDto>();
    }
    public boolean add(BaseDao baseDao) {
        return false;
    }

    public boolean update(BaseDao baseDao) {
        return false;
    }
}