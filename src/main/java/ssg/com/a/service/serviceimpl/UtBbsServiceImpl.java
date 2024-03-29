package ssg.com.a.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssg.com.a.dao.UtBbsDao;
import ssg.com.a.dto.UtBbsDto;
import ssg.com.a.dto.UtBbsParam;
import ssg.com.a.service.UtBbsService;

@Service
public class UtBbsServiceImpl implements UtBbsService{

	@Autowired
	UtBbsDao dao;

	@Override
	public List<UtBbsDto> utBbsList(UtBbsParam param) {
		return dao.utBbsList(param);
	}
	
	@Override
	public boolean sumbnail(UtBbsDto dto) {
		int count = dao.sumbnail(dto);
		return count > 0 ? true : false;
	}

	@Override
	public UtBbsDto getUtBbs(int seq) {
		return dao.getUtBbs(seq);
	}

	@Override
	public boolean tradeSuccess(int seq) {
		return dao.tradeSuccess(seq) > 0 ? true : false;
	}

	@Override
	public int allUtBbs(UtBbsParam param) {
		return dao.allUtBbs(param);
	}

	@Override
	public void readCountUtBbs(int seq) {
		dao.readcountUtBbs(seq);
	}
}
