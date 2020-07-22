package com.sad7.demo.provider.api;

import com.sad7.demo.provider.domain.TbUser;

public interface TbUserService{

    TbUser getByUsername(String username);

}
