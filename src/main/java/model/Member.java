package model;

import java.io.Serializable;

public class Member implements Serializable {
	private String name; // ユーザー名
	private String pass; // パスワード
	private String id;
	public Member() {
	}

	public Member(String name, String pass,String id) {
		this.name = name;
		this.pass = pass;
		this.id = id;
	}
	public Member(String id,String pass) {
		this.id = id;
		this.pass = pass;

	}
	
	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}
	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setId(String id) {
		this.id = id;
	}
}