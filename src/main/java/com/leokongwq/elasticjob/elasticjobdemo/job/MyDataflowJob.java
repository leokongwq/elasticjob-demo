package com.leokongwq.elasticjob.elasticjobdemo.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author kongwenqiang
 */
@Slf4j
@Component
public class MyDataflowJob implements DataflowJob {

    /**
     * 每次 job 被调度，该方法都会被执行。
     */
    @Override
    public List fetchData(ShardingContext shardingContext) {
        return Lists.newArrayList(1, 2, 3);
    }

    @Override
    public void processData(ShardingContext shardingContext, List data) {
        for (Object obj : data) {
            System.out.println(obj);
        }
    }
}
