package bh.db.springcloud.service;

import bh.db.springcloud.entities.Dept;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2019-11-20-21:06
 * 描述：部门服务
 */
public interface DeptService {

	/**
	 * 添加用户信息
	 * @param dept
	 * @return
	 */
	boolean add(Dept dept);

	/**
	 * 根据id查询某一个部门
	 * @param id
	 * @return
	 */
	Dept get(Long id);

	/**
	 * 查询所有的部门信息
	 * @return
	 */
	List<Dept> list();

}
