package com.devchronicles.observer;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import com.devchronicles.observer.MyEvent;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EventService {
	@Inject
	@MyEvent(MyEvent.Type.LOGGING)
	private String messageA;
	@Inject
	@MyEvent(MyEvent.Type.MESSAGE)
	private String messageB;

	public void startService() {
		System.out.println("Start service call " + messageA);
		System.out.println("Start service call " + messageB);
	}
}