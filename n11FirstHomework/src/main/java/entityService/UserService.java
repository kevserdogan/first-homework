package entityService;

import dao.UserDao;
import dto.UserDto;

import java.util.List;

public class UserService {

    public List<UserDto> findUserComment(long userId)
    {
        UserDao userDao = new UserDao();
        List<UserDto> userDtoList = userDao.findUserComment(userId);
        return userDtoList;
    }
}
