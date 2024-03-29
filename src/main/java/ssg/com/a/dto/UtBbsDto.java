package ssg.com.a.dto;

import java.io.Serializable;

// Personal Data Store
public class UtBbsDto implements Serializable{

	private int seq;
	private String id;
	private String title;
	private String content;
	
	private String filename;	//원본 파일명 abc.txt, bcd.jsp
	private String newfilename; //업로드 파일명 2342342423.txt
	
	private int readcount;
	private int trsuccess; 		//중고거래 완료
	private String regdate;
	
	//답글 필요한 경우
	//ref, step, depth
	public UtBbsDto() {
	}

	public UtBbsDto(int seq, String id, String title, String content, String filename, String newfilename, int readcount, int trsuccess,
			String regdate) {
		super();
		this.seq = seq;
		this.id = id;
		this.title = title;
		this.content = content;
		this.filename = filename;
		this.newfilename = newfilename;
		this.readcount = readcount;
		this.trsuccess = trsuccess;
		this.regdate = regdate;
	}

	public UtBbsDto(String id, String title, String content, String filename) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.filename = filename;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getNewfilename() {
		return newfilename;
	}

	public void setNewfilename(String newfilename) {
		this.newfilename = newfilename;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	
	public int getTrsuccess() {
		return trsuccess;
	}

	public void setTrsuccess(int trsuccess) {
		this.trsuccess = trsuccess;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "UtBbsDto [seq=" + seq + ", id=" + id + ", title=" + title + ", content=" + content + ", filename="
				+ filename + ", newfilename=" + newfilename + ", readcount=" + readcount + ", trsuccess=" + trsuccess
				+ ", regdate=" + regdate + "]";
	}
}
