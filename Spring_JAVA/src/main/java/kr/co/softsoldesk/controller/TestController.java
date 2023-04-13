package kr.co.softsoldesk.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;
import kr.co.softsoldesk.beans.DataBean3;
import kr.co.softsoldesk.beans.DataBean4;

@Controller
public class TestController {

	// DataBean1
	@Autowired
	DataBean1 applicationBean1;
	
	// DataBean2
	@Resource(name = "applicationBean2")
	DataBean2 applicationBean2;
	
	//DataBean3
	@Autowired
	DataBean3 applicationBean3;
	
	//DataBean4
	@Resource(name = "applicationBean4")
	DataBean4 applicationBean4; 
	
	@GetMapping("/test1")
	public String test1() {
		//DataBean1
		applicationBean1.setData1("5월 첫주에 멘토링");
		applicationBean1.setData2("5월 12일 프로젝트 발표 폭망");
		//DataBean2
		applicationBean2.setData3("이력서 광탈");
		applicationBean2.setData4("6월 한강");
		//DataBean3
		applicationBean3.setData5("4월");
		applicationBean3.setData6("목요일");
		//DataBean4
		applicationBean4.setData7("5월");
		applicationBean4.setData8("ㅂㅂ");
		
		

		return "test1";
	}

	@GetMapping("/result1")
	public String result1(Model model) {
		
		System.out.println("applicationBean1.data1 : " + applicationBean1.getData1());
		System.out.println("applicationBean1.data2 : " + applicationBean1.getData2());
		
		System.out.println("applicationBean2.data3 : " + applicationBean2.getData3());
		System.out.println("applicationBean2.data4 : " + applicationBean2.getData4());
		
		System.out.println("applicationBean3.data5 : "+applicationBean3.getData5());
		System.out.println("applicationBean3.data6 : "+applicationBean3.getData6());
		
		System.out.println("applicationBean4.data7 : "+applicationBean4.getData7());
		System.out.println("applicationBean4.data8 : "+applicationBean4.getData8());
		
		model.addAttribute("applicationBean1",applicationBean1);
		model.addAttribute("applicationBean2",applicationBean2);
		model.addAttribute("applicationBean3",applicationBean3);
		model.addAttribute("applicationBean4",applicationBean4);
		
		return "result1";
	}
}