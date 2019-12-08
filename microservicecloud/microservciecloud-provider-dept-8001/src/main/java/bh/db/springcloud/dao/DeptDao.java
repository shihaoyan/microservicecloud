package bh.db.springcloud.dao;

import bh.db.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2019-11-20-20:56
 * 描述：
 */
@Mapper
public interface DeptDao {

	/**
	 * 添加部门
	 * @param dept
	 * @return
	 */
	boolean addDept(Dept dept);

	/**
	 * 根据id获取某一个部门
	 * @param id
	 * @return
	 */
	Dept findById(Long id);

	/**
	 * 查询所有的部门
	 * @return
	 */
	List<Dept> findAll();

}