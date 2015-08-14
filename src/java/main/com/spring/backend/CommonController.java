package com.spring.backend;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/commonrest")
public class CommonController {
	@RequestMapping(method = RequestMethod.GET, value = "getUserInfo", produces = "application/json")
	public @ResponseBody String getClientInfo(HttpServletRequest request, @RequestParam("clientCode") String clientCode, @RequestParam("langCode") String langCode) {
		return "common-module";
	}
}
