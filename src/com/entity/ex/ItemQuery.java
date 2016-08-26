/**
 * @description 条件查询
 * @date 2016-8-22
 * @author hxg	
 */
package com.entity.ex;

import java.util.List;

import org.apache.commons.lang.StringUtils;

public class ItemQuery {
	private int pc = 1;// 当前页
	private int ps;// 每页 记录数
	private String sPs;
	private int start;
	private String byGName;
	private String byUName;
	private String ugname;
	private List<Integer> uIds;

	public void init() {
		if (pc<=0) {
			pc=1;
		}
		ps = obtainPs();
		start = obtainStart();
	}

	public int obtainPs() {
		if (StringUtils.isEmpty(sPs)) {
			return Integer.parseInt("4");
		}
		return Integer.parseInt(sPs);
	}

	public int obtainStart() {
		return (pc - 1) * ps;
	};

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getPs() {
		return ps;
	}

	public String getsPs() {
		return sPs;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public void setsPs(String sPs) {
		this.sPs = sPs;
	}

	public List<Integer> getuIds() {
		return uIds;
	}

	public void setuIds(List<Integer> uIds) {
		this.uIds = uIds;
	}

	public String getUgname() {
		return ugname;
	}

	public void setUgname(String ugname) {
		this.ugname = ugname;
	}

	public int getPc() {
		return pc;
	}

	public String getByGName() {
		return byGName;
	}

	public String getByUName() {
		return byUName;
	}

	public void setPc(int pc) {
		this.pc = pc;
	}

	public void setByGName(String byGName) {
		this.byGName = byGName;
	}

	public void setByUName(String byUName) {
		this.byUName = byUName;
	}

	@Override
	public String toString() {
		return "ItemQuery [pc=" + pc + ", ps=" + ps + ", sPs=" + sPs
				+ ", start=" + start + ", byGName=" + byGName + ", byUName="
				+ byUName + ", ugname=" + ugname + ", uIds=" + uIds + "]";
	}

}