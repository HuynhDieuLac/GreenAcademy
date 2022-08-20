package com.example.storeonline;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("books") // http://localhost:8080/books  --> books : là tên mình tự đặt
public class BooksController {
	
	//http://localhost:8088/books/
	@RequestMapping(value = "/",method = RequestMethod.GET)
	String getBookIndex()
	{
		return "index";
	}
}
