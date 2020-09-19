package com.xxxx.manager.service;

import com.xxxx.manager.pojo.GoodsCategory;

import java.util.List;

/**
 * @author zhoubin
 * @since 1.0.0
 */
public interface GoodsCategoryService {
	/**
	 * 查询所有商品分类
	 * @return
	 */
	List<GoodsCategory> selectAll();
}
