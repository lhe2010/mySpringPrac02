package com.spring.springPrac02.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.springPrac02.dao.BoardDAO;
import com.spring.springPrac02.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO boardDAO;

	@Override
	public void makeDummyData() throws Exception {
		Random ran = new Random();
		List<BoardDTO> dummyDataList = new ArrayList<>();
		String[] wordSet = {"가", "나", "다", "라", "마", "바", "사",
				"아", "자", "차","카","타","파","하"};
		BoardDTO temp = null;
		 
		for (int i = 100; i <= 300; i++) {
			String writer = "";
			String password = "1234";
			String subject = "";
			String email = "";
			String content = "";
			
			for(int j = 0; j < 7; j++) {
				writer += wordSet[ran.nextInt(wordSet.length)];
				subject += wordSet[ran.nextInt(wordSet.length)];
				content += wordSet[ran.nextInt(wordSet.length)];
				
				if(j < 4) {
					email += wordSet[ran.nextInt(wordSet.length)];
				}
			}
			email += "@gmail.com";
			
			temp = new BoardDTO();
			temp.setNum(i);
			temp.setWriter(writer);
			temp.setEmail(email);
			temp.setSubject(subject);
			temp.setPassword(password);
			temp.setRef(i);
			temp.setReLevel(1);
			temp.setReStep(1);
			temp.setReadCount(0);
			temp.setContent(content);
			
			dummyDataList.add(temp);
		}
		boardDAO.makeDummyData(dummyDataList);
	}

	@Override
	public List<BoardDTO> getSimpleBoard() throws Exception {
		return boardDAO.getSimpleBoard();
	}

	@Override
	public void insertBoard(BoardDTO bdto) throws Exception {
		boardDAO.insertBoard(bdto);
	}

	@Override
	public BoardDTO getOneBoard(int num) throws Exception {
		return boardDAO.getOneBoard(num);
	}

	@Override
	public BoardDTO readOneBoard(int num) throws Exception {
		boardDAO.increaseReadCount(num);
		return boardDAO.getOneBoard(num);
	}
}
