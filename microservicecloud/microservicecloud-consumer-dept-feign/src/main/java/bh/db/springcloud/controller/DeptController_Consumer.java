package bh.db.springcloud.controller;

import bh.db.springcloud.entities.Dept;
import bh.db.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2019-11-21-10:36
 * 描述：
 */
@RestController
public class DeptController_Consumer {

	/**
	 * 自动注入的事api接口中的通用Service
	 */
	@Autowired
	private DeptClientService deptClientService;

	@RequestMapping("/consumer/dept/add")
	public boolean add(Dept dept) {
		return deptClientService.add(dept);
	}

	@GetMapping("/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return deptClientService.get(id);
	}

	@SuppressWarnings("all")
	@GetMapping("/consumer/dept/list")
	public List<Dept> list(){
		return deptClientService.list();
	}




}
