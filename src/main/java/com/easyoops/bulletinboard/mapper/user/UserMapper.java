package com.easyoops.bulletinboard.mapper.user;

import com.easyoops.bulletinboard.dto.user.UserDTO;
import java.util.List;

/**
 * packageName     : com.easyoops.bulletinboard.mapper.user
 * fileName        : UserMapper
 * author          : jungwon.lee
 * date            : 2022-10-06
 * version         : v0.1
 */
public interface UserMapper {
    List<UserDTO> selectUserList(String id);
}
