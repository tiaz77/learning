package assignement.seminar.second;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class SeminarTest {

	@Test
	public void test() {
		PlainSeminarPrinter printer = new PlainSeminarPrinter();
		Seminar seminar = new Seminar(printer);
		seminar.render();
		assertEquals("Seminar: Math 2\nDescription: Math Level 1\nLocation: Mendrisio\nSeats left: 18\nStundent: Mattia Cattaneo 12.02.2015\nStundent: Enrico Mazzi 14.02.2015\n", printer.getResult());
	}
	
	@Test
	public void testHtml() {
		HtmlSeminarPrinter printer = new HtmlSeminarPrinter();
		Seminar seminar = new Seminar(printer);
		seminar.render();
		assertEquals("<html>\n"
				+ "<head>\n\t<title>Math</title>\n</head>\n"
				+ "<body>\n"
				+ "\t<div>Math 2:</div>\n"
				+ "\t<ul>\n"
				+ "\t\t<li>Math Level 1</li>\n"
				+ "\t\t<li>Mendrisio</li>"
				+ "\t\t<li>18</li>"
				+ "\t</ul>\n"
				+ "<div>partecipanti:</div>\n"
				+ "\t<ul>\n"
				+ "\t\t<li>Mattia Cattaneo</li>\n"
				+ "\t\t<li>Enrico Mazzi</li>\n"
				+ "\t</ul>\n"
				+ "\t</body>\n"
				+ "</html>", printer.result());
	}
	
	@Test
	public void testCsv() throws FileNotFoundException {
		CsvSeminarPrinter printer = new CsvSeminarPrinter();
		Seminar seminar = new Seminar(printer);
		seminar.render();
		File result = printer.result();
		
		Scanner scanner = new Scanner(result);
		
		assertEquals("Math.csv", result.getName());
		assertEquals("\"2\";\"Math\";\"Math Level 1\";\"Mendrisio\";\"18\"", scanner.nextLine());
		assertEquals("\"Mattia\";\"Cattaneo\"", scanner.nextLine());
		assertEquals("\"Enrico\";\"Mazzi\"", scanner.nextLine());
		
		scanner.close();
	}
	

}
