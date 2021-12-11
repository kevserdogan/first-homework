package entityService;

import dao.CategoryDao;
import dto.CategoryDto;
import entity.CategoryEntity;

import java.util.List;

public class CategoryService {

    public List<CategoryEntity> findAll()
    {
        CategoryDao categoryDao = new CategoryDao();
        return categoryDao.findAll();
    }
}
