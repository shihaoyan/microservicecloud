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


	boolean addDept(Dept dept);


	Dept findById(Long id);


	List<Dept> findAll();

}