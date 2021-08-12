package com.spring.springPrac02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.springPrac02.dto.BoardDTO;
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
	
	@RequestMapping(value = "/boardWrite", method = RequestMethod.GET)
	public String boardWrite() throws Exception {
		return "boardPrac02/bWrite";		
	}
	
//	@RequestMapping(value = "/boardWrite", method = RequestMethod.POST)
//	public String boardWrite(Model model, BoardDTO bdto) throws Exception {
//		boardService.insertBoard(bdto);
//		return "redirect:simpleBoardList";
//	}
	
//	@RequestMapping(value = "/boardInfo")
//	public String boardInfo(@RequestParam("num") int num, Model model) throws Exception{
//		model.addAttribute("bdto", boardService.readOneBoard(num));
//		return "boardPrac02/bInfo"; 
//	}
	
	
}
