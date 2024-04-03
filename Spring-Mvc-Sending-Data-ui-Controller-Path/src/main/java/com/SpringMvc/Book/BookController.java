package com.SpringMvc.Book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.websocket.server.PathParam;

@Controller
public class BookController {

	@GetMapping(value = "/price/{bname}/{aname}")     // must be same as PATHPARAM
	
	public String getBookname(@PathParam("bname")String bname,@PathParam("aname")String aname,Model model) {
		
		String msgtxt = aname +" " + bname +  "Price is 600 $ " ;
		
		model.addAttribute("msgs", msgtxt);
		
		return "Index";
	}
}
