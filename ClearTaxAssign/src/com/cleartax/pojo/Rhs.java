package com.cleartax.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rhs {

	@SerializedName("op")
	@Expose
	private String op;
	@SerializedName("lhs")
	@Expose
	private String lhs;
	@SerializedName("rhs")
	@Expose
	private Integer rhs;

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public String getLhs() {
		return lhs;
	}

	public void setLhs(String lhs) {
		this.lhs = lhs;
	}

	public Integer getRhs() {
		return rhs;
	}

	public void setRhs(Integer rhs) {
		this.rhs = rhs;
	}

	@Override
	public String toString() {
		return "Rhs [op=" + op + ", lhs=" + lhs + ", rhs=" + rhs + "]";
	}

}