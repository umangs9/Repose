package hello;

import hello.Greeting;

import java.util.List;
import java.util.Map;

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
		String sql = "insert into temp(id,name, path) values("+gModel.getId()+",'"+gModel.getContent()+"','"+gModel.getPath()+"')";
		jdbcTemplate.execute(sql);
		String sql2 = "select * FROM temp";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql2);
		for (Map<String, Object> row : list) {
			System.out.println("Data from database");
			System.out.println(row.get("id") + " " + row.get("name") + " " + row.get("path"));
		}
		return "index";
	}

}
