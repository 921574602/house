package com.zr.class3.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zr.class3.mapper.BlogMapper;
import com.zr.class3.model.*;

import com.zr.class3.service.GeneralService;

import java.util.List;

@Service
public class GeneralServiceImpl implements GeneralService{

	
	@Autowired
	private BlogMapper blogmapper;
	
	
	@Override
	//前端-程鑫
	//id：父节点的id，返回此父节点下的所有节点(不包含父节点)
	public Map get_menu(int id) {
		List<Menu> menu=blogmapper.search_menu(id);
		Map map= new HashMap();
		map.put("code",200);
		map.put("data", menu);
		map.put("desc", "菜单加载成功");
		return map;
	}
	
	//后端-冯朔
	
	@Override
	public List<FangDong> get_fangdong_all() {
		// TODO Auto-generated method stub
		List<FangDong> fangdong=blogmapper.get_all_fangdong_info();
		return fangdong;
	}
	
	//后端-冯朔
	@Override
	public Map get_fangdong(String id) {
		FangDong fangdong=blogmapper.get_fangdong_info_byid(id);
		Map map= new HashMap();
		List<FangYuan> fangyuan=blogmapper.get_fangyuan_info_by_fangdongid(id);

		if (fangyuan.isEmpty())
			map.put("ifHaveFangyuan","0");
		else {
			map.put("ifHaveFangyuan","1");
			map.put("data_fangyuan", fangyuan);
		    List<HeYue> heyue= new ArrayList <HeYue>();
			for(int i = 0; i<fangyuan.size();i++) {
				String FYid=fangyuan.get(i).getFYNum();
				HeYue single_heyue=blogmapper.get_heyue_info_by_fangyuanid(FYid);
				heyue.add(single_heyue);
			}
			map.put("data_heyue",heyue);
		}
		map.put("code",200);
		map.put("data", fangdong);
		
		map.put("desc", "房东信息加载成功");
		return map;
	}
	
	//后端-冯朔
	@Override 
	public Map search_fangdong(String desc) {
		return null;
	}
	
	//后端-冯朔
	@Override 
	public Map add_fangdong(FangDong fangdong) {
		blogmapper.insertFangDong(fangdong);
		Map map= new HashMap();
		map.put("code",200);
		map.put("desc", "房东添加成功");
		return map;
	}
	
	//后端-冯朔
	@Override 
	public Map update_fangdong(int id) {
		return null;
	}
	
	//后端-冯朔
	@Override 
	public Map delete_fangdong(int id) {
		return null;
	}
	
	
	
	//后端-冯朔
	
	@Override
	public List<ZuHu> get_zuhu_all() {
		// TODO Auto-generated method stub
		List<ZuHu> zuhu=blogmapper.get_all_zuhu_info();
		return zuhu;
	}
	
	//后端-冯朔
	@Override
	public Map get_zuhu(int id) {
		List<ZuHu> zuhu=blogmapper.get_all_zuhu_info();
		Map map= new HashMap();
		map.put("code",200);
		map.put("data", zuhu.get(id-1));
		map.put("desc", "菜单加载成功");
		return map;
	}
	
	//后端-冯朔
	@Override 
	public Map search_zuhu(String desc) {
		return null;
	}
	
	//后端-冯朔
	@Override 
	public Map add_zuhu() {
		return null;
	}
	
	//后端-冯朔
	@Override 
	public Map update_zuhu(int id) {
		return null;
	}
	
	//后端-冯朔
	@Override 
	public Map delete_zuhu(int id) {
		return null;
	}

	
	//前端-程鑫
	@Override
	public List<FangYuan> search_fangyuan() {
		return blogmapper.search_fangyuan();
	}

	@Override
	public List<HeYue> search_fangyuan_heyue_without(String FYNum) {
		// TODO Auto-generated method stub
		return null; 
	}
	
	//后端-李泽霖
	@Override
	public List<FangDongQQ> get_all_fangdongqq_info() {
	        // TODO Auto-generated method stub
	        List<FangDongQQ> fangdongqingqiu=blogmapper.get_all_fangdongqq_info();
	        return fangdongqingqiu;
	    }       
		
	//后端-李泽霖
	@Override
	public List<FangDongQQ> get_pre_fangdongqq_info() {
	        // TODO Auto-generated method stub
	        List<FangDongQQ> fangdongqingqiu=blogmapper.get_pre_fangdongqq_info();
	        return fangdongqingqiu;
	    }

	//前端-程鑫
	@Override
	public List<FangYuanQQ> get_all_fangyuanqq_id(String id_fangdong) {
		// TODO Auto-generated method stub
		return blogmapper.get_all_fangyuanqq_id(id_fangdong);
	}

	//前端-程鑫
	@Override
	public List<HeYue> get_all_heyue_id(String id_fangdong) {
		// TODO Auto-generated method stub
		return blogmapper.get_all_heyue_id(id_fangdong);
	}
	
	//后端-李泽霖
	@Override
	public int delete_fangdong_Num(String num) {
		return blogmapper.delete_fangdong_Num(num);
	}
	
	//后端-李泽霖
	@Override	
	public int delete_zuhu_Num(String num) {
		int deleteone=blogmapper.delete_zuhu_Num(num);
		return deleteone;
	}

}
