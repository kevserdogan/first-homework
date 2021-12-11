package application.user;

import dto.CommentCountInfoDto;
import dto.UserDto;
import entityService.ProductService;
import entityService.UserService;

import java.util.List;

public class UserApplication {
    public static void main(String[] args) {
        UserService userService = new UserService();
        List<UserDto> userDtoList=userService.findUserComment(3L);
        for (UserDto dto:userDtoList)
        {
            System.out.println("Id "+dto.getUserId()+" Ürün Adı:"+dto.getProductName()+" Yorum "+dto.getComment()+" Kullanıcı adı: "+dto.getUserName());
        }
    }
}
