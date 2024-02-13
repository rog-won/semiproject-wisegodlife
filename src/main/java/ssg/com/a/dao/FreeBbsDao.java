package ssg.com.a.dao;

import java.util.List;

import ssg.com.a.dto.FreeBbsDto;
import ssg.com.a.dto.FreeBbsParam;

public interface FreeBbsDao {
	List<FreeBbsDto> freeBbsList(FreeBbsParam param);
	
	int allFreeBbs(FreeBbsParam param);
	
	int writeFreeBbs(FreeBbsDto dto);
	
	FreeBbsDto getFreeBbs(int seq);
	
	int freeBbsUpdate(FreeBbsDto dto);

	int freeBbsDelete(int seq);
	
	// 블랙리스트 불러오기 및 제외 글 불러오기
	FreeBbsParam shareMyBlacklist(String id);
	List<FreeBbsDto> blockBlacklist(FreeBbsParam param);
	int totalfreebbs(FreeBbsParam param);
}
