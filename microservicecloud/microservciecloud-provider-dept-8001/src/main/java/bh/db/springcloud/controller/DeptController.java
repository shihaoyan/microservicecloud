package bh.db.springcloud.controller;

import bh.db.springcloud.entities.Dept;
import bh.db.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2019-11-20-21:32
 * 描述： 部门的controller
 */
@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;

	@PostMapping("/dept/add")
	public boolean add(@RequestBody Dept dept){
		return deptService.add(dept);
	}

	@GetMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id){
		return deptService.get(id);
	}

	@GetMapping("/dept/list")
	public List<Dept> list(){
		return deptService.list();
	}




}
