package com.sad7.demo.provider.api;

import com.sad7.demo.provider.domain.Admin;

/**
 * 用户管理服务
 * <p>
 * Description:
 * </p>
 *
 * @author Lusifer
 * @version v1.0.0
 * @date 2019-07-26 09:32:31
 * @see com.sad7.demo.provider.api
 */
public interface AdminService {

    /**
     * 新增用户
     *
     * @param admin {@link Admin}
     * @return {@code int} 大于 0 则表示添加成功
     */
    int insert(Admin admin);

    /**
     * 获取用户
     *
     * @param username 用户名
     * @return {@link Admin}
     */
    Admin get(String username);

    /**
     * 获取用户
     *
     * @param admin {@link Admin}
     * @return {@link Admin}
     */
    Admin get(Admin admin);

    /**
     * 更新用户
     * <p>
     * 仅允许更新 邮箱、昵称、备注、状态
     * </p>
     *
     * @param admin {@link Admin}
     * @return {@code int} 大于 0 则表示更新成功
     */
    int update(Admin admin);

    /**
     * 修改密码
     *
     * @param username {@code String} 用户名
     * @param password {@code String} 明文密码
     * @return {@code int} 大于 0 则表示更新成功
     */
    int modifyPassword(String username, String password);

    /**
     * 修改头像
     *
     * @param username {@code String} 用户名
     * @param path     {@code String} 头像地址
     * @return {@code int} 大于 0 则表示更新成功
     */
    int modifyIcon(String username, String path);
}