package com.leokongwq.elasticjob.elasticjobdemo.job;


import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author kongwenqiang
 */
@Slf4j
@Component
public class MySimpleElasticJob implements SimpleJob {

    @Override
    public void execute(ShardingContext shardingContext) {

        log.info("jobName:{}", shardingContext.getJobName());
        log.info("taskId:{}", shardingContext.getTaskId());
        log.info("shardingTotalCount:{}", shardingContext.getShardingTotalCount());
        log.info("jobParameter:{}", shardingContext.getJobParameter());
        log.info("shardingItem:{}", shardingContext.getShardingItem());
        log.info("shardingParameter:{}", shardingContext.getShardingParameter());

        try {
            Thread.sleep(60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        switch (shardingContext.getShardingItem()) {
            case 0:
                System.out.println("分片 " + 0);
                break;
            case 1:
                System.out.println("分片 " + 1);
                break;
            case 2:
                System.out.println("分片 " + 2);
                break;
            default:
                System.out.println("never happen!");
        }
    }
}
