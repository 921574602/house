package com.zr.class3.api.people;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zr.class3.service.GeneralService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import com.zr.class3.model.FangDong;
import com.zr.class3.model.FangYuanQQ;
import com.zr.class3.model.HeYue;
import com.zr.class3.model.KanFangQQ;
import com.zr.class3.model.ZuHu;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/people/zuhu")
@Api(tags="租户相关接口")
public class zuhu {
	@Autowired
	private GeneralService generalService;
	
	
	@CrossOrigin
	@GetMapping("/list")
	@ApiOperation("获取所有租户信息")
	//后端-冯朔
	//已验证通过
	public Map get_zuhu_all() {
		Map map=new HashMap();
		map.put("data", generalService.get_zuhu_all());
		map.put("code", 200);
		return map;
	}
	
	
	
	@CrossOrigin
	@GetMapping("/get")
	@ApiOperation("根据id获取单个租户的信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="编号",required=true)
	})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map get_zuhu(int id) {
		Map map=new HashMap();
		map.put("data", generalService.get_zuhu(id));
		map.put("code", 200);
		return map;
	}
	
	
	
	@CrossOrigin
	@GetMapping("/search")
	@ApiOperation("根据搜索框传入的对租户的描述进行搜索")
	@ApiImplicitParams({
		@ApiImplicitParam(name="desc",value="描述",required=true)
	})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map search_zuhu(String desc) {
		Map map=new HashMap();
		map.put("data", generalService.search_zuhu(desc));
		map.put("code", 200);
		return map;
	}
	
	@CrossOrigin
	@GetMapping("/add")
	@ApiOperation("添加新的租户信息")
	@ApiImplicitParams({})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map add_zuhu() {
		Map map=new HashMap();
		map.put("data", generalService.add_zuhu());
		map.put("code", 200);
		return map;
	}
	
	
	@CrossOrigin
	@GetMapping("/update/{id}")
	@ApiOperation("修改指定的租户信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="编号",required=true)
	})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map update_zuhu(int id) {
		Map map=new HashMap();
		map.put("data", generalService.update_zuhu(id));
		map.put("code", 200);
		return map;
	}
	
	
	@CrossOrigin
	@GetMapping("/delete/{id}")
	@ApiOperation("修改指定的租户信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="编号",required=true)
	})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map delete_zuhu(int id) {
		Map map=new HashMap();
		map.put("data", generalService.update_zuhu(id));
		map.put("code", 200);
		return map;
	}
	
	
	
	@CrossOrigin
	@GetMapping("/detele_zuhu_num")
	@ApiOperation("删除一位租户及其相关信息")
	//后端-李泽霖
	public Map delete_zuhu_Num(String num){		
		Map map=new HashMap();
		map.put("data", generalService.delete_zuhu_Num(num));
		map.put("code", 200);
		return map;
	}
	
	
	
	@CrossOrigin
	@GetMapping("/get_zuhu_info_fromid")
	@ApiOperation("通过搜索id获取租户信息")
	//后端-李泽霖
	public Map get_zuhu_info_fromid(String num) {
		Map map=new HashMap();
		map.put("data", generalService.get_zuhu_info_fromid(num));
		map.put("code", 200);
        return map;
    }
	
	
	
	@CrossOrigin
	@GetMapping("/get_kanfangqq_by_zuhuid")
	@ApiOperation("通过租户的id和看房请求表可以获得与此租户相关的所有看房请求，返回看房请求类型的list")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="租户id",required=true)
	})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map get_kanfangqq_by_zuhuid(String id) {
		Map map=new HashMap();
		map.put("data", generalService.get_kanfangqq_by_zuhuid(id));
		map.put("code", 200);
		return map;
	}
	
	
	
	@CrossOrigin
	@GetMapping("/get_heyue_by_zuhuid")
	@ApiOperation("通过租户的id和合约表可以获得与此租户相关的所有合约，返回合约类型的list")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="编号",required=true)
	})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map get_heyue_by_zuhuid(String id) {
		Map map=new HashMap();
		map.put("data", generalService.get_heyue_by_zuhuid(id));
		map.put("code", 200);
		return map;
	}
	
	
	@CrossOrigin
	@GetMapping("/get_kanfangqq_unsolved_byid")
	@ApiOperation("根据租户id获取指定看房请求信息(待处理的)")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="租户编号",required=true)
	})
	//后端-朱子剑
	public Map get_kanfangqq_of_zuhu(String id) {
			Map map=new HashMap();
			map.put("data", generalService.get_kanfangqq_of_zuhu(id));
			map.put("code", 200);
        	return map;
    	}
	
	
	
	
	@CrossOrigin
	@GetMapping("/get_heyue_unsolved_byid")
	@ApiOperation("根据租户id获取指定的待处理的合约信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="租户编号",required=true)
	})
	//后端-朱子剑
	public Map get_pre_heyue_info(String id) {
		Map map=new HashMap();
		map.put("data", generalService.get_pre_heyue_info(id));
		map.put("code", 200);
		return map;
	}
	
	
	@CrossOrigin
	@GetMapping("/get_fangyuanqq_unsolved_all")
	@ApiOperation("获取指定的待处理的房源请求信息")
	//后端-朱子剑
	public Map get_pre_fangyuanqq_info() {
		Map map=new HashMap();
		map.put("data", generalService.get_pre_fangyuanqq_info());
		map.put("code", 200);
		return map;
	}
	
	
	@CrossOrigin
	@GetMapping("/get_zuhu_list_full")
	@ApiOperation("获取所有租户(全部信息，包含是否有请求等)")
	//前端-程鑫
	//已验证通过
	public Map get_fangdong_list_full() {
		List<ZuHu> L =generalService.get_zuhu_all();
		for(int i=0;i<L.size();i++)
		{
			if(generalService.get_pre_heyue_info(L.get(i).getZHNum()).size()>0)
			{
				L.get(i).setHeYueQQ("是");
			}
			if(generalService.get_kanfangqq_of_zuhu(L.get(i).getZHNum()).size()>0)
			{
				L.get(i).setKanFangQQ("是");
			}
		}
		Map map=new HashMap();
		map.put("data", L);
		map.put("code", 200);
		return map;
	}	
}
