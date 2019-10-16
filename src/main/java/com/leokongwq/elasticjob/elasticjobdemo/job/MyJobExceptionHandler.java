package com.leokongwq.elasticjob.elasticjobdemo.job;

import com.dangdang.ddframe.job.executor.handler.JobExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyJobExceptionHandler implements JobExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyJobExceptionHandler.class);

    @Override
    public void handleException(String jobName, Throwable cause) {
        LOGGER.error(jobName, cause);
    }
}
