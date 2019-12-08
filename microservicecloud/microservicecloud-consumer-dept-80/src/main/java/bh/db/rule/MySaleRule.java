package bh.db.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 石皓岩
 * @create 2019-11-28-16:25
 * 描述：
 */
@Configuration
public class MySaleRule {

	@Bean
	public IRule myRule(){
		return new MyRule();
	}


}
