package com.easyoops.bulletinboard.mapper.user;

import com.easyoops.bulletinboard.dto.user.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * packageName     : com.easyoops.bulletinboard.mapper
 * fileName        : UserMapper
 * author          : jungwon.lee
 * date            : 2022-10-06
 * version         : v0.1
 */
@Mapper
public interface UserMapper {
    List<UserDTO> selectUserList(String id);
}
