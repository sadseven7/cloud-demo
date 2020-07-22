package com.sad7.demo.business.dto.params;


import lombok.Data;

import java.io.Serializable;

/**
 * 个人信息参数
 * <p>
 * Description:
 * </p>
 *
 * @author Lusifer
 * @version v1.0.0
 * @date 2019-07-30 22:42:50
 * @see com.sad7.demo.business.dto
 */
@Data
public class ProfileParam implements Serializable {

    private static final long serialVersionUID = 3526335854942883554L;
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 头像
     */
    private String icon;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 备注
     */
    private String note;

    /**
     * 用户状态 {@code Integer}
     * <p>
     * 0 - 禁止 <br />
     * 1 - 启用
     * </p>
     */
    private Integer status;
}