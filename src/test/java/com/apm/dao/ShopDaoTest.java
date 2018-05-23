package com.apm.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.apm.BaseTest;
import com.apm.entity.Area;
import com.apm.entity.PersonInfo;
import com.apm.entity.Shop;
import com.apm.entity.ShopCategory;

public class ShopDaoTest extends BaseTest{
	@Autowired
	private ShopDao shopDao;
	
	@Test
	@Ignore
	public void testInsertShop(){
		Shop shop =new Shop();
		PersonInfo owner=new PersonInfo();
		Area area=new Area();
		ShopCategory shopCategory=new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(2);
		shopCategory.setShopCategoryId(1L);
		shop.setOwner(owner);
		shop.setShopCategory(shopCategory);
		shop.setArea(area);
		shop.setShopName("测试的店铺");
		shop.setShopDesc("desc");
		shop.setShopAddr("addr");
		shop.setPhone("test");
		shop.setShopImg("test");
		shop.setCreateTime(new Date());
		shop.setEnableStatus(1);
		shop.setAdvice("审核中");
		int effectedNum=shopDao.insertShop(shop);
		assertEquals(1,effectedNum);
	}
	@Test
	@Ignore
	public void testUpdateShop(){
		Shop shop =new Shop();
		shop.setShopId(1L);
		shop.setShopDesc("desc after update");
		shop.setShopAddr("addr after update");
		shop.setLastEditTime(new Date());
		int effectedNum=shopDao.updateShop(shop);
		assertEquals(1,effectedNum);
	}
	@Test
	public void testQueryByShopId(){
		long shopId=1;
		Shop shop=shopDao.queryByShopId(shopId);
		System.out.println("areaId"+shop.getArea().getAreaId());
		System.out.println("areaName"+shop.getArea().getAreaName());
		System.out.println("shopCategoryId"+shop.getShopCategory().getShopCategoryId());
		System.out.println("shopCategoryName"+shop.getShopCategory().getShopCategoryName());
		System.out.println("owerId"+shop.getOwner().getUserId());
		System.out.println("owerName"+shop.getOwner().getName());
	}
}
