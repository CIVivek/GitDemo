package org.pdf.compare.PDFCompare;

import java.io.IOException;

import de.redsix.pdfcompare.PdfComparator;

public class Test1 {
	public static void main(String[] args) throws IOException {
		String file1="C:\\Users\\9500530\\Desktop\\QAProposal\\Manager letter updated.pdf";
		String file2="C:\\Users\\9500530\\Desktop\\QAProposal\\Manager letter updated1.pdf";
		String resultFile="C:\\Users\\9500530\\Desktop\\QAProposal\\Results\\result";
		//new PdfComparator("expected.pdf", "actual.pdf").compare().writeTo("diffOutput");
		//red for expected and green for actual
		//to find specific area in pdf, we can downloaf very pdf to text
		boolean isEquals = new PdfComparator(file1, file2).withIgnore("ignore.conf").compare().writeTo(resultFile);
		if (!isEquals) {
		    System.out.println("Differences found!");
		}
	}

}
