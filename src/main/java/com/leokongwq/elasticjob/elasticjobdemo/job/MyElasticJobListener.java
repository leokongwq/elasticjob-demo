package com.leokongwq.elasticjob.elasticjobdemo.job;

import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.ElasticJobListener;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyElasticJobListener implements ElasticJobListener {

    @Override
    public void beforeJobExecuted(ShardingContexts shardingContexts) {
        log.info("任务执行前");
    }

    @Override
    public void afterJobExecuted(ShardingContexts shardingContexts) {
        log.info("任务执行后");
    }
}
