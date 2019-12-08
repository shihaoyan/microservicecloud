package bh.db.springcloud.service.impl;

import bh.db.springcloud.dao.DeptDao;
import bh.db.springcloud.entities.Dept;
import bh.db.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2019-11-20-21:07
 * 描述：
 */
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;

	@Override
	public boolean add(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return deptDao.findAll();
	}
}
