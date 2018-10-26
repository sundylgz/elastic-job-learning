package com.dangdang.ddframe.job.example.exception.handler;

import com.dangdang.ddframe.job.executor.handler.JobExceptionHandler;

/**
 * 定时任务定时处理
 */
public class CustomJobExceptionHandler implements JobExceptionHandler {
    @Override
    public void handleException(String s, Throwable throwable) {
        System.out.println(String.format("##出现错误,Job '%s' exception occur in job processing", s) + "error: " + throwable.toString());

    }
}
