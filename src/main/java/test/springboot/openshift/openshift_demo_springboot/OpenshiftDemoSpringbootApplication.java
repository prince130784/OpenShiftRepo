package test.springboot.openshift.openshift_demo_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OpenshiftDemoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftDemoSpringbootApplication.class, args);
	}
	
}

@RestController
class HomeController{
	
	@GetMapping("/")
	public String response(){
		return "Hello Ravinderjeet!! Welcome to your first Cloup App";
	}
}
