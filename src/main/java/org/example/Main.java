package org.example;

import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        new CumulativeSum().main();
        new PositiveCumulativeSum().main();
        new IdenticalTwins().main();
        new EvenNumberDigits().main();
        new InsertionSort().main();
        new MergeTwoSortedArrays().main();
        new MergeSort().main();
        new MaxConsecutiveOnes().main();
        new ArithmeticSequence().main();
        new LargestContiguous().main();
        new PascalsTriangle().main();
        new RemoveOccurrences().main();
//        try {
//            removeDuplicateLinesFromXml("/Users/abhriya.roy/IdeaProjects/CodingProblems/src/main/java/org/example/input.xml",
//                    "/Users/abhriya.roy/IdeaProjects/CodingProblems/src/main/java/org/example/input2.xml");
//        } catch (TransformerException e) {
//            throw new RuntimeException(e);
//        } catch (ParserConfigurationException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (SAXException e) {
//            throw new RuntimeException(e);
//        }
    }

    public static void removeDuplicateLinesFromXml(String filePath, String filePath2) throws TransformerException, ParserConfigurationException, IOException, SAXException {
        File file1 = new File(filePath); // Your first XML file
        File file2 = new File(filePath2); // Your second XML file

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

        // Parse both XML files
        Document doc1 = dBuilder.parse(file1);
        Document doc2 = dBuilder.parse(file2);

        // Normalize documents
        doc1.getDocumentElement().normalize();
        doc2.getDocumentElement().normalize();

        // Extract string elements
        NodeList list1 = doc1.getElementsByTagName("string");
        NodeList list2 = doc2.getElementsByTagName("string");

        // Iterate over second file's strings and add to the first file if not present
        for (int i = 0; i < list2.getLength(); i++) {
            Node node = list2.item(i);
            NamedNodeMap attributes = node.getAttributes();
            Node nameAttribute = attributes.getNamedItem("name");
            if (nameAttribute != null) {
                String nameValue = nameAttribute.getNodeValue();
                if (!existsInList(nameValue, list1)) {
                    // Import node to first document
                    System.out.println("importing node " + nameValue);
                    Node copiedNode = doc1.importNode(node, true);
                    doc1.getDocumentElement().appendChild(copiedNode);
                }
            }
        }

        // Write the merged content to a new XML file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc1);
        StreamResult result = new StreamResult(new File("mergedStrings.xml"));
        transformer.transform(source, result);
    }

    // Helper method to check if a string with a specific name exists in NodeList
    private static boolean existsInList(String name, NodeList list) {
        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            NamedNodeMap attributes = node.getAttributes();
            Node nameAttribute = attributes.getNamedItem("name");
            if (nameAttribute != null && nameAttribute.getNodeValue().equals(name)) {
                return true;
            }
        }
        return false;
    }
}