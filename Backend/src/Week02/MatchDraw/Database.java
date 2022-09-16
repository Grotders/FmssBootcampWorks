package Week02.MatchDraw;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class Database {
    private static final ArrayList<Club> allClubs = new ArrayList<>();

    static {
        getAllClubs();
    }

    public static ArrayList<Club> pickClubs(int howManyClubNeeded) {
        ArrayList<Club> clubs= new ArrayList<>();

        for (int i=0; i < howManyClubNeeded; i++) {
            clubs.add(allClubs.get(i));
        }
        return clubs;
    }

    private static void getAllClubs() {
        try{


        File file = new File("backend\\src\\Week02\\MatchDraw\\clubs.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName("club");

            for (int itr = 0; itr < nodeList.getLength(); itr++) {
                Node node = nodeList.item(itr);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;
                    allClubs.add(new Club(eElement.getElementsByTagName("name").item(0).getTextContent()));
                }
            }
         } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
















