import static org.junit.Assert.*; // Import Testing Unit
import org.junit.*; // Import Testing Unit

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class MarkdownParseTest {

    @Test // Mark for setting a JUnit Test
    public void addition() { // Name of the test method
        assertEquals(2, 1 + 1); // Command that checks the expected value and the real output value
    }

    @Test
    public void testGetLinks1() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("https://something.com", 
        "some-page.html"));
    }

    @Test
    public void testGetLinks2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("https://something.com", 
        "some-page.html"));
    }

    @Test
    public void testGetLinks3() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of());
    }

    @Test
    public void testGetLinks4() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of());
    }

    @Test
    public void testGetLinks5() throws IOException{
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of());
    }

    @Test
    public void testGetLinks6() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of());
    } 

    @Test 
    public void testFile7() throws IOException{ 
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of(), links);
    }

    @Test 
    public void testFile8() throws IOException{ 
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of(), links);
    }

    /*
    @Test
    public void testSnippetThree() throws IOException{
        Path fileName = Path.of("snippet_3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expectedLinks = new ArrayList<>(List.of(
            "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"));
        assertEquals(expectedLinks, links);
    }
    */
}