package application;
import dao.CategoryDao;
import dao.ProductCommentDao;
import dto.CategoryDto;
import dto.ProductCommentDto;
import entity.CategoryEntity;
import entityService.CategoryService;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        ProductCommentDao productCommentDao= new ProductCommentDao() ;
        List<ProductCommentDto> categoryDaoList=productCommentDao.findProductCommentByProductId(2L);
        for (ProductCommentDto dto:categoryDaoList)
        {
            System.out.println("Yorum "+dto.getComment()+" Kullanıcı Adı:"+dto.getUserName()+" "+dto.getUserLastName()+" Ürün Adı: "+dto.getProductName());
        }
    }
}
