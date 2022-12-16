package Task1.b;

//

public class SendMail
{
    EmailService emailService = new EmailService();

    public void SendEmail(String subject, String body, String to, String from, String cc)
    {
         emailService.Send(subject, body, to, from, cc);
    }

}


