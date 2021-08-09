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

	void insertFangDong(FangDong fangdong);
	FangDong get_fangdong_info_byid(String id);
	
	List<ZuHu> get_all_zuhu_info();
	
	List<FangYuan> search_fangyuan();

	

	List<FangDongQQ> get_all_fangdongqq_info();
	List<FangDongQQ> get_pre_fangdongqq_info();
	
	HeYue get_heyue_info_by_fangyuanid(String FYid);
	
	List<FangYuanQQ> get_all_fangyuanqq_id(@Param("id_fangdong")String id);
	
	List<HeYue> get_all_heyue_id(@Param("id_fangdong")String id);
	
	int delete_fangdong_Num(@Param("num") String num);
	
	int delete_zuhu_Num(@Param("num")String num);
	
	
	List<FangYuan> get_all_fangyuan_info();
	
	int delete_fangyuan_Num(@Param("num") String num);
	
	List<FangYuan> get_fangyuan_info_fromid(@Param("num") String num);
	
	
	List<FangYuanQQ> get_all_fangyuanqq_info();
	
	
	List<FangDong> get_fangdong_info_from_fangyuanid(@Param("num") String num);
	
	
	List<FangDong> get_all_fangdong_info();
	List<FangYuanQQ> get_fangyuan_info_by_fangdongid(@Param("FDNum") String id);
	List<HeYue> get_heyue_info_by_fangdongid(@Param("FDNum") String id);
	
	
	List<ZuHu> get_zuhu_info_fromid(@Param("num") String num);
	
	List<KanFangQQ> get_kanfangqq_by_zuhuid(@Param("ZHNum") String id);
	
	
	List<HeYue> get_heyue_by_zuhuid(@Param("ZHNum") String id);
	
	
	List<KanFangQQ> get_kanfangqq_of_zuhu(@Param("zhnum") String id);
	
	List<HeYue> get_pre_heyue_info(@Param("zhnum") String id);
	
	List<FangYuanQQ> get_pre_fangyuanqq_info();
}
