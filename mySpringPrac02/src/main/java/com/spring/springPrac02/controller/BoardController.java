package com.spring.springPrac02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.springPrac02.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/")
	public String main() {
//		return "redirect:boardList";
		return "redirect:simpleBoardList";
	}
	
	@RequestMapping(value = "/makeDummyData")
	public String makeDummyData() throws Exception {
		boardService.makeDummyData();
		return "boardPrac02/bList";
	}
	
	@RequestMapping(value = "/simpleBoardList")
	public String getSimpleBoard(Model model) throws Exception {
		model.addAttribute("boardList", boardService.getSimpleBoard());
		return "boardPrac02/bSimpleList";
	}
	
	
}
