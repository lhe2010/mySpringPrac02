package com.spring.springPrac02.service;

import java.util.List;

import com.spring.springPrac02.dto.BoardDTO;

public interface BoardService {

	public void makeDummyData() throws Exception;
	public List<BoardDTO> getSimpleBoard() throws Exception;
	public void insertBoard(BoardDTO bdto) throws Exception;
	public BoardDTO getOneBoard(int num) throws Exception;
	public BoardDTO readOneBoard(int num) throws Exception;
}
