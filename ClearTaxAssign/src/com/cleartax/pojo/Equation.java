package com.cleartax.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Equation {

	@SerializedName("op")
	@Expose
	private String op;
	@SerializedName("lhs")
	@Expose
	private Lhs lhs;
	@SerializedName("rhs")
	@Expose
	private Integer rhs;

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public Lhs getLhs() {
		return lhs;
	}

	public void setLhs(Lhs lhs) {
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
		return "Equation [op=" + op + ", rhs=" + rhs + "]";
	}

}