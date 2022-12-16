package Task1.b;



public class UrgentSendMail
{
    EmailService emailService = new EmailService();

    public void SendEmailUrgently(String subject, String body, String to, String from, String cc, Boolean sendImmediately)
    {
        emailService.Send_immediately(subject, body, to, from, cc, sendImmediately);
    }

}
