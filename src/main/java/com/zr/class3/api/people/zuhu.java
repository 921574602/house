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

import com.zr.class3.model.ZuHu;
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
	//已验证通过(未验证通过)
	public List<ZuHu> get_zuhu_all() {
		
		return generalService.get_zuhu_all();
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
		
		return generalService.get_zuhu(id);
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
		
		return generalService.search_zuhu(desc);
	}
	
	@CrossOrigin
	@GetMapping("/add")
	@ApiOperation("添加新的租户信息")
	@ApiImplicitParams({})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map add_zuhu() {
		
		return generalService.add_zuhu();
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
		
		return generalService.update_zuhu(id);
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
		
		return generalService.update_zuhu(id);
	}
	
	
	
	@CrossOrigin
	@GetMapping("/detele_zuhu_num")
	@ApiOperation("删除一位租户及其相关信息")
	//后端-李泽霖
	public int delete_zuhu_Num(String num){
		return generalService.delete_zuhu_Num(num);
	}
}
