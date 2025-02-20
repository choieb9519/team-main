package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.CBCriteria;
import org.zerock.domain.CBoardVO;
import org.zerock.domain.UserVO;

public interface CBoardMapper {

	
	
	
	//게시물 저장 
	public int cbinsertSelectKey(CBoardVO cboard);
	
	//게시물 읽어오기 
	public CBoardVO readcb(long bno);
	
	//게시물 리스트 불러오기 
	public List <CBoardVO> getcbList(String writer);
	
	//게시물 리스트 불러오기 (페이징 )
	public List <CBoardVO> getcbListWithPaging(CBCriteria cri);
	
	//게시물 총 갯수(페이징하기위해서 )
	public int getcbTotalCount(CBCriteria cri);
	
	//게시물 지우기 
	public int cbdelete(long bno);
	
	//게시물 지우기 - 회원탈퇴시 
	//public void cbremoveUserid(UserVO vo);
	
	//게시물 수정 
	public int cbupdate(CBoardVO cboard);

	public List<Long> listCBoardBno(String userid);
	
}
