package com.mall.mapper;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<PK extends Serializable, T> {
	
	int deleteByPrimaryKey(PK id);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(PK id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKeyWithBLOBs(T record);

	int updateByPrimaryKey(T record);

	List<T> selectAll();

}
