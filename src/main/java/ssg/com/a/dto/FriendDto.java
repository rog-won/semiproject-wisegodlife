package ssg.com.a.dto;

public class FriendDto {
	
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String email;
	private String college;
	private int auth;
	private int del;
	private String regidate;
	private String salt;
	
	public FriendDto() {
	}

	public FriendDto(String id, String pw, String name, String tel, String email, String college, int auth, int del,
			String regidate, String salt) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.college = college;
		this.auth = auth;
		this.del = del;
		this.regidate = regidate;
		this.salt = salt;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	public String getRegidate() {
		return regidate;
	}

	public void setRegidate(String regidate) {
		this.regidate = regidate;
	}

	@Override
	public String toString() {
		return "FriendDto [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + ", email=" + email
				+ ", college=" + college + ", auth=" + auth + ", del=" + del + ", regidate=" + regidate + ", salt="
				+ salt + "]";
	}
	
}
