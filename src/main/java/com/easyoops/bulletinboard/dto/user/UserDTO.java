package com.easyoops.bulletinboard.dto.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * packageName     : com.easyoops.bulletinboard.dto.user
 * fileName        : UserDTO
 * author          : jungwon.lee
 * date            : 2022-10-06
 * version         : v0.1
 */
@Data
public class UserDTO {
    @ApiModelProperty(required = true, value = "ID")
    private String id;

    @ApiModelProperty(required = true, value = "비밀번호")
    private String password;

    @ApiModelProperty(required = true, value = "이름")
    private String name;

    @ApiModelProperty(value = "E-mail")
    private String email;

    @ApiModelProperty(value = "전화번호")
    private int phone;

    @ApiModelProperty(value = "생일")
    private String birth_date;

    @ApiModelProperty(value = "사용여부")
    private boolean del_yn;

}