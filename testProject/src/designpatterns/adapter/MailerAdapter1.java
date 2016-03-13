package designpatterns.adapter;

/**
 * 
 * We want to implement a functionality to send mail, we want to introduce an already exist 3rd jar to help us. OutMaile.sendMail is a choice,
 *  but we have already defined an interface to reached our goal. but the 3rd jar interface is not compliance to our interface(not compatible or consistent).
 * We create an adapter to wrap the 3rd class OutMailer.sendMail(). 
 * 
 *  
 * @author Ankai Liu
 *
 */
public class MailerAdapter1 implements IMailer {

	OutMailer om = new OutMailer();

	@Override
	public void sendOurMail() {
		om.sendMail();
	}

}
