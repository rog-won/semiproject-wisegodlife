package ssg.com.a.dao;

import java.util.List;

import ssg.com.a.dto.BbsComment;
import ssg.com.a.dto.BbsDto;
import ssg.com.a.dto.CalendarDto;
import ssg.com.a.dto.CalendarParam;
import ssg.com.a.dto.FriendDto;
import ssg.com.a.dto.MyblacklistDto;

public interface MypageDao {
	
	// 월별 일정 보기
	List<CalendarDto> getCalendarList(CalendarParam calpa);
	
	// 내가 쓴 댓글 및 게시글 보기
	List<BbsComment> getMyCommentList(String id);
	List<BbsDto> getMyWriteList(String id);
	
	// 블랙리스트
	void addBlacklistId(MyblacklistDto dto);
	void addBlacklistWord(MyblacklistDto dto);
	List<MyblacklistDto> getMyBlacklist(String id);
	
	// 개인정보변경
	int changeMyinfor(FriendDto dto);
	FriendDto changelogin(FriendDto dto);

	// 회원탈퇴
	int closeAccount(String id);
	
	// 학과일정
	void addCalendarWrite(CalendarDto dto);
	CalendarDto calendarDetail(int seq);
	void mycalupdateAf(CalendarDto dto);
	void mycaldelete(int seq);
}
