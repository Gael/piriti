package name.pehl.piriti.client.gwttest.lotteryticket;

import name.pehl.totoe.client.Document;
import name.pehl.totoe.client.XmlParser;

/**
 * @author $Author$
 * @version $Date$ $Revision: 295
 *          $
 */
public class LotteryTicketDnsReaderTest extends AbstractLotteryTicketReaderTest
{
    public void testDns()
    {
        String xml = LotteryTicketResources.INSTANCE.lotteryTicketDns().getText();
        Document document = new XmlParser().parse(xml, LotteryTicketResources.DNS);
        LotteryTicketDns lt = LotteryTicketDns.XML.read(document);
        assertLotteryTicket(lt);
    }


    public void testDnsNns()
    {
        String xml = LotteryTicketResources.INSTANCE.lotteryTicketDnsNns().getText();
        Document document = new XmlParser().parse(xml, LotteryTicketResources.DNS);
        LotteryTicketDns lt = LotteryTicketDns.XML.read(document);
        assertLotteryTicket(lt);
    }
}