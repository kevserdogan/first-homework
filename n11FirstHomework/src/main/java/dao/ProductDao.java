package dao;

import base.BaseDao;
import dto.CommentCountInfoDto;
import entity.ProductEntity;
import org.hibernate.query.Query;

import java.util.List;

public class ProductDao  extends BaseDao  {


    public List<ProductEntity> findAll()
    {
String q="select product from ProductEntity product";
        Query query= getCurrentSession().createQuery(q);
        if(query.list().size()>0)
        {
            return query.list();
        }

        return null;

    }

    public BaseDao findById(long Id) {

        Query query= getCurrentSession().createQuery("select product from ProductEntity product where productId="+Id);
        return (BaseDao) query.getSingleResult();
    }

    public List<CommentCountInfoDto> calculateProductsCommentCount()
    {

        Query query=getCurrentSession().createQuery("select new dto.CommentCountInfoDto(product.productId,product.productName,product.price,count(pe.comment)) "+" from " +
                                                     "ProductCommentEntity pe  join " +
                                                     "ProductEntity product on pe.productId.productId=product.productId " +
                                                     " where pe.comment is not null group by product.productId,product.productName,product.price");
        try {
            return   query.list();
           /// if (returnList.size() > 0) {
             //   return returnList;
         //   }
        }catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
        return null;
    }
    public boolean add(BaseDao baseDao) {
        return false;
    }

    public boolean update(BaseDao baseDao) {
        return false;
    }
}