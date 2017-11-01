import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


public class XPathQueryExample {

    public static void main(String[] args) throws XPathExpressionException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder;
        Document doc = null;
        try {
            builder = factory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader("<bch:BCHOrderResponse xmlns:bch=\"urn:cgi.com:/bchorderResponse\"><responseheader><sourceOrderRequestId><orderReferenceId>L87Z53W4</orderReferenceId><version>1</version></sourceOrderRequestId></responseheader><responseDetails><success><ResponseId>58475</ResponseId><ProcessedDateTime>Mon Oct 23 22:08:09 EDT 2017</ProcessedDateTime></success></responseDetails></bch:BCHOrderResponse>"));
            doc = builder.parse(is);
            //doc = builder.parse("src/main/resources/employees.xml");

            // Create XPathFactory object
            XPathFactory xpathFactory = XPathFactory.newInstance();

            // Create XPath object
            XPath xpath = xpathFactory.newXPath();
            
            //create XPathExpression object
            XPathExpression expr =
                xpath.compile("//orderReferenceId/text()");
            //evaluate expression result on XML document
            NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
            System.out.println(nodes.item(0).getNodeValue());
//            String name = getEmployeeNameById(doc, xpath, 4);
//            System.out.println("Employee Name with ID 4: " + name);
//
//            List<String> names = getEmployeeNameWithAge(doc, xpath, 30);
//            System.out.println("Employees with 'age>30' are:" + Arrays.toString(names.toArray()));
//
//            List<String> femaleEmps = getFemaleEmployeesName(doc, xpath);
//            System.out.println("Female Employees names are:" +
//                    Arrays.toString(femaleEmps.toArray()));

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }


    private static List<String> getFemaleEmployeesName(Document doc, XPath xpath) {
        List<String> list = new ArrayList<>();
        try {
            //create XPathExpression object
            XPathExpression expr =
                xpath.compile("/Employees/Employee[gender='Female']/name/text()");
            //evaluate expression result on XML document
            NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodes.getLength(); i++)
                list.add(nodes.item(i).getNodeValue());
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return list;
    }


    private static List<String> getEmployeeNameWithAge(Document doc, XPath xpath, int age) {
        List<String> list = new ArrayList<>();
        try {
            XPathExpression expr =
                xpath.compile("/Employees/Employee[age>" + age + "]/name/text()");
            NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodes.getLength(); i++)
                list.add(nodes.item(i).getNodeValue());
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return list;
    }


    private static String getEmployeeNameById(Document doc, XPath xpath, int id) {
        String name = null;
        try {
            XPathExpression expr =
                xpath.compile("/Employees/Employee[@id='" + id + "']/name/text()");
            name = (String) expr.evaluate(doc, XPathConstants.STRING);
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }

        return name;
    }

}