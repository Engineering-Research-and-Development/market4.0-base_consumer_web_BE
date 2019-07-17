package it.eng.idsa.base.consumer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.eng.idsa.base.consumer.domain.MessageIDS;

@Service
@Transactional
public class MessageService {
	
	private static int id=0;
	
	private List<MessageIDS> messages = new ArrayList<>();
	
	public List<MessageIDS> getMessages(){
		return messages;
	}
	
	public void putMessage(String textMessage) {
		MessageIDS newMessage = new MessageIDS();
		newMessage.setId(++id);
		newMessage.setText(textMessage);
		messages.add(newMessage);
	}

}
