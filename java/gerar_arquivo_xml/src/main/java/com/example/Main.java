package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.stream.DoubleStream.DoubleMapMultiConsumer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {
    public static void main(String[] args) {
        readXmlFromD();
    }

    public static void readXmlFromD() {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("D:\\dom.xml"));
            Element root = doc.getDocumentElement();
            NodeList list = doc.getElementsByTagName("sabor");
            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String sabor = element.getTextContent();
                    System.out.println(sabor);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeXmlToD() {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document dom = db.newDocument();
            Element rootEle = dom.createElement("fruta");
            dom.appendChild(rootEle);
            Element e = dom.createElement("sabor");
            e.appendChild(dom.createTextNode("sabor"));
            rootEle.appendChild(e);
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(dom);
            StreamResult result = new StreamResult(new FileOutputStream("D:\\dom.xml"));
            tr.setOutputProperty(OutputKeys.INDENT, "yes");
            tr.setOutputProperty(OutputKeys.METHOD, "xml");
            tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            tr.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "roles.dtd");
            tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            tr.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}