package model;
import java.io.Serializable;

public class Emp implements Serializable{
	private String no ;
	private String name;
	private String address;
	private String tel;
	private String join_date;
	private String dept_name;
	private String roll_name;
	private String boss_no;
	private String boss_name;
	private int retire;

	public Emp(String no,String name,String address,String tel,String join_date,String dept_name,String roll_name,String boss_no,String boss_name) {
		this.no  = no;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.join_date = join_date;
		this.dept_name = dept_name;
		this.roll_name = roll_name;
		this.boss_no = boss_no;
		this.boss_name = boss_name;
	}
	public Emp(String no,String name,String address,String tel,String join_date,String dept_name,String roll_name,String boss_no,String boss_name,int retire) {
		this.no  = no;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.join_date = join_date;
		this.dept_name = dept_name;
		this.roll_name = roll_name;
		this.boss_no = boss_no;
		this.boss_name = boss_name;
		this.retire = retire;
	}
	public Emp() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getJoin_date() {
		return join_date;
	}
	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getRoll_name() {
		return roll_name;
	}
	public void setRoll_name(String roll_name) {
		this.roll_name = roll_name;
	}
	public String getBoss_no() {
		return boss_no;
	}
	public void setBoss_no(String boss_no) {
		this.boss_no = boss_no;
	}
	public String getBoss_name() {
		return boss_name;
	}
	public void setBoss_name(String boss_name) {
		this.boss_name = boss_name;
	}
	
	public int getRetire() {
		return retire;
	}
	public void setRetire(int retire) {
		this.retire = retire;
	}

}
