package com.xxxx.manager.service.impl;

import com.xxxx.manager.mapper.GoodsCategoryMapper;
import com.xxxx.manager.pojo.GoodsCategory;
import com.xxxx.manager.service.GoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhoubin
 * @since 1.0.0
 */
@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryService {
	@Autowired
	private GoodsCategoryMapper goodsCategoryMapper;

	/**
	 * 查询所有商品分类
	 *
	 * @return
	 */
	@Override
	public List<GoodsCategory> selectAll() {
		// GoodsCategoryExample example = new GoodsCategoryExample();
		// //where level = ? and parentIdPath like ? and parentId between(?,?)
		// example.createCriteria().andLevelEqualTo().andParentIdPathLike().andParentIdBetween();
		// List<GoodsCategory> list = goodsCategoryMapper.selectByExample(example);
		// return list;
		return null;
	}
}