package com.sad7.demo.business.dto.params;


import lombok.Data;

import java.io.Serializable;

/**
 * 修改头像参数
 * <p>
 * Description:
 * </p>
 *
 * @author Lusifer
 * @version v1.0.0
 * @date 2019-08-26 23:44:42
 * @see com.sad7.demo.business.dto
 */
@Data
public class IconParam implements Serializable {

    private static final long serialVersionUID = 8560399707634170106L;
    /**
     * 用户名
     */
    private String username;

    /**
     * 头像地址
     */
    private String path;

}
