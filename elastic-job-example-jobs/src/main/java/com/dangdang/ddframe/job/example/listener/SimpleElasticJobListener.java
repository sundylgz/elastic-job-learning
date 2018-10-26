package com.dangdang.ddframe.job.example.listener;

import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.ElasticJobListener;

/**
 * 若作业处理作业服务器的文件，处理完成后删除文件，可考虑使用每个节点均执行清理任务。
 * 此类型任务实现简单，且无需考虑全局分布式任务是否完成，请尽量使用此类型监听器。
 */
public class SimpleElasticJobListener implements ElasticJobListener {
    @Override
    public void beforeJobExecuted(ShardingContexts shardingContexts) {
        System.out.println("简单任务监听器开始前###########################");
    }

    @Override
    public void afterJobExecuted(ShardingContexts shardingContexts) {
        System.out.println("简单任务监听器执行完成###########################");

    }
}
