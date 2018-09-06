package com.cai.demo;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task {
	/**
	 * 刷新秒杀商品
	 */
	@Scheduled(cron="* * * * * ?")
	public void refreshSeckillGoods(){
		System.out.println("执行了任务调度"+new Date());		
	}		
}
