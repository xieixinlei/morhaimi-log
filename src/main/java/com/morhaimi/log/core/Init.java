package com.morhaimi.log.core;

import cn.hutool.extra.spring.SpringUtil;
import com.morhaimi.log.service.LogMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author xxl
 * @date 2021/9/30 16:50
 */
@Component
public class Init {

    @Autowired
    LogMessageService logMessageService;

    @PostConstruct
    public void initLogMessageTable() {
        logMessageService.initTable();
    }

}
