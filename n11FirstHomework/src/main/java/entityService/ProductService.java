package entityService;



import dao.ProductDao;
import dto.CommentCountInfoDto;

import java.util.List;

public class ProductService {
    public List<CommentCountInfoDto> calculateProductsCommentCount()
    {
        ProductDao categoryDao = new ProductDao();
        return categoryDao.calculateProductsCommentCount();
    }
}
