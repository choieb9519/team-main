package org.zerock.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.zerock.domain.CBCriteria;
import org.zerock.domain.CBoardVO;

public interface CBoardService {

	//게시글 저장 
	public void cbregister(CBoardVO cboard);
	

	//게시글 저장 + 파일 저장 
	public void cbfregister(CBoardVO cboard, MultipartFile file);
	
	//게시글 읽어오기 
	public CBoardVO getcb(Long bno);

	
	//마이페이지 게시글 리스트 가져오기 
	public List<CBoardVO> getcbList(String writer);
	
	//게시글 리스트 가져오기 
	public List<CBoardVO> getcbList(CBCriteria cri);
	
	//게시글 총 갯수
	public int getcbToal(CBCriteria cri);
	
	
	
	//게시글 수정 
	public boolean cbmodify(CBoardVO cboard);
	
	
	//게시글 파일 수정
	public boolean cbfmodify(CBoardVO cboard, MultipartFile file);
	
	//게시글 삭제 
	public boolean cbremove(Long bno);
}
