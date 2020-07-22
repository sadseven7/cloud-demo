package com.sad7.demo.business.dto.params;

import lombok.Data;

import java.io.Serializable;

/**
 * 修改密码参数
 * <p>
 * Description:
 * </p>
 *
 * @author Lusifer
 * @version v1.0.0
 * @date 2019-08-23 04:38:15
 * @see com.sad7.demo.business.dto
 */
@Data
public class PasswordParam implements Serializable {

    private static final long serialVersionUID = -4581063171304828558L;
    private String username;
    private String oldPassword;
    private String newPassword;

}
