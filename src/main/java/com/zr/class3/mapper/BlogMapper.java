package com.zr.class3.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zr.class3.model.FangDong;
import com.zr.class3.model.*;




@Repository
public interface BlogMapper {
	List<Menu> search_menu(@Param("fatherid") int id);

	List<FangDong> get_all_fangdong_info();
	void insertFangDong(FangDong fangdong);
	
	List<ZuHu> get_all_zuhu_info();
	
	List<FangYuan> search_fangyuan();
	

	List<FangDongQQ> get_all_fangdongqq_info();
	List<FangDongQQ> get_pre_fangdongqq_info();
	
}