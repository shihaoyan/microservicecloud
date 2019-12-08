package bh.db.springcloud.service;

import bh.db.springcloud.entities.Dept;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2019-11-20-21:06
 * 描述：部门服务
 */
public interface DeptService {

	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();

}
