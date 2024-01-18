package com.example.demo.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class event {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idevent;
	 private String title;
	    private LocalDate start;
		public Long getIdevent() {
			return idevent;
		}
		public void setIdevent(Long idevent) {
			this.idevent = idevent;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public LocalDate getStart() {
			return start;
		}
		public void setStart(LocalDate start) {
			this.start = start;
		}
		public event(Long idevent, String title, LocalDate start) {
			super();
			this.idevent = idevent;
			this.title = title;
			this.start = start;
		}
		public event() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "event [idevent=" + idevent + ", title=" + title + ", start=" + start + "]";
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
