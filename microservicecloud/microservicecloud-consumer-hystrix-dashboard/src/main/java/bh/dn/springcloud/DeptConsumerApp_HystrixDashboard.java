package bh.dn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author 石皓岩
 * @create 2019-11-21-10:45
 * 描述：
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerApp_HystrixDashboard {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerApp_HystrixDashboard.class, args);
	}
}
