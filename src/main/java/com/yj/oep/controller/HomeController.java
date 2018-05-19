package com.yj.oep.controller;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YJ
 * @date 2018年5月19日 上午7:51:32
 * @描述 主页跳转
 */
@Controller
public class HomeController {
	@RequestMapping(value = { "/index", "/index.html", "/index.htm" })
	public String hello() {
		return "index";
	}
}
