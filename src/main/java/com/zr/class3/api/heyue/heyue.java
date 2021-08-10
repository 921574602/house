package com.zr.class3.api.heyue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zr.class3.model.HeYue;
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
	public List<HeYue> get_pass_heyue_info() {
		
		return generalService.get_pass_heyue_info();
	}
	
	
	@CrossOrigin
	@GetMapping("/get_zuhu_by_heyueid")
	@ApiOperation("根据合约id获取指定的租户信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="合约编号",required=true)
	})
	//后端-朱子剑
	public List<ZuHu> get_zuhu_info_by_heyueid(String id) {
		
		return generalService.get_zuhu_info_by_heyueid(id);
	}
}
