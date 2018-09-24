package com.dist.xdata.sbds.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dist.xdata.sbds.api.StatisticsService;
import com.dist.xdata.sbds.result.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 统计服务消费者
 *
 * Created by weifj on 20180924.
 */
@RestController
@RequestMapping("api")
@Api("统计api")
public class ApiController {

    @Reference(version = "1.0.0")
    StatisticsService statDubboService;

    @ApiOperation(value = "获取用地平衡表数据。", notes = "getLandBalance")
	@RequestMapping(value = "/stats/landbalance")
    public Result getLandBalance() {
        
    	return new Result(Result.SUCCESSS, "用地平衡数据", this.statDubboService.getLandBalance());
    }
}
