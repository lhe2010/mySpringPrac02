package com.spring.springPrac02.dao;

import java.util.List;

import com.spring.springPrac02.dto.BoardDTO;

public interface BoardDAO {

	public void makeDummyData(List<BoardDTO> dummyDataList) throws Exception;
	public List<BoardDTO> getSimpleBoard() throws Exception;
	
}
