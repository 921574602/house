package com.zr.class3.api.heyue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zr.class3.model.HeYue;
import com.zr.class3.model.HeYueJL;
import com.zr.class3.model.ZuHu;
import com.zr.class3.service.GeneralService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/heyue")
@Api(tags="合约的相关接口")
public class heyue {

	@Autowired
	private GeneralService generalService;
	
	
	@CrossOrigin
	@GetMapping("get_heyue_solved_all")
	@ApiOperation("获取所有已通过的合约信息")
	//后端-朱子剑
	public Map get_pass_heyue_info() {
		Map map=new HashMap();
		map.put("data", generalService.get_pass_heyue_info());
		map.put("code", 200);
		return map;
	}
	
	
	@CrossOrigin
	@GetMapping("/get_zuhu_by_heyueid")
	@ApiOperation("根据合约id获取指定的租户信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="合约编号",required=true)
	})
	//后端-朱子剑
	public Map get_zuhu_info_by_heyueid(String id) {
		Map map=new HashMap();
		map.put("data", generalService.get_zuhu_info_by_heyueid(id));
		map.put("code", 200);
		return map;
	}
	
	
	
	@CrossOrigin
	@GetMapping("/list_audit_heyue")
	@ApiOperation("获取审核中的合约信息")
	//后端-李泽霖
	public Map get_audit_heyue_info() {
		Map map=new HashMap();
		map.put("data", generalService.get_audit_heyue_info());
		map.put("code", 200);
		return map;
	}
	
	
	
	@CrossOrigin
	@GetMapping("/list_notaudit_heyue")
	@ApiOperation("获取除了待审核中的合约信息")
	//后端-李泽霖
	public Map get_notaudit_heyue_info() {
		Map map=new HashMap();
		map.put("data", generalService.get_notaudit_heyue_info());
		map.put("code", 200);
		return map;
	}
	
	
	
	@CrossOrigin
	@GetMapping("/list_all_heyuejl")
	@ApiOperation("获取所有的合约记录")
	//后端-李泽霖
	public Map get_all_heyuejl_info() {
		Map map=new HashMap();
		map.put("data", generalService.get_all_heyuejl_info());
		map.put("code", 200);
		return map;
	}
}
