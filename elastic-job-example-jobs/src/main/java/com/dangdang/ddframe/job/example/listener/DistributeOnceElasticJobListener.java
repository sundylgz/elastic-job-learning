package com.dangdang.ddframe.job.example.listener;

import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.AbstractDistributeOnceElasticJobListener;

/**
 * 分布式场景中仅单一节点执行的监听
 */
public class DistributeOnceElasticJobListener extends AbstractDistributeOnceElasticJobListener {
    public DistributeOnceElasticJobListener() {
        super(5000L, 10000L);
    }

    public DistributeOnceElasticJobListener(long startedTimeoutMilliseconds, long completedTimeoutMilliseconds) {
        super(startedTimeoutMilliseconds, completedTimeoutMilliseconds);
    }

    @Override
    public void doBeforeJobExecutedAtLastStarted(ShardingContexts shardingContexts) {
        System.out.println("分布式任务只执行一次监听器开始前###########################");
    }

    @Override
    public void doAfterJobExecutedAtLastCompleted(ShardingContexts shardingContexts) {
        System.out.println("分布式任务只执行一次监听器执行完成###########################");
    }
}