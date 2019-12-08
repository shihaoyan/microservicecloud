package bh.db.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 石皓岩
 * @create 2019-11-21-11:57
 * 描述：
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001_App {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7001_App.class,args);
	}
}
