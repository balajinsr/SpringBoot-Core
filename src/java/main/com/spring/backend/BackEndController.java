package com.spring.backend;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.bean.Employee;

@Controller
@RequestMapping("/test")
public class BackEndController {
	@RequestMapping(method = RequestMethod.GET, value = "getInfo", produces = "application/json")
	public @ResponseBody Object getClientInfo(HttpServletRequest request, @RequestParam("clientCode") String clientCode, @RequestParam("langCode") String langCode) {
		Employee employee = new Employee();
		employee.setFirstName("Balaji");
		employee.setLastName("Nandarapu");
		return employee;
	}
}
