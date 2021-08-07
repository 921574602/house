package com.zr.class3.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zr.class3.model.Menu;
import com.zr.class3.service.GeneralService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/op")
@Api(tags="前端使用的相关接口")
public class OpApi {
	
	@Autowired
	private GeneralService generalService;
	
	
	@CrossOrigin
	@GetMapping("/getmenu")
	@ApiOperation("获取以id_menu位父节点下的所有子节点")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id_menu", value = "父节点id", required = true),
})	
	//前端-程鑫
	public Map getmenu(int id_menu) {
		
		return generalService.get_menu(id_menu);
	}
}
