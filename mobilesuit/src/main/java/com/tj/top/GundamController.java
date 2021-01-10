package com.tj.top;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tj.top.service.GundamService;
import com.tj.top.vo.GundamVo;

@Controller
public class GundamController {

	private static final Logger log = LoggerFactory.getLogger(GundamController.class);

	@Autowired
	GundamService gservice;

	@RequestMapping("/")
	public String indexView(Model model) {
		model.addAttribute("salesList", gservice.salesList());
		System.out.println(gservice.salesList());
		return "index";
	}

	@RequestMapping("json")
	public @ResponseBody List<GundamVo> json() {
		List<GundamVo>  list = gservice.salesList();
		return list;
	}

}
