package dao;

import base.BaseDao;
import dto.CategoryDto;
import entity.CategoryEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class CategoryDao extends BaseDao{

    public List<CategoryEntity> findAll()
    {
        Session session=sessionFactory.openSession();
        Query query= session.createQuery("select category from CategoryEntity category");
        if(query.list().size()>0)
        {
            return (List<CategoryEntity>) query.list();
        }

        return new ArrayList<CategoryEntity>();

    }

    public CategoryDao findById(long Id) {
        Session session=sessionFactory.openSession();
        Query query= session.createQuery("select category from CategoryEntity category where categoryId="+Id);
            return (CategoryDao) query.getSingleResult();
    }

    public boolean add(CategoryDao baseDao) {
        return false;
    }

    public boolean update(CategoryDao baseDao) {
        return false;
    }
}
