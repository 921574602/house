package com.zr.class3.api.people;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zr.class3.service.GeneralService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import com.zr.class3.model.*;

@RestController
@RequestMapping("/people/fangdong")
@Api(tags="房东相关接口")
public class fangdong {
	@Autowired
	private GeneralService generalService;
	
	
	
	@CrossOrigin
	@GetMapping("/get_all_fangdong_info")
	@ApiOperation("获取所有房东表中的所有条目并返回房东类型的list")
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map get_all_fangdong_info() {
		Map map=new HashMap();
		map.put("data", generalService.get_all_fangdong_info());
		map.put("code", 200);
		return map;
	}
	
	
	
	@CrossOrigin
	@GetMapping("/get_fangyuan_info_by_fangdongid")
	@ApiOperation("通过房东的编号获取此房东所有的房源请求(未审核的)并返回房源类型的list")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="编号",required=true)
	})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map get_fangyuan_info_by_fangdongid(String id) {
		Map map=new HashMap();
		map.put("data", generalService.get_fangyuan_info_by_fangdongid(id));
		map.put("code", 200);
		return map;
	}
	
	
	@CrossOrigin
	@GetMapping("/get_heyue_info_by_fangdongid")
	@ApiOperation("通过房东编号获取此房东所有的合约并且状态是待审核的")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="编号",required=true)
	})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map get_heyue_info_by_fangdongid(String id) {
		Map map=new HashMap();
		map.put("data", generalService.get_heyue_info_by_fangdongid(id));
		map.put("code", 200);
		return map;
	}
	
	
	@CrossOrigin
	@GetMapping("/get_fangdong_list_full")
	@ApiOperation("获取所有房东(全部信息，包含是否有请求等)")
	//前端-程鑫
	//已验证通过
	public Map get_fangdong_list_full() {
		Map M=new HashMap();
		
		List<FangDong> L =generalService.get_all_fangdong_info();
		for(int i=0;i<L.size();i++)
		{
			if(generalService.get_fangyuan_info_by_fangdongid(L.get(i).getFDNum()).size()>0)
			{
				L.get(i).setFYQQ("是");
			}
			if(generalService.get_heyue_info_by_fangdongid(L.get(i).getFDNum()).size()>0)
			{
				L.get(i).setHeYueQueRen("是");
			}
		}
		M.put("code", 0);
		M.put("data", L);
		return M;
	}	
	
	
	
	
//	@CrossOrigin
//	@GetMapping("/get")
//	@ApiOperation("根据id获取单个房东的信息")
//	@ApiImplicitParams({
//		@ApiImplicitParam(name="id",value="编号",required=true)
//	})
//	//后端-冯朔
//	//已验证通过
//	public Map get_fangdong(String id) {
//		
//		return;
//	}
	
	
	
	@CrossOrigin
	@GetMapping("/search")
	@ApiOperation("根据搜索框传入的对房东的描述进行搜索")
	@ApiImplicitParams({
		@ApiImplicitParam(name="desc",value="描述",required=true)
	})
	//后端-冯朔
	//未验证通过
	public Map search_fangdong(String desc) {
		Map map=new HashMap();
		map.put("data", generalService.search_fangdong(desc));
		map.put("code", 200);
		return map;
	}
	
	@CrossOrigin
	@PostMapping("/add")
	@ApiOperation("添加新的房东信息")
	@ApiImplicitParams({})
	//后端-冯朔
	//已验证通过
	public Map add_fangdong(FangDong fangdong) {
		Map map=new HashMap();
		map.put("data", generalService.add_fangdong(fangdong));
		map.put("code", 200);
		return map;
	}
	
	
	@CrossOrigin
	@GetMapping("/update")
	@ApiOperation("修改指定的房东信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="编号",required=true)
	})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map update_fangdong(int id) {
		Map map=new HashMap();
		map.put("data", generalService.update_fangdong(id));
		map.put("code", 200);
		return map;
	}
	
	
	@CrossOrigin
	@GetMapping("/delete/{id}")
	@ApiOperation("修改指定的房东信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="编号",required=true)
	})
	//后端-冯朔
	//未验证通过
	public Map delete_fangdong(int id) {
		Map map=new HashMap();
		map.put("data", generalService.update_fangdong(id));
		map.put("code", 200);
		return map;
	}
	
	
	@CrossOrigin
	@GetMapping("/get_all_information")
	@ApiOperation("获取所有房东请求信息")
	//后端-李泽霖
	//已验证通过

	public Map get_all_fangdongqq_info() {
		Map map=new HashMap();
		map.put("data", generalService.get_all_fangdongqq_info());
		map.put("code", 200);
        return map;
    }
	
	
	@CrossOrigin
	@GetMapping("/get_pre_informationg")
	@ApiOperation("获取申请中房东请求信息")
	//后端-李泽霖
	//已验证通过
	public Map get_pre_fangdongqq_info() {
		Map map=new HashMap();
		map.put("data", generalService.get_pre_fangdongqq_info());
		map.put("code", 200);
        return map;
    }
	
	
	@CrossOrigin
	@GetMapping("/get_all_fangyuanqq_id")
	@ApiOperation("根据房东id获取房东所有的房源请求")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id_fangdong",value="房东的id",required=true)
	})
	//前端-程鑫
	//已验证通过
	public Map get_all_fangyuanqq_id(String id_fangdong) {
		Map map=new HashMap();
		map.put("data", generalService.get_all_fangyuanqq_id(id_fangdong));
		map.put("code", 200);
        return map;
    }
	
	
	@CrossOrigin
	@GetMapping("/get_all_heyue_id")
	@ApiOperation("根据房东id获取房东所有的heyue")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id_fangdong",value="房东的id",required=true)
	})
	//前端-程鑫
	//已验证通过
	public Map get_all_heyue_id(String id_fangdong) {
		Map map=new HashMap();
		map.put("data", generalService.get_all_heyue_id(id_fangdong));
		map.put("code", 200);
        return map;
    }
	
	
	
	@CrossOrigin
	@GetMapping("/detele_fangdong_num")
	@ApiOperation("删除一位房东及其相关信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="num",value="房东的id",required=true)
	})
	//后端-李泽霖
	//已验证通过
	public Map delete_fangdong_Num(String num){
		Map map=new HashMap();
		map.put("data", generalService.delete_fangdong_Num(num));
		map.put("code", 200);
		return map;
	}
	
	
}
