import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException {
        assertEquals(List.of("https://something.com", "some-page.html"), 
            MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    }

    @Test
    public void testFile2() throws IOException {
        assertEquals(List.of(), 
            MarkdownParse.getLinks(Files.readString(Path.of("testfile2.md"))));
    }

    @Test
    public void testFile3() throws IOException {
        assertEquals(List.of(), 
            MarkdownParse.getLinks(Files.readString(Path.of("testfile3.md"))));
    }

    @Test
    public void testFile4() throws IOException {
        assertEquals(List.of(), 
            MarkdownParse.getLinks(Files.readString(Path.of("testfile4.md"))));
    }

    @Test
    public void testFile5() throws IOException {
        assertEquals(List.of(), 
        MarkdownParse.getLinks(Files.readString(Path.of("testfile5.md"))));
    }

    @Test 
    public void testSnippet1() throws IOException {
        String contents = Files.readString(Path.of("snippet-1.md"));
        assertEquals(List.of("`google.com", "google.com", "ucsd.edu"), MarkdownParse.getLinks(contents));
    }

    @Test 
    public void testSnippet2() throws IOException {
        String contents = Files.readString(Path.of("snippet-2.md"));
        assertEquals(List.of("a.com", "a.com(())", "example.com"), MarkdownParse.getLinks(contents));
    }

    @Test 
    public void testSnippet3() throws IOException {
        String contents = Files.readString(Path.of("snippet-3.md"));
        assertEquals(List.of("https://ucsd-cse15l-w22.github.io/"), MarkdownParse.getLinks(contents));
    }
}

