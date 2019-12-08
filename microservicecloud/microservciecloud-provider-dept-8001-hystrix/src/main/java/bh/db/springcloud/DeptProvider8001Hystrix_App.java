package bh.db.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 石皓岩
 * @create 2019-11-20-21:39
 * 描述：
 */
@SpringBootApplication
@EnableEurekaClient						//开启eureka客户端
@EnableDiscoveryClient					//开启服务检索
@EnableCircuitBreaker					//开启断路器注解
public class DeptProvider8001Hystrix_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001Hystrix_App.class, args);
	}
}
