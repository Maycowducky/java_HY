package kr.kh.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// method = {RequestMethod.GET,RequestMethod.POST} ����ص� �ǰ� �����ص� �ǰ�
	@RequestMapping(value = "/")
	public String home(Model model) {
		// ȭ�鿡 �����͸� �����ϴ� ����� model�� ��Ƽ� ����
		// model.addAttribute("ȭ�鿡�� ����� �̸�", ������ ��);
		model.addAttribute("name", "abc");
		return "home";
	}
	
	@RequestMapping(value = "/test1")
	public String test1(Model model, String id, Integer age) {
		System.out.println("���̵�: " + id);
		System.out.println("����: " + age);
		return "test1";
	}
	
}
