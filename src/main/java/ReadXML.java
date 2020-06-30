import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;

public class ReadXML {

    public ArrayList<Mp3Song> Read() {
        ArrayList<Mp3Song> songs = new ArrayList<Mp3Song>();
        try {

            File fXmlFile = new File("Songs.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("song");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    songs.add
                    (
                        new Mp3Song
                        (
                                eElement.getAttribute("title"),
                                Integer.parseInt(eElement.getAttribute("length")),
                                Integer.parseInt(eElement.getAttribute("size"))
                        )
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return songs;
    }
}