package it.eng.idsa.base.consumer.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.eng.idsa.base.consumer.domain.MessageIDS;
import it.eng.idsa.base.consumer.service.MessageService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({ "/message" })
public class MessageResource {
	
	@Autowired
	MessageService messageService;

	@GetMapping(produces = "application/json")
	public List<MessageIDS> getMessages() {
		return messageService.getMessages();
	}
	
	@PostMapping
	public void putMessage(@RequestBody String textMessage) {
		messageService.putMessage(textMessage);
	}

}
