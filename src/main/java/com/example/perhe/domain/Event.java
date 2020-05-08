package com.example.perhe.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long eventid;
	private String member;
	private String name;
	private String time;
	
	@JsonIgnore
	
	public Event() {
		super();
	}

	public Event(Long eventid, String member, String name, String time) {
		super();
		this.eventid = eventid;
		this.member = member;
		this.name = name;
		this.time = time;
	}

	public Long getEventid() {
		return eventid;
	}

	public void setEventid(Long eventid) {
		this.eventid = eventid;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Event [eventid=" + eventid + ", member=" + member + ", name=" + name + ", time=" + time + "]";
	}
	
	

}
