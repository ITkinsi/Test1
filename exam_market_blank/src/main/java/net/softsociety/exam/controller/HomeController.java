package net.softsociety.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

	/**
	 * ��ǰ�Խ��� ���� ��Ʈ�ѷ�
	 */
	@GetMapping({"","/"})
	public String home() {
		return "home";
	}
	
}
