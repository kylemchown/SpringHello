package helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/")
	public String index() {
		return "Hello World wwgrsth";
	}
	@RequestMapping("/test")
	public String index1() {
		return "Hello World wwgrstgcm,fjhm,h";
	}
}
