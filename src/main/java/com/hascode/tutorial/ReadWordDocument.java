package com.hascode.tutorial;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class ReadWordDocument {

	public static void main(final String[] args) throws IOException {
		try (FileInputStream file = new FileInputStream(new File(ReadWordDocument.class.getClassLoader().getResource("sample.docx").getFile()))) {
			XWPFDocument doc = new XWPFDocument(file);
			for (XWPFParagraph p : doc.getParagraphs()) {
				System.out.println(p.getText());
			}
		}
	}

}
