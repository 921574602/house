package com.zr.class3.api.fangyuan;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zr.class3.model.FangYuan;
import com.zr.class3.service.GeneralService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/fangyuan")
@Api(tags="房源相关接口")
public class FangYuanApi {

	@Autowired
	private GeneralService generalService;
	
	
	@CrossOrigin
	@GetMapping("/get_fangyuan")
	@ApiOperation("获取满足条件的房源")
	//前端-程鑫
	public List<FangYuan> get_fangyuan() {
		List<FangYuan> list_fangyuan=generalService.search_fangyuan();
		
		return list_fangyuan;
	}
}
