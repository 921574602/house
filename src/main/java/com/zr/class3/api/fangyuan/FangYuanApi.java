package com.zr.class3.api.fangyuan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zr.class3.model.FangDong;
import com.zr.class3.model.FangYuan;
import com.zr.class3.model.FangYuanQQ;
import com.zr.class3.model.HeYue;
import com.zr.class3.model.KanFangQQ;
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
	public Map get_fangyuan() {
		List<FangYuan> list_fangyuan=generalService.search_fangyuan();
		Map map=new HashMap();
		map.put("data", list_fangyuan);
		map.put("code", 200);
		return map;
	}
	
	
	
	
	
	@CrossOrigin
	@GetMapping("/list")
	@ApiOperation("获取所有房源信息")
	//后端-李泽霖
	//已验证通过
	public Map get_all_fangyuan_info() {
		Map map=new HashMap();
		map.put("data", generalService.get_all_fangyuan_info());
		map.put("code", 200);
		return map;
	}
	
	
	@CrossOrigin
	@GetMapping("/detele_fangyuan_num")
	@ApiOperation("删除房源及其合约信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="num",value="房源的id",required=true)
	})
	//后端-李泽霖
	
	public Map delete_fangyuan_Num(String num){
		Map map=new HashMap();
		map.put("data", generalService.delete_fangyuan_Num(num));
		map.put("code", 200);
		return map;
	}
	
	
	
	@CrossOrigin
	@GetMapping("/get_fangyuan_info_fromid")
	@ApiOperation("通过搜索id获取房源信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="num",value="房源的id",required=true)
	})
	//后端-李泽霖
	//已验证通过
	public Map get_fangyuan_info_fromid(String num) {
		Map map=new HashMap();
		map.put("data", generalService.get_fangyuan_info_fromid(num));
		map.put("code", 200);
        return map;
    }
	
	
	
	
	@CrossOrigin
	@GetMapping("/list_fangyuanqq")
	@ApiOperation("获取所有房源请求信息")
	//后端-李泽霖
	public Map get_all_fangyuanqq_info() {
		Map map=new HashMap();
		map.put("data", generalService.get_all_fangyuanqq_info());
		map.put("code", 200);
		return map;
	}
	
	
	@CrossOrigin
	@GetMapping("/get_fangdong_info_from_fangyuanid")
	@ApiOperation("通过搜索房源id获取 房东信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name="num",value="房源的id",required=true)
	})
	//后端-李泽霖
	public Map get_fangdong_info_from_fangyuanid(String num) {
		Map map=new HashMap();
		map.put("data", generalService.get_fangdong_info_from_fangyuanid(num));
		map.put("code", 200);
        return map;
    }
	
	
	
	
	@CrossOrigin
	@GetMapping("/get_kanfangqq_by_fangyuanid")
	@ApiOperation("根据房源id获取是否有和此房源相关的看房申请，并且是待审核状态")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="编号",required=true)
	})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map get_kanfangqq_by_fangyuanid(String id) {
		Map map=new HashMap();
		map.put("data", generalService.get_kanfangqq_by_fangyuanid(id));
		map.put("code", 200);
		return map;
	}
	
	
	
	@CrossOrigin
	@GetMapping("/get_heyue_by_fangyuanid")
	@ApiOperation("根据房源id获取是否有和此房源相关的合约，并且是待审核状态")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="编号",required=true)
	})
	//后端-冯朔
	//已验证通过(未验证通过)
	public Map get_heyue_by_fangyuanid(String id) {
		Map map=new HashMap();
		map.put("data", generalService.get_heyue_by_fangyuanid(id));
		map.put("code", 200);
		return map;
	}
}
