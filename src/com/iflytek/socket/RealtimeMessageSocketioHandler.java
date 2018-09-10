package com.iflytek.socket;

import com.corundumstudio.socketio.annotation.OnConnect;

public class RealtimeMessageSocketioHandler {

	
	@OnConnect
	public void saveKeepInfo() {
		
		System.out.println("what?");
		
	}
}
