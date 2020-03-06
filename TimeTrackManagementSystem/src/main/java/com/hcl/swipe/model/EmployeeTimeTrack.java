package com.hcl.swipe.model;

import java.util.Date;

public class EmployeeTimeTrack {

	private int tid;
	private String name;
	private Date date ;
	private String status;
	private Date swipein;
	private Date swipeout;
	private int eid;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getSwipein() {
		return swipein;
	}
	public void setSwipein(Date swipein) {
		this.swipein = swipein;
	}
	public Date getSwipeout() {
		return swipeout;
	}
	public void setSwipeout(Date swipeout) {
		this.swipeout = swipeout;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + eid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((swipein == null) ? 0 : swipein.hashCode());
		result = prime * result + ((swipeout == null) ? 0 : swipeout.hashCode());
		result = prime * result + tid;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeTimeTrack other = (EmployeeTimeTrack) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (eid != other.eid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (swipein == null) {
			if (other.swipein != null)
				return false;
		} else if (!swipein.equals(other.swipein))
			return false;
		if (swipeout == null) {
			if (other.swipeout != null)
				return false;
		} else if (!swipeout.equals(other.swipeout))
			return false;
		if (tid != other.tid)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "EmployeeTimeTrack [tid=" + tid + ", name=" + name + ", date=" + date + ", status=" + status
				+ ", swipein=" + swipein + ", swipeout=" + swipeout + ", eid=" + eid + "]";
	}
	
	
	}
