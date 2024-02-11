package ssg.com.a.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ssg.com.a.dto.BbsDto;
import ssg.com.a.dto.FreeBbsDto;
import ssg.com.a.dto.FreeBbsParam;
import ssg.com.a.service.FreeBbsService;

@Controller
public class FreeBbsController {

	@Autowired
	FreeBbsService service;

	@GetMapping("freebbslist.do")
	public String freeBbsList(Model model, FreeBbsParam param) {
		System.out.println("FreeBbsController freeBbsList " + new Date());

		// 글 목록
		List<FreeBbsDto> list = service.freeBbsList(param);

		// 글 총수
		int count = service.allFreeBbs(param);

		// 페이지 계산
		int pageBbs = count / 10;
		if ((count % 10) > 0) {
			pageBbs = pageBbs + 1;
		}

		model.addAttribute("list", list);
		model.addAttribute("pageBbs", pageBbs);
		model.addAttribute("param", param);

		return "freebbs/freebbslist";
	}

	@GetMapping("freebbswrite.do")
	public String freeBbsWrite() {
		System.out.println("FreeBbsController freeBbsWrite " + new Date());

		return "freebbs/freebbswrite";
	}

	@PostMapping("freebbswriteAf.do")
	public String freeBbsWriteAf(FreeBbsDto dto, Model model) {
		System.out.println("FreeBbsController freeBbsWriteAf " + new Date());

		boolean b = service.writeFreeBbs(dto);
		String freebbswriteMsg = "FREEBBSWRITE_SUCCESS";
		if (!b) {
			freebbswriteMsg = "FREEBBSWRITE_FAIL";
		}

		model.addAttribute("freebbswriteMsg", freebbswriteMsg);

		return "message";

		// Controller에서 controller 이동
		// redirect == sendRedirect
		// return "redirect:/bbslist.do";
	}

	@GetMapping("freebbsdetail.do")
	public String freeBbsDetail(int seq, Model model) {
		System.out.println("FreeBbsController freeBbsDetail " + new Date());

//		int seq = Integer.parseInt(req.getParameter("seq"));

		// 접속한 이력을 조사 !참고!
		// 조회수 증가
		// service.readcount(seq);

		FreeBbsDto dto = service.getFreeBbs(seq);

		model.addAttribute("dto", dto);

		return "freebbs/freebbsdetail";
	}

	@GetMapping("freebbsupdate.do")
	public String freebbsUpdate(@RequestParam int seq, Model model) {
		System.out.println("FreeBbsController bbsUpdate " + new Date());

		FreeBbsDto dto = service.getFreeBbs(seq);

		model.addAttribute("dto", dto);

		return "freebbs/freebbsupdate";
	}

	@PostMapping("freebbsupdateaf.do")
	public String freeBbsUpdateAf(HttpServletRequest req, Model model) {
		System.out.println("FreeBbsController freeBbsUpdateAf " + new Date());

		int seq = Integer.parseInt(req.getParameter("seq"));
		String title = req.getParameter("title");
		String content = req.getParameter("content");

		FreeBbsDto updateDto = new FreeBbsDto(seq, title, content);

		boolean b = service.freeBbsUpdate(updateDto);

		String freebbsupdateMsg = "FREEBBS_UPDATE_SUCCESS";
		if (!b) {
			freebbsupdateMsg = "FREEBBS_UPDATE_SUCCESS";
		}

		model.addAttribute("freebbsupdateMsg", freebbsupdateMsg);

		return "message";
	}

	@GetMapping("freebbsdelete.do")
	public String freeBbsDelete(HttpServletRequest req, Model model) {
		System.out.println("FreeBbsController freeBbsDelete " + new Date());

		int seq = Integer.parseInt(req.getParameter("seq"));
		
		boolean b = service.freeBbsDelete(seq);

		String freebbsdeleteMsg = "FREEBBS_DELETE_SUCCESS";
		if (!b) {
			freebbsdeleteMsg = "FREEBBS_DELETE_FAIL";
		}

		model.addAttribute("freebbsdeleteMsg", freebbsdeleteMsg);

		return "message";
	}
}