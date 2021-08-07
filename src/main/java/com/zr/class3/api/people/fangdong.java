package com.zr.class3.api.people;

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
	@GetMapping("/list")
	@ApiOperation("获取所有房东信息")
	//后端-冯朔
	//已验证通过(未验证通过)
	public List<FangDong> get_fangdong_all() {
		
		return generalService.get_fangdong_all();
	}
	
	
	
	@CrossOrigin
	@GetMapping("/get")
	@ApiOperation("根据id获取单个房东的信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="编号",required=true)
	})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map get_fangdong(int id) {
		
		return generalService.get_fangdong(id);
	}
	
	
	
	@CrossOrigin
	@GetMapping("/search")
	@ApiOperation("根据搜索框传入的对房东的描述进行搜索")
	@ApiImplicitParams({
		@ApiImplicitParam(name="desc",value="描述",required=true)
	})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map search_fangdong(String desc) {
		
		return generalService.search_fangdong(desc);
	}
	
	@CrossOrigin
	@PostMapping("/add")
	@ApiOperation("添加新的房东信息")
	@ApiImplicitParams({})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map add_fangdong(FangDong fangdong) {
		
		return generalService.add_fangdong(fangdong);
	}
	
	
	@CrossOrigin
	@GetMapping("/update/{id}")
	@ApiOperation("修改指定的房东信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="编号",required=true)
	})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map update_fangdong(int id) {
		
		return generalService.update_fangdong(id);
	}
	
	
	@CrossOrigin
	@GetMapping("/delete/{id}")
	@ApiOperation("修改指定的房东信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="编号",required=true)
	})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map delete_fangdong(int id) {
		
		return generalService.update_fangdong(id);
	}
	
	
	@CrossOrigin
	@GetMapping("/get_all_information")
	@ApiOperation("获取所有房东请求信息")
	//后端-李泽霖
	//已验证通过

	public List<FangDongQQ> get_all_fangdongqq_info() {

        return generalService.get_all_fangdongqq_info();
    }
	
	
	@CrossOrigin
	@GetMapping("/get_pre_informationg")
	@ApiOperation("获取申请中房东请求信息")
	//后端-李泽霖
	//已验证通过
	public List<FangDongQQ> get_pre_fangdongqq_info() {

        return generalService.get_pre_fangdongqq_info();
    }
	
	
	@CrossOrigin
	@GetMapping("/get_all_fangyuanqq_id")
	@ApiOperation("根据房东id获取房东所有的房源请求")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id_fangdong",value="房东的id",required=true)
	})
	//前端-程鑫
	//已验证通过
	public List<FangYuanQQ> get_all_fangyuanqq_id(String id_fangdong) {

        return generalService.get_all_fangyuanqq_id(id_fangdong);
    }
	
	
	@CrossOrigin
	@GetMapping("/get_all_heyue_id")
	@ApiOperation("根据房东id获取房东所有的heyue")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id_fangdong",value="房东的id",required=true)
	})
	//前端-程鑫
	//已验证通过
	public List<HeYue> get_all_heyue_id(String id_fangdong) {

        return generalService.get_all_heyue_id(id_fangdong);
    }
}
