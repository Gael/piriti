package name.pehl.piriti.client.gwttest.animal;

import name.pehl.totoe.client.Document;
import name.pehl.totoe.client.XmlParser;

/**
 * @author $Author$
 * @version $Revision$
 */
public class XmlAnimalReaderTest extends AbstractAnimalReaderTest
{
    public void testReadBird()
    {
        String xml = AnimalResources.INSTANCE.birdXml().getText();
        Document document = new XmlParser().parse(xml);
        Bird kea = Bird.XML.read(document);
        assertBird(kea);
    }


    public void testReadInsect()
    {
        String xml = AnimalResources.INSTANCE.insectXml().getText();
        Document document = new XmlParser().parse(xml);
        Insect fruitFly = Insect.XML.read(document);
        assertInsect(fruitFly);
    }


    public void testReadCat()
    {
        String xml = AnimalResources.INSTANCE.catXml().getText();
        Document document = new XmlParser().parse(xml);
        Cat snowball = Cat.XML.read(document);
        assertCat(snowball);
    }


    public void testReadDog()
    {
        String xml = AnimalResources.INSTANCE.dogXml().getText();
        Document document = new XmlParser().parse(xml);
        Dog rantanplan = Dog.XML.read(document);
        assertDog(rantanplan);
    }
}