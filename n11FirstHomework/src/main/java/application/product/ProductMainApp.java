package application.product;

import dao.ProductCommentDao;
import dto.CommentCountInfoDto;
import dto.ProductCommentDto;
import entityService.ProductService;

import java.util.List;

public class ProductMainApp {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        List<CommentCountInfoDto> commentCount=productService.calculateProductsCommentCount();
        for (CommentCountInfoDto dto:commentCount)
        {
            System.out.println("Id "+dto.getProductId()+" Ürün Adı:"+dto.getProductName()+" Fiyatı "+dto.getPrice()+" Yorum sayısı: "+dto.getCommentCount());
        }
    }



}
