package com.microservice.skeleton.auth.service.impl;

import com.microservice.skeleton.auth.service.RoleService;
import com.microservice.skeleton.common.vo.Result;
import com.microservice.skeleton.common.vo.RoleVo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Mr.Yangxiufeng
 * Date: 2018-06-13
 * Time: 11:06
 */
@Service
@Slf4j
public class RoleServiceImpl implements RoleService {
     private static final Logger log = LoggerFactory.getLogger(RoleServiceImpl.class);
     
    @Override
    public Result<List<RoleVo>> getRoleByUserId(Integer userId) {
        log.info("调用{}失败","getRoleByUserId");
        return Result.failure(100,"调用getRoleByUserId失败");
    }
}
