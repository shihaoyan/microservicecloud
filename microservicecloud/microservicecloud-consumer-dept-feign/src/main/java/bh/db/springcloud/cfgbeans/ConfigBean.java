package bh.db.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 石皓岩
 * @create 2019-11-21-10:34
 * 描述：配置类，主要配置了负载均衡算法
 */
@Configuration
public class ConfigBean {

	/**
	 * 可以自定义一些负载均衡算法
	 */
	@Bean
	public IRule myRule(){
		return new RandomRule();            //使用随机替换轮询
	}




}
