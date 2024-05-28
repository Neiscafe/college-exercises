package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Main {
    public static void main(String[] args) {
        Document doc;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document dom = db.newDocument();
            Element rootEle = dom.createElement("fruta");
            Element e = dom.createElement("sabor");
            e.appendChild(dom.createTextNode("sabor"));
            rootEle.appendChild(e);
            dom.appendChild(rootEle);
            try {
                Transformer tr = TransformerFactory.newInstance().newTransformer();
                tr.setOutputProperty(OutputKeys.INDENT, "yes");
                tr.setOutputProperty(OutputKeys.METHOD, "xml");
                tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
                tr.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "roles.dtd");
                tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
    
                // send DOM to file
                tr.transform(new DOMSource(dom), 
                                     new StreamResult(new FileOutputStream(xml)));
    
            } catch (TransformerException te) {
                System.out.println(te.getMessage());
            } 
        }catch(Exception e){
            
        }
    }
}