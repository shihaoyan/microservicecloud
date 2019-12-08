package bh.db.springcloud;

import bh.db.rule.MySaleRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 石皓岩
 * @create 2019-11-21-10:45
 * 描述：
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySaleRule.class)
public class DeptConsumerApp_80 {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerApp_80.class,args);
	}
}
