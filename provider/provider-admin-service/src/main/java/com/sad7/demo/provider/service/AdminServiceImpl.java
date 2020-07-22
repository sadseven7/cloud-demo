package com.sad7.demo.provider.service;

import com.sad7.demo.provider.api.AdminService;
import com.sad7.demo.provider.domain.Admin;
import com.sad7.demo.provider.mapper.AdminMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 用户管理服务
 * <p>
 * Description:
 * </p>
 *
 * @author Lusifer
 * @version v1.0.0
 * @date 2019-07-26 09:41:08
 * @see com.sad7.demo.provider.service
 */
@Service(version = "1.0.0")
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Resource
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public int insert(Admin admin) {
        // 初始化用户对象
        initAdmin(admin);
        return adminMapper.insert(admin);
    }

    /**
     * 熔断器的使用
     *
     *
     * @param username {@code String} 用户名
     * @return {@link Admin}
     */
    @Override
//    @SentinelResource(value = "getByUsername", fallback = "getByUsernameFallback", fallbackClass = UmsAdminServiceFallback.class)
    public Admin get(String username) {
        Example example = new Example(Admin.class);
        example.createCriteria().andEqualTo("username", username);
        return adminMapper.selectOneByExample(example);
    }

    @Override
    public Admin get(Admin admin) {
        return adminMapper.selectOne(admin);
    }

    @Override
    public int update(Admin admin) {
        // 获取原始用户信息
        Admin oldAdmin = get(admin.getUsername());

        // 仅更新 邮箱、昵称、备注、状态
        oldAdmin.setEmail(admin.getEmail());
        oldAdmin.setNickName(admin.getNickName());
        oldAdmin.setNote(admin.getNote());
        oldAdmin.setStatus(admin.getStatus());

        return adminMapper.updateByPrimaryKey(oldAdmin);
    }

    @Override
    public int modifyPassword(String username, String password) {
        Admin admin = get(username);
        admin.setPassword(passwordEncoder.encode(password));
        return adminMapper.updateByPrimaryKey(admin);
    }

    @Override
    public int modifyIcon(String username, String path) {
        Admin admin = get(username);
        admin.setIcon(path);
        return adminMapper.updateByPrimaryKey(admin);
    }

    /**
     * 初始化用户对象
     *
     * @param admin {@link Admin}
     */
    private void initAdmin(Admin admin) {
        // 初始化创建时间
        admin.setCreateTime(new Date());
        admin.setLoginTime(new Date());

        // 初始化状态
        if (admin.getStatus() == null) {
            admin.setStatus(0);
        }

        // 密码加密
        admin.setPassword(passwordEncoder.encode(admin.getPassword()));
    }

}