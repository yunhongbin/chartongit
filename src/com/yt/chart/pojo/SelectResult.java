package com.yt.chart.pojo;

import java.util.List;

public class SelectResult<T> {
	private int resultCount;
	private List<T> resultList;
	public int getResultCount() {
		return resultCount;
	}
	public void setResultCount(int resultCount) {
		this.resultCount = resultCount;
	}
	public List<T> getResultList() {
		return resultList;
	}
	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}
	
	
}
