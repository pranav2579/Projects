package com.cleartax.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lhs {

	@Override
	public String toString() {
		return "Lhs [op=" + op + ", lhs=" + lhs + "]";
	}

	@SerializedName("op")
	@Expose
	private String op;
	@SerializedName("lhs")
	@Expose
	private Integer lhs;
	@SerializedName("rhs")
	@Expose
	private Rhs rhs;

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public Integer getLhs() {
		return lhs;
	}

	public void setLhs(Integer lhs) {
		this.lhs = lhs;
	}

	public Rhs getRhs() {
		return rhs;
	}

	public void setRhs(Rhs rhs) {
		this.rhs = rhs;
	}

}