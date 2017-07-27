package com.hxhui.sl.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hxhui.sl.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Resource
	private TestService testService;
	@RequestMapping("/test.do")
	public @ResponseBody Map<String, Object> doController(HttpServletRequest request,Model model){
		System.out.println("doController");
		Map<String, Object>params=new HashMap<String, Object>();
		params.put("id", 1);
		params.put("name", "hxhui");
		int id=testService.doService(params);
		
		Map<String, Object>result=new HashMap<>();
		result.put("errCode", params.get("id"));
		result.put("errMsg", "errMsg");
		return result;
	}
}
