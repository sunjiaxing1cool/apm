package com.apm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apm.dao.AreaDao;
import com.apm.entity.Area;
import com.apm.service.AreaService;
@Service
public class AreaServiceImpl implements AreaService{
	
	@Autowired
	private AreaDao areaDao;
	
	@Override
	public List<Area> getAreaList() {
		// TODO Auto-generated method stub
		return areaDao.queryArea();
	}

}
