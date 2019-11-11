package facortyXml;

import javax.xml.parsers.*;
import org.xml.sax.XMLReader;

public class GetFacortyFromXmlFile{
    public static void main(String args[]) throws Exception {

        // Tworzenie parsera
        SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        SAXParser saxParser = spf.newSAXParser();
        XMLReader parser = saxParser.getXMLReader();

        // Tworzenie klasy Handler
        Handler handler = new Handler();
        parser.setContentHandler(handler);

        // Zaczęćie parsowania dokumentu
        parser.parse("C:\\Projects\\OperationOnXmlFile\\src\\main\\java\\facortyXml\\resource\\factory.xml");
    }
}
