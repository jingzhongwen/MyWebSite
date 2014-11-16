package www.jzw.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/first")
	public String first()
	{
		return "first";
	}
}
