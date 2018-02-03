package hello;

import hello.Greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@ComponentScan
@Controller
public class GreetingController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping("/hello")
	public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	//@GetMapping
	@RequestMapping("/")
	public String greetingForm(Model model) {
		model.addAttribute("greeting", new Greeting());
		return "greeting";
	}

	@RequestMapping("/greeting")
	public String greetingSubmit(@ModelAttribute Greeting gModel) {
		System.out.println(gModel.getId()+" "+gModel.getContent()+" "+gModel.getPath());
		String sql = "insert into temp(id,name, path) values("+gModel.getId()+","+gModel.getContent()+","+gModel.getPath()+")";
		jdbcTemplate.execute(sql);
		return "index";
	}

}
