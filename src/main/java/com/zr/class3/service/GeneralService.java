package com.zr.class3.service;

import java.util.List;
import java.util.Map;
import com.zr.class3.model.*;

public interface GeneralService {
	public Map get_menu(int id);
	
	
	public List<FangDong> get_fangdong_all();
	public Map get_fangdong(int id);
	public Map search_fangdong(String desc);
	public Map add_fangdong(FangDong fangdong);
	public Map update_fangdong(int id);
	public Map delete_fangdong(int id);
	
	
	public List<ZuHu> get_zuhu_all();
	public Map get_zuhu(int id);
	public Map search_zuhu(String desc);
	public Map add_zuhu();
	public Map update_zuhu(int id);
	public Map delete_zuhu(int id);
	
	
	
	public List<FangYuan> search_fangyuan();
	
	
	
	public List<HeYue> search_fangyuan_heyue_without(String FYNum);
	
	
	public List<FangDongQQ> get_all_fangdongqq_info();
	public List<FangDongQQ> get_pre_fangdongqq_info();
}