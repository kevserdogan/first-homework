package application.product;

import dao.ProductCommentDao;
import dao.ProductDao;
import dto.CommentCountInfoDto;
import dto.ProductCommentDto;
import entity.ProductEntity;
import entityService.ProductService;

import java.util.List;

public class ProductMainApp {
    public static void main(String[] args) {
        ProductDao dao = new ProductDao();
        List<ProductEntity> daoList = dao.findAll();
        for (ProductEntity dto:daoList)
        {
            System.out.println("ürün");
        }

        ProductService productService = new ProductService();
        List<CommentCountInfoDto> commentCount=productService.calculateProductsCommentCount();
        for (CommentCountInfoDto dto:commentCount)
        {
            System.out.println("Id "+dto.getProductId()+" Ürün Adı:"+dto.getProductName()+" Fiyatı "+dto.getPrice()+" Yorum sayısı: "+dto.getCommentCount());
        }
    }



}
