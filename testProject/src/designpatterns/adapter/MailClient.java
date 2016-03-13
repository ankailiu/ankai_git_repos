package designpatterns.adapter;

public class MailClient {
	
	public static void main(String [] args){
		IMailer mailer1 = new MailerAdapter();
		mailer1.sendOurMail();
		
		
		IMailer mailer2 = new MailerAdapter1();
		mailer2.sendOurMail();
	}

}
