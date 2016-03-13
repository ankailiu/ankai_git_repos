package designpatterns.adapter;

public class MailerAdapter extends OutMailer implements IMailer {
	

	@Override
	public void sendOurMail() {
		this.sendMail();
	}

}
