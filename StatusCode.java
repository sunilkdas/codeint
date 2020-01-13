package com.info;

public enum StatusCode {
	ERROR400(){
		
		@Override
		public String getDetail() {
			return "400";
		}
	},
	ERROR500(){
		@Override
		public String getDetail() {
			return "500";
		}
	},
	SUCCESS(){
		@Override
		public String getDetail() {
			return "200";
		}
	},
	SERVERDOWN(){
		@Override
		public String getDetail() {
			return "503";
		}
	};
	
	public abstract String getDetail();
	
	public static void main(String[] args) {
		System.out.println(ERROR400.getDetail());
	}
}
