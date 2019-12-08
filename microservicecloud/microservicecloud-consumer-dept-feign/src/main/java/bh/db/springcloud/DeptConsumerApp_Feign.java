package bh.db.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author 石皓岩
 * @create 2019-11-21-10:45
 * 描述：
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient				//开启检索服务功能，但是就算是没有这个注解也好使
@EnableFeignClients(basePackages = {"bh.db.springcloud"})
public class DeptConsumerApp_Feign {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerApp_Feign.class,args);
	}
}
